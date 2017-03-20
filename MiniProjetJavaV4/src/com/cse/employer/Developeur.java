/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cse.employer;

import java.util.ArrayList;
import java.util.Scanner;
import mini.projet_emergence_des_concepts_objet_en_java.Personne;

/**
 *
 * @author Sergio.COURTOIS
 */
public class Developeur extends Employe{

    public Developeur(String nomUser,String prenomUser ,String dateNaissanceUser) {
        this.nom = nomUser;
        this.prenom = prenomUser;
        this.dateNaissance = dateNaissanceUser;
    }
    
    public static Developeur createDev( Scanner enter ,ArrayList<Personne> listStaff){
        
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre prénom : \n ---------------------------");
        String nomUser = enter.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre nom : \n ---------------------------");
        String prenomUser = enter.nextLine();
        System.out.println(" \n ---------------------------  \n Veuillez saisir votre date de naissance : \n ---------------------------");
        String dateNaissanceUser = enter.nextLine();
        
        Developeur myUser = new Developeur(nomUser,prenomUser,dateNaissanceUser);
        listStaff.add(myUser);
        return myUser;
    }
    
}
