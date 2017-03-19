/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.projet_emergence_des_concepts_objet_en_java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sergio.courtois
 */
public class Superadmin extends Admin {
    
    private int lvl_privilege;
    
    public Superadmin(int lvl_privilege, String nomUser, String prenomUser, String dateNaissanceUser,ArrayList messagelist, ArrayList friendlist) {
        super(lvl_privilege,nomUser, prenomUser, dateNaissanceUser, messagelist, friendlist);
        
    }
    
    public static User createSuperAdmin(Scanner sc, ArrayList<User> userlist ) {       
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre prénom : \n ---------------------------");
        String firstName = sc.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre nom : \n ---------------------------");
        String lastName = sc.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre date de naissance : \n ---------------------------");
        String birthDate = sc.nextLine();
        ArrayList<Message> messagelist = new ArrayList<Message>();
        ArrayList<User> friendlist = new ArrayList<User>();
        
      
        Admin myAdmin = new Admin( 3 , firstName , lastName , birthDate, messagelist, friendlist);
        return myAdmin;
    }
    public void effacerAutreUser(Scanner sc , ArrayList<User> userlist ) {       
        System.out.println(" \n ---------------------------  \n selectionner un utilisateur \n ---------------------------");
        int userChoice = sc.nextInt();
        sc.nextLine();
        userlist.remove(userChoice);
        
}

    

    
}
