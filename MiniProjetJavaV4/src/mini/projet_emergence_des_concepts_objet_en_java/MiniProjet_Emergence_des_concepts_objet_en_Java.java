/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.projet_emergence_des_concepts_objet_en_java;
//Ceci importe la classe Scanner du package java.util
import com.cse.employer.Developeur;
import com.cse.employer.Directeur;
import com.cse.employer.Employe;
import com.cse.employer.Marketeur;
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
import java.util.*;

/**
 *
 * @author sergio.courtois
 */
public class MiniProjet_Emergence_des_concepts_objet_en_Java {
    //Attribut
    public static ArrayList<Personne> listUser = new ArrayList<>();
    public static ArrayList<Personne> listStaff = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
      
        Scanner enter = new Scanner(System.in);
    // Choix d'admin
       
        boolean create_continu = true;
        int choixV=0;
        
    //
        Menu act_menu = new Menu(); 
      // Creer un admin ou un User
      while (create_continu == true){
          System.out.println(" --------------------------- \n Voulez vous créer un nouvel utilisateur \n 1 pour oui \n 2 pour non \n---------------------------");
            int choixU = enter.nextInt();
            enter.nextLine();
         
            if ( choixU  != 2 ){
                
                System.out.println(" --------------------------- \n faite vous parti du staff \n 1 pour oui \n 2 pour non \n---------------------------");
                choixV = enter.nextInt();
                enter.nextLine();
                if ( choixV  != 1 ){
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
                    System.out.println(" --------------------------- \n Quel est votre role \n 1 pour dev \n 2 pour marketer \n 3 pour directeur \n---------------------------");
                    String rolechoice = enter.nextLine();
                    switch (rolechoice) {
                        case "2":
                        {
                            Developeur utilisateurActuel = Developeur.createDev(enter, listStaff);
                        
                            break;
                        }
                        case "3":
                        {
                            Directeur utilisateurActuel = Directeur.createDir( enter , listStaff);
                        
                            break;
                        }
                        default:
                        {
                            Marketeur utilisateurActuel = Marketeur.createMark( enter , listStaff);
                        
                            break;
                        }  
                    }
                }
            }
            
            else{
                create_continu = false;
                Personne userSel;
                if(choixV == 2){
                    userSel =  User.selectUser( enter ,  listUser);
                }
                else{
                    userSel = Employe.selectUser( enter ,  listStaff );
                }
                act_menu.display(enter ,userSel ,listStaff);
                
            }
      }
        
    }
    
}
