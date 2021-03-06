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
public class User {
    
    //attribut
    ArrayList <Message> messagelist;
    
    ArrayList <User> friendlist;
    
    private String nomUser;

    private String prenomUser;

    private String dateNaissanceUser;
    
    private int lvl_privilege;

    
    // construcetur
    
    


public User(String nomUser, String prenomUser, String dateNaissanceUser, ArrayList messagelist, ArrayList friendlist) {
    
    this.nomUser = nomUser;
    this.prenomUser = prenomUser;
    this.dateNaissanceUser = dateNaissanceUser;
    this.messagelist = messagelist;
    this.friendlist = friendlist;
    this.lvl_privilege = 1 ;
}
public User(String nomUser, String prenomUser, String dateNaissanceUser) {
    
    this.nomUser = nomUser;
    this.prenomUser = prenomUser;
    this.dateNaissanceUser = dateNaissanceUser;
    this.lvl_privilege = 1 ;
  
}
// Methode
public static User createUser(Scanner sc , ArrayList<User> userlist) {       
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre prénom : \n ---------------------------");
        String firstName = sc.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre nom : \n ---------------------------");
        String lastName = sc.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre date de naissance : \n ---------------------------");
        String birthDate = sc.nextLine();
        ArrayList<Message> messagelist = new ArrayList<>();
        ArrayList<User> friendlist = new ArrayList<>();
        
        User myUser = new User(  lastName, firstName , birthDate ,messagelist, friendlist);
        userlist.add(myUser);
        return myUser;
}

public User createFriend(Scanner sc, ArrayList<User> userlist ) {       
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre prénom : \n ---------------------------");
        String firstName = sc.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre nom : \n ---------------------------");
        String lastName = sc.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre date de naissance : \n ---------------------------");
        String birthDate = sc.nextLine();
        
        
        User myFriend = new User( firstName , lastName , birthDate);
        this.friendlist.add(myFriend);
         userlist.add(myFriend);
        
        return myFriend;
}

public void afficheUser() {   
    System.out.println(" \n ---------------------------  \n afficher votre profil \n ---------------------------" );
    System.out.println(this.getPrenomUser()+" "+this.getNomUser()+" "+this.getDateNaissanceUser() );    
      
}
public void afficheUnAmi(Scanner sc) {   
    System.out.println("\n ---------------------------  \n Afficher un Ami \n ---------------------------");
    System.out.println("\n ---------------------------  \n Choissssez le numero du cet Ami \n ---------------------------");
    int who = sc.nextInt();
    sc.nextLine();
    System.out.println("\n ---------------------------  \n vos etes ami avec "+this.friendlist.get(who).getNomUser()+this.friendlist.get(who).getPrenomUser()+this.friendlist.get(who).getDateNaissanceUser()+"\n bonne chance vous en aez besoin \n ---------------------------");   
      
}
         
public void afficheAmi() {   
    int i = 0;
    for( User myFriend : this.friendlist) {
    System.out.println(myFriend+" "+i);
    ++i;
}    
      
}

public void editUser( Scanner sc) {   
    System.out.println("\n ---------------------------  \n modifier votre profil Veuillez saisir votre nouveau prenom : \n ---------------------------");          
    String newfirstName = sc.nextLine();
    System.out.println(" \n ---------------------------  \n Veuillez saisir votre nouveau nom : \n ---------------------------");
    String newlastName = sc.nextLine();
    System.out.println("\n ---------------------------  \n Veuillez saisir votre nouvelle date de naissance : \n ---------------------------");
    String newbirthDate = sc.nextLine();
    this.setPrenomUser(newfirstName);
    this.setNomUser(newlastName);
    this.setDateNaissanceUser(newbirthDate);
    System.out.println(this.getNomUser()+" "+this.getPrenomUser()+" "+this.getDateNaissanceUser());   
      
}
public static User selectUser( Scanner sc ,  ArrayList<User> userlist ) {   
    System.out.println("\n ---------------------------  \n Entrez le numero de votre user ------");          
    int select = sc.nextInt(); 
    sc.nextLine();
    User  thisUser = userlist.get(select);
    return thisUser;
      
}

   

// getter/setter
    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getDateNaissanceUser() {
        return dateNaissanceUser;
    }

    public void setDateNaissanceUser(String dateNaissanceUser) {
        this.dateNaissanceUser = dateNaissanceUser;
    }
    public ArrayList getMessagelist() {
        return messagelist;
    }

    public void setMessagelist(ArrayList messagelist) {
        this.messagelist = messagelist;
    }

    public ArrayList getFriendlist() {
        return friendlist;
    }

    public void setFriendlist(ArrayList friendlist) {
        this.friendlist = friendlist;
    }

    public int getLvl_privilege() {
        return lvl_privilege;
    }

    public void setLvl_privilege(int lvl_privilege) {
        this.lvl_privilege = lvl_privilege;
    }
  
}
