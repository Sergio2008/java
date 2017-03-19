/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.projet_emergence_des_concepts_objet_en_java;

/**
 *
 * @author sergio.courtois
 */
public class UserVideExeption extends Exception{
    
    public UserVideExeption(){
    System.out.println("Vous essayez de creer un utilisateur avec des caracteristique vide!");
  }
    
}
