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



public class Admin extends User {
    
// ---------- Attribut ---------
   
    
  private int lvl_privilege;

// ---------- Constructeur ----------
  
public Admin(int lvl_privilege, String nomUser, String prenomUser, String dateNaissanceUser,ArrayList messagelist, ArrayList friendlist) {
    super(nomUser, prenomUser, dateNaissanceUser, messagelist, friendlist);
    this.lvl_privilege = lvl_privilege;
}
// ---------- Methode ----------
public static int Check_Adm( Scanner sc) {
    int adm_choice=  0 ;
    while(adm_choice!=1 && adm_choice!=2 && adm_choice!=3){
        
        System.out.println(" --------------------------- \n Etes vous un Admin Taper \n --------------------------- \n /1/ pour non \n ---------------------------\n /2/pour un admin de niveau 1\n ---------------------------\n /3/pour un admin de niveau 2\n ---------------------------");
       
        try{adm_choice = sc.nextInt();}
        catch(Exception e){System.out.println("Entrer un nombre");}
        sc.nextLine();
        
    }
   
   return adm_choice;
}
public static String deleteMessage(Scanner sc) {
    
        return "ce message à été supprimer";
}

public static User createAdmin(Scanner sc , ArrayList<User> userlist ) {       
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre prénom : \n ---------------------------");
        String firstName = sc.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre nom : \n ---------------------------");
        String lastName = sc.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre date de naissance : \n ---------------------------");
        String birthDate = sc.nextLine();
        ArrayList<Message> messagelist = new ArrayList<>();
        ArrayList<User> friendlist = new ArrayList<>();
        
      
          Admin myAdmin = new Admin( 2 , firstName , lastName , birthDate,messagelist ,friendlist);
          userlist.add(myAdmin);
          return myAdmin;
}
public void effacerAutreMessage(Scanner sc , ArrayList<User> userlist ) {       
        System.out.println(" \n ---------------------------  \n selectionner un utilisateur \n ---------------------------");
        int userChoice = sc.nextInt();
        sc.nextLine();
        System.out.println(" \n ---------------------------  \n selectionner un message \n ---------------------------");
        int messageChoice = sc.nextInt();
        sc.nextLine();
        User selUser = userlist.get(userChoice);
        selUser.getMessagelist().remove(userChoice);
        
}



// ---------- Getter et setter ----------
  @Override
  public int getLvl_privilege() {
    return lvl_privilege;
}

public void set_privilege_to_two() {
    this.lvl_privilege = 2;
}

public void set_privilege_to_one() {
    this.lvl_privilege = 1;
}
  
 

    
}
