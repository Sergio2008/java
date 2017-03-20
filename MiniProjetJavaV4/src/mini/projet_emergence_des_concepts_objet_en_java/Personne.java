/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.projet_emergence_des_concepts_objet_en_java;

/**
 *
 * @author Sergio.COURTOIS
 */
public abstract class Personne {
    protected String nom;
    protected String prenom ;
    protected String dateNaissance;
    
    public void afficheUser() {   
    System.out.println(" \n ---------------------------  \n afficher votre profil \n ---------------------------" );
    System.out.println(this.getPrenomUser()+" "+this.getNomUser()+" "+this.getDateNaissanceUser() );         
    }   
    
    public String getNomUser() {
        return nom;
    }
    public String getPrenomUser() {
        return prenom;
    }
    public String getDateNaissanceUser() {
        return dateNaissance;
    }
    public void setNomUser(String nomUser) {
        this.nom = nomUser;
    }
    public void setPrenomUser(String prenomUser) {
        this.prenom = prenomUser;
    }
    public void setDateNaissanceUser(String dateNaissanceUser) {
        this.dateNaissance = dateNaissanceUser;
    }
    
}
    


