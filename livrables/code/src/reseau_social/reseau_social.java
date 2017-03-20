/** @author Germain */
/** @version 1.0 */
/** @see ami.java */
/** @see Utilisateur.java */
      
package reseau_social;

/** Import de l'utilitaire "ArrayList" permettant de compiler des données dans un tableau */
import java.util.ArrayList;

/** Import de l'utilitaire "scanner" permettant de récupérer des données saisies au clavier */
import java.util.Scanner;

/** Déclaration de la classe principale "reseau_social" */
public class reseau_social {
    
    /** @param args Méthode principale permettant de réaliser des fonctions */
    public static void main(String[] args) {
        
        /** Déclaration des différentes variables */
        String nom;
        String prenom;
        int anneeNaissance;
        int choix;
        int numMessage;
        int numUtilisateur;
        String ouiOuNon;
        char choix2;
        int numAmi;
        String prenomAmi;
        String nomAmi;
        String stringTab;
        int userCount;
        userCount = 0;
        
        /** Déclaration du tableau permettant de stocker les messages */
        ArrayList<String> messages = new ArrayList();
        
        /** Déclaration du tableau permettant de stocker la liste d'amis */
        ArrayList<Ami> amis = new ArrayList();
        
        /** Déclaration du tableau permettant de stocker la liste d'utilisateurs */
        ArrayList<Utilisateur> utilisateurs = new ArrayList();
        
        /** Déclaration du scanner afin de récupérer des données saisies au clavier" */
        Scanner monScanner = new Scanner(System.in);
        
        System.out.println("Bonjour et bienvenue sur le site code-closet");
        System.out.println("Veuillez s'il vous plait compléter les informations de connexions ci-dessous");
                  
        /** Création d'un nouvel utilisateur */
        userCount ++;
        Utilisateur nouvelUtilisateur = new Utilisateur();
        
        /** Récupération du nom saisi par l'utilisateur */
        System.out.println("Nom: ");
        nouvelUtilisateur.setNom(monScanner.nextLine());
        
        /** Récupération du prénom saisi par l'utilisateur */
        System.out.println("Prénom: ");
        nouvelUtilisateur.setPrenom(monScanner.nextLine());
        
        /** Récupération de l'année de naissance */
        System.out.println("Année de naissance: ");
        nouvelUtilisateur.setAnneeNaissance(monScanner.nextInt()); monScanner.nextLine();        
        
        /** Affichage des données récupérées */
        System.out.println("Bonjour " + nouvelUtilisateur.getPrenom() + " " + nouvelUtilisateur.getNom() + ", né en " + nouvelUtilisateur.getAnneeNaissance());
             
        /** Boucle permettant à l'utilisateur de revenir au menu tant qu'il le souhaite" */
        do {
        System.out.println("");
        System.out.println("Que souhaitez-vous faire maintenant?");
        System.out.println("1) Afficher votre profil");
        System.out.println("2) Modifier vos infos personelles");
        System.out.println("3) Écrire un message");
        System.out.println("4) Afficher un message");
        System.out.println("5) Ajouter un ami");
        System.out.println("6) Afficher le nom d'un ami");
        System.out.println("7) Ajouter un utilisateur");
        System.out.println("8) Afficher un utilisateur");
        
        /** Récupération du choix saisi par l'utilisateur */
        choix = monScanner.nextInt(); monScanner.nextLine();

            /** switch pour naviguer entre les différentes options du tableau */
            switch (choix) {
            
                /** case 1 : afficher le profil */
                case 1 :
                    System.out.println("");
                    System.out.println("Prénom: " + nouvelUtilisateur.getPrenom());
                    System.out.println("Nom: " + nouvelUtilisateur.getNom());
                    System.out.println("Année de naissance: " + nouvelUtilisateur.getAnneeNaissance());
                    System.out.println("");
                break;
                
                /** case 2 : modifier le profil */
                case 2 :
                    System.out.println("");
                    System.out.println("Nom: ");
                    nouvelUtilisateur.setNom(monScanner.nextLine());
                    System.out.println("Prénom: ");
                    nouvelUtilisateur.setPrenom(monScanner.nextLine());
                    System.out.println("Année de naissance: ");
                    nouvelUtilisateur.setAnneeNaissance(monScanner.nextInt()); monScanner.nextLine();
                    System.out.println("");
                break;
                    
                /** case 3 : ajout d'un message */ 
                case 3 :
                    System.out.println("");
                    System.out.println("Veuillez saisir votre message:");
                    messages.add(monScanner.nextLine());
                    System.out.println("");
                break;
                
                /** case 4 : afficher un message */
                case 4 :
                    System.out.println("");
                    System.out.println("Veuillez saisir le numéro du message que vous souhaitez afficher");
                    numMessage = monScanner.nextInt(); monScanner.nextLine();
                    System.out.println(messages.get(numMessage));
                    System.out.println("");  
                break;
                
                /** case 5 : ajouter un ami */
                case 5 :
                    System.out.println("");
                    System.out.println("Quel est le nom de votre ami?");
                    nomAmi = monScanner.nextLine();
                    System.out.println("Quel est le prénom de votre ami?");
                    prenomAmi = monScanner.nextLine();
                    Ami nouvelAmi = new Ami(nomAmi, prenomAmi);
                    amis.add(nouvelAmi);
                    System.out.println("Votre ami se nomme: " + nouvelAmi.getFriendFirstName() + " " + nouvelAmi.getFriendLastName());
                    System.out.println("");
                break;
                
                /** case 6 : afficher un ami */
                case 6 :
                    System.out.println("");
                    System.out.println("Veuillez saisir le numéro de l'ami dont vous souhaitez afficher le profil");
                    numAmi = monScanner.nextInt(); monScanner.nextLine();
                    System.out.println(amis.get(numAmi).getFriendFirstName() + " " + amis.get(numAmi).getFriendLastName());
                break;
                
                /** Ajout d'un nouvel utilisateur */
                case 7 :
                    userCount ++;
                    System.out.println("");
                    System.out.println("Veuillez saisir le nom de l'utilisateur à ajouter");
                    nouvelUtilisateur.setNom(monScanner.nextLine());
                    System.out.println("Prénom: ");
                    nouvelUtilisateur.setPrenom(monScanner.nextLine());
                    System.out.println("Année de naissance: ");
                    nouvelUtilisateur.setAnneeNaissance(monScanner.nextInt()); monScanner.nextLine();
                    utilisateurs.add(nouvelUtilisateur);
                    System.out.println("vous avez ajouté: " + nouvelUtilisateur.getPrenom() + " " + nouvelUtilisateur.getNom() + " " + "né en " + nouvelUtilisateur.getAnneeNaissance());
                    System.out.println("");
                break;
                
                /** Affichage d'un utilisateur */
                case 8 :
                    System.out.println("Veuillez saisir le numéro de l'utilisateur");
                    numUtilisateur = monScanner.nextInt(); monScanner.nextLine();
                    System.out.println(utilisateurs.get(numUtilisateur).getPrenom() + " " +  utilisateurs.get(numUtilisateur).getNom() + ", né en " + utilisateurs.get(numUtilisateur).getAnneeNaissance());
                break;    
           
            }
            
            /** Redirection vers le menu ou fin de programme */
            System.out.println("Souhaitez-vous revenir au menu? (O/N)");
            ouiOuNon = monScanner.nextLine();
            choix2 = ouiOuNon.charAt(0);
     
        } while (choix2 == 'o' || choix2 == 'O');

        /** sortie du programme */
        System.out.println("Merci d'avoir utiliser mon programme!");

    }
}
