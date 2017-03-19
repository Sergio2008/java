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
      
        Scanner enter = new Scanner(System.in); 
        Menu act_menu = new Menu();       
        User myUser = act_menu.createUser(enter);
        
        act_menu.display(enter,act_menu.menu_continu,myUser);
        
    }
    
}
