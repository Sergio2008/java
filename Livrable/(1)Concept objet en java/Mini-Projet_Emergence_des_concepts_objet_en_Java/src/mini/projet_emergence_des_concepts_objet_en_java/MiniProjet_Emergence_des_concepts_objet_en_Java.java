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

    /**
     * @param args the command line arguments
     */
   


  public static void main(String[] args) {
        // TODO code application logic here
        
// -- debut print valeur stockée --
        
            /* 
            String firstName = "Sergio";

            String lastName = "Courtois";
            
            String birthDate = "20/08/1991";
            
            System.out.println(firstName+" "+lastName+" "+birthDate);*/
            
            // --Scanner print valeur entrée
            
            /*
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir votre prénom :");
            String firstName2 = sc.nextLine();

            
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Veuillez saisir votre nom :");
            String lastName2 = sc.nextLine();

            
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Veuillez saisir votre date de naissance :");
            String birthDate2 = sc.nextLine();
            
            System.out.println(firstName2+" "+lastName2+" "+birthDate2);
            */
// fin  print valeur stockée  


            // -- Scanner print valeur entrée avec boucle--

/* --debut Scanner print valeur entrée avec boucle --
            ArrayList<User> userslist = new ArrayList<User>();
            
            int will_continu = 0;
            
            while ( will_continu == 0){
                
                int numeroUser = 0;
  
            
                Scanner enter = new Scanner(System.in);
                System.out.println("Veuillez saisir votre prénom :");
                String firstName = enter.nextLine();
                System.out.println("Veuillez saisir votre nom :");
                String lastName = enter.nextLine();
                System.out.println("Veuillez saisir votre date de naissance :");
                String birthDate = enter.nextLine();
            
                
            
            
                User nbUser = new User( firstName , lastName , birthDate);
                
                
            
                userslist.add(nbUser);
                
                
                        
                System.out.println();
            
                numeroUser = numeroUser++;
            
                Scanner continu = new Scanner(System.in);
                System.out.println("M/Mme"+ nbUser.getPrenomUser().toString()+" Si vous voulez quittez entrer oui sinon entrer autre chose");
                String continu_result = continu.nextLine();
            
            
            
                if ( continu_result.equals("oui")){
                will_continu = will_continu + 1;
                }
                System.out.println(userslist); 
            
            
            
            }
            */
            
// fin -- Scanner print valeur entrée
        
    }
    
}
