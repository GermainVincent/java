package reseau_social;

import java.util.ArrayList;

public class Utilisateur {
    private String nom;
    private String prenom;
    private Integer anneeNaissance;
    ArrayList messages;
    ArrayList amis; 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(Integer anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public ArrayList getMessages() {
        return messages;
    }

    public void setMessages(ArrayList messages) {
        this.messages = messages;
    }

    public ArrayList getAmis() {
        return amis;
    }

    public void setAmis(ArrayList amis) {
        this.amis = amis;
    }
    
}
