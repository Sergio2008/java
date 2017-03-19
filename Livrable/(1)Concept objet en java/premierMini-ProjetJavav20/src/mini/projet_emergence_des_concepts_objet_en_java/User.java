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
public class User {
    
    //attribut  
    
    private String nomUser;

    private String prenomUser;

    private String dateNaissanceUser;
    
    // construcetur
    
    public User(String nomUser, String prenomUser, String dateNaissanceUser) {
        this.nomUser = nomUser;
        this.prenomUser = prenomUser;
        this.dateNaissanceUser = dateNaissanceUser;
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
  
}
