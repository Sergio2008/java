/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cse.employer;


import com.cse.remuneration_.bonDachat;
import com.cse.interface_.Salarie;
import java.util.ArrayList;
import java.util.Scanner;
import mini.projet_emergence_des_concepts_objet_en_java.Personne;

/**
 *
 * @author Sergio.COURTOIS
 */
public class Employe extends Personne implements Salarie {
    protected int salaire ;
    protected int tps_contract ;  
        
    public void  travailler(){
    
     System.out.println(" Je fais ce que je peut ");
    }

    @Override
    public void etre_payer() {
              System.out.println("je suis Employé et je recois un salaire");
  
    }
    public static Personne selectUser( Scanner sc ,  ArrayList<Personne> listStaff ) {   
        System.out.println("\n ---------------------------  \n Entrez le numero de votre user ------");          
        int select = sc.nextInt(); 
        sc.nextLine();
        Personne  thisUser = listStaff.get(select);

        return thisUser;
      
}
    
    
}
