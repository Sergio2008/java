/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.projet_emergence_des_concepts_objet_en_java;
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
import java.util.*;

/**
 *
 * @author sergio.courtois
 */
public class MiniProjet_Emergence_des_concepts_objet_en_Java {
    //Attribut
    public static ArrayList<User> listUser = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
      
        Scanner enter = new Scanner(System.in);
    // Choix d'admin
       
        boolean create_continu = true;
        
    //
        Menu act_menu = new Menu(); 
      // Creer un admin ou un User
      while (create_continu == true){
          System.out.println(" --------------------------- \n Voulez vous créer un nouvel utilisateur \n 1 pour oui \n 2 pour non \n---------------------------");
            int choixU = enter.nextInt();
            enter.nextLine();
         
            if ( choixU  != 2 ){
                int adm_choice = Admin.Check_Adm( enter );
                switch (adm_choice) {
                    case 2:
                    {
                        Admin utilisateurActuel = (Admin) Admin.createAdmin(enter, listUser);
                        
                        break;
                    }
                    case 3:
                    {
                        Superadmin utilisateurActuel = (Superadmin) Superadmin.createSuperAdmin( enter , listUser);
                        
                        break;
                    }
                    default:
                    {
                        User utilisateurActuel =User.createUser( enter , listUser);
                        
                        break;
                    }  
                }
            }
            else{
            create_continu = false;
            User userSel =  User.selectUser( enter ,  listUser);
            act_menu.display(enter ,userSel ,listUser);
            }
      }
        
    }
    
}
