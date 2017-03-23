package reseau_social;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/** Création de la classe "Utilisateur" héritant de la classe "Personne" et de l'interface "Relation" */
    public class Utilisateur extends Personne implements Relation {
    protected String pseudo;
    protected HashMap<Integer, String> messages = new HashMap<>();
    protected ArrayList<Utilisateur> usersList = new ArrayList<>();
    protected ArrayList amis;
    private String message;
    String ouiOuNon;
    int suppr;
    int index = 0;
    int i = 0;
    Utilisateur u;

    
    /** Création du scanner permettant de récupérer les saisies clavier */
    Scanner monScanner = new Scanner(System.in);
        
    public void creerUtilisateur() {
        
        System.out.println("Nom: ");
        nom = monScanner.nextLine();
                
        System.out.println("Prénom: ");
        prenom = monScanner.nextLine();
        
        System.out.println("Année de naissance: ");
        anneeNaissance = monScanner.nextInt(); monScanner.nextLine();
                    
        System.out.println("Pseudo: ");
        pseudo = monScanner.nextLine();
    }
        
    public HashMap afficherMessages() {
        System.out.println(messages);
    return messages;    
    }
        
    public String ecrireMessage() {
        System.out.println("Veuillez rédiger votre message: ");
        message = monScanner.nextLine();
        index ++;
        messages.put(index, message);
    return message;
    }
  
    public void supprimerMessage() {
      System.out.println("Souhaitez-vous afficher la liste de vos messages afin d'obtenir leurs index? o/n");
        String ouiOuNon = monScanner.nextLine();
        char choice = ouiOuNon.charAt(0);
            if (choice == 'o' || choice == 'O') {
                afficherMessages();
            } else {
                System.out.println("Veuillez indiquer le numéro du message que vous souhaitez supprimer");  
                suppr = monScanner.nextInt(); monScanner.nextLine();
                messages.remove(suppr);
            }            
    }
                     
    public void afficherUtilisateur() {
        for (i = 0; i <= usersList.size(); i++) {
        System.out.println(usersList);
        System.out.println("Prénom: " + usersList.get(i).getPrenom());
        System.out.println("Nom: " + usersList.get(i).getNom());
        System.out.println("Année de naissance: " + usersList.get(i).getAnneeNaissance());
        System.out.println("Pseudo: " + usersList.get(i).getPseudo());
        }
    }

    /**
     *
     */
    @Override
    public void ajouterPersonne() {

    }
      
    /** Getter et setter
     * @return  */
    protected String getPseudo() {
        return pseudo;
    }
    
    protected void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public HashMap getMessages() {
        return messages;
    }

    public void setMessages(HashMap messages) {
        this.messages = messages;
    }

    public ArrayList getAmis() {
        return amis;
    }

    public void setAmis(ArrayList amis) {
        this.amis = amis;
    }

    public ArrayList<Utilisateur> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<Utilisateur> usersList) {
        this.usersList = usersList;
    }    
    /** Fin getter et setter */
    
    public void seConnecter()
    {
        System.out.print("connexion");
    }
    public void seDeconnecter()
    {
        System.out.print("connexion");
    }
    }
