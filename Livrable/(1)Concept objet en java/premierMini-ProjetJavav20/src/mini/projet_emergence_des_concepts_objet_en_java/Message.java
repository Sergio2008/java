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
public class Message{
    
    // Attributs
    private String receiver;
    private String content;

    // Constructeur
    public Message(String op1,String op2) {   
        this.receiver = op1 ;
        this.content = op2;
    }
    
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    

    
    
}
