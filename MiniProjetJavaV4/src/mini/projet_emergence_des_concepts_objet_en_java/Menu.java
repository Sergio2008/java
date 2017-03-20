/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.projet_emergence_des_concepts_objet_en_java;

import com.cse.employer.Directeur;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sergio.courtois
 */
public class Menu {
    
    // Attributs 
    private boolean menu_continu;

    public boolean isMenu_continu() {
        return menu_continu;
    }

    public void setMenu_continu(boolean menu_continu) {
        this.menu_continu = menu_continu;
    }
    
    
    
    // Constructeurs
    public Menu(){    
            
        this.menu_continu = true;
    }
    
    // Methodes 
    /** 
    * Créer le profils del'utilsateur courant 
    * 
    *@param sc 
    *   Scanner qui permet de recuperer des donné
    *@return myUser
    *   L'utilisateur actuelle de l'application.
    *@since 
    *   v1.0
    */

    /** 
    * Affiche le menu
    * 
    *@param sc 
    *   Scanner qui permet de recuperer des donné
    * @param  myUser 
    *   utilisateur actuel
    * * @param  userlist
    *   liste de tous les utilisateur
    *@since 
    *   v1.0
    */
    public void display(Scanner sc, Personne myUser , ArrayList<Personne> userlist ) {     
        while (this.isMenu_continu()  == true){
            System.out.println(" --------------------------- \n MENU taper "
                    + "\n ---------------------------  \n /1/ pour afficher votre profil \n /2/ pour le modifier \n"
                    + " /3/ pour écrire un message \n /4/ pour lister vos message \n "
                    + "/5/ ajouter un ami \n /6/ afficher un ami \n /7/ Quitter \n /8/Créer un nouvelle utilisateur \n "
                    + "\n /9/ Effacer un message qui ne vous appartient pas (admin) \n "
                    + "/10/ Effacer un User(Super Admin) \n ---------------------------");
            int choix = sc.nextInt();
            sc.nextLine();
            switch (choix)
            {
                case 1:
                    ((User)myUser).afficheUser();
                    break;
                    
                case 2:
                    ((User)myUser).editUser( sc );
                    break;
                    
                case 3:
                    Message.writeMessage(((User)myUser) ,sc);
                    break;
                    
                case 4:
                    Message.afficheMessage(((User)myUser) ,sc);
                    break;
                    
                    
                case 5:
                    ((User)myUser).createFriend( sc , userlist) ;
                    break;

                case 6:
                    ((User)myUser).afficheUnAmi(sc );
                    break;

                case 7:
                    System.out.println("\n ---------------------------  \n exit \n --------------------------- ");
                    this.setMenu_continu(false);
                    break;
                case 8:
                    
                    System.out.println("\n ---------------------------  \n Créer un nouvel utilisateur \n --------------------------- ");
                    User.createUser(sc, userlist);
                    break;
                case 9:
                    
                    if( ((User)myUser).getLvl_privilege() > 1 ){
                    System.out.println("\n ---------------------------  \n Effacer un message (Admin Uniquement) \n --------------------------- ");
                    ((Admin)myUser).effacerAutreMessage(sc,userlist); 
                    }else{
                    Menu.erreur(sc);
                    }
                    break;
                case 10:
                    
                    if (((User)myUser).getLvl_privilege() > 2){
                    System.out.println("\n ---------------------------  \n Effacer un User (SuperAdmin Uniquement)\n --------------------------- ");
                    
                     ((Superadmin)myUser).effacerAutreUser(sc,userlist); 
                    }
                    else{
                        Menu.erreur(sc);
                    }
                    
                    break;
                    case 11:
                    
                    // ((Admin)myUser).etre_payer();
                    
                    
                    
                    break;
                    case 12:
                    
                    // ((Directeur)myUser).etre_payer();
                    
                    break;

                default:
                    Menu.erreur(sc);
                    
                break;
            }
        }   
    }
  public static void erreur(Scanner sc) {  
    System.out.println("\n ---------------------------  \n"+ sc +" ne faisait pas parti des possbilité \n ---------------------------  \n");
  }
}
