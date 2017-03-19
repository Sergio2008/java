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
public class Menu {
    
    // Attributs 
    public boolean menu_continu;
    public ArrayList<Message> messagelist; 
    public ArrayList<User> friendlist;
    
    
    // Constructeurs
    public Menu(){    
        messagelist = new ArrayList<>();   
        friendlist = new ArrayList<>();    
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
    public User createUser(Scanner sc) {       
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre prénom : \n ---------------------------");
        String firstName = sc.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre nom : \n ---------------------------");
        String lastName = sc.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre date de naissance : \n ---------------------------");
        String birthDate = sc.nextLine();
        User myUser = new User( firstName , lastName , birthDate);
        return myUser;
    }
    

    
    public void display(Scanner sc, Boolean continu, User myUser ) {     
        while (continu == true){
            System.out.println(" --------------------------- \n MENU taper \n ---------------------------  \n /1/ pour afficher votre profil \n /2/ pour le modifier \n /3/ pour écrire un message \n /4/ pour lister vos message \n /5/ ajouter un ami \n /6/ afficher un ami \n /7/ Quitter \n ---------------------------");
            int choix = sc.nextInt();
            sc.nextLine();
            switch (choix)
            {
                case 1:
                    System.out.println(" \n ---------------------------  \n afficher votre profil \n ---------------------------" );
                    System.out.println(myUser.getPrenomUser()+" "+myUser.getNomUser()+" "+myUser.getDateNaissanceUser() );
                    break;
                    
                case 2:
                    System.out.println("\n ---------------------------  \n modifier votre profil Veuillez saisir votre nouveau prenom : \n ---------------------------");          
                    String newfirstName = sc.nextLine();
                    System.out.println(" \n ---------------------------  \n Veuillez saisir votre nouveau nom : \n ---------------------------");
                    String newlastName = sc.nextLine();
                    System.out.println("\n ---------------------------  \n Veuillez saisir votre nouvelle date de naissance : \n ---------------------------");
                    String newbirthDate = sc.nextLine();
                    myUser.setPrenomUser(newfirstName);
                    myUser.setNomUser(newlastName);
                    myUser.setDateNaissanceUser(newbirthDate);
                    System.out.println(myUser.getNomUser()+" "+myUser.getPrenomUser()+" "+myUser.getDateNaissanceUser());
                    break;
                case 3:
                    System.out.println("\n ---------------------------  \n Ecriver votre message \n ---------------------------");
                    String newmessage = sc.nextLine();
                    System.out.println("\n ---------------------------  \n A qui souhaitez vou l'envoyer \n ---------------------------");
                    String newreceive = sc.nextLine();
                    Message myMessage = new Message( newreceive , newmessage);
                    this.messagelist.add(myMessage);
                    System.out.println(messagelist);
                    break;
                    
                case 4:
                    System.out.println("\n ---------------------------  \n Aficher un message choissssez le numero du message \n ---------------------------");
                    int choixMessage = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\n ---------------------------  \n message numero "+choixMessage +" "+this.messagelist.get(choixMessage).getContent()+"\n ---------------------------");
                    break; 
                    
                case 5:
                    
                    System.out.println("\n ---------------------------  \n ajouter un ami Veuillez saisir son prénom : \n ---------------------------");
                    String friendFirstName = sc.nextLine();
                    System.out.println("\n ---------------------------  \n Veuillez saisir son nom : \n ---------------------------");
                    String friendLastName = sc.nextLine();
                    System.out.println("\n ---------------------------  \n Veuillez saisir sa date de naissance : \n ---------------------------");
                    String friendBirthDate = sc.nextLine();
                    User myFriend = new User( friendFirstName , friendLastName , friendBirthDate);
                    this.friendlist.add(myFriend);
                    System.out.println(myFriend.getNomUser()+" "+myFriend.getPrenomUser()+" "+myFriend.getDateNaissanceUser()+" est l'ami numero "+friendlist.size());
                    break;

                case 6:
                    System.out.println("\n ---------------------------  \n Afficher un Ami \n ---------------------------");
                    System.out.println("\n ---------------------------  \n Choissssez le numero du cet Ami \n ---------------------------");
                    int who = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\n ---------------------------  \n vos etes ami avec "+this.friendlist.get(who-1).getNomUser()+this.friendlist.get(who-1).getPrenomUser()+this.friendlist.get(who).getDateNaissanceUser()+"\n bonne chance vous en aez besoin \n ---------------------------");
                    break;

                case 7:
                    System.out.println("\n ---------------------------  \n exit \n --------------------------- ");
                    continu = false;
                    break;

                default:
                    System.out.println("\n ---------------------------  \n ce ne faisat pas parti des possbilité \n ---------------------------  \n"+ sc);
                    continu = false;
                break;
            }
        }   
    }
}
