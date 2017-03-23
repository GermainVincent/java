/** @author Germain */
/** @version 3.0 */
      
package reseau_social;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/** Déclaration de la classe principale "reseau_social" */
public class reseau_social {
               
    /** *  @param args Méthode principale permettant de réaliser des fonctions */
    public static void main(String[] args) {
        
        /** Déclaration du scanner afin de récupérer des données saisies au clavier" */
        Scanner monScanner = new Scanner(System.in);
        
        /** Déclaration des différentes variables */
        String ouiOuNon;
        int choice;
        char choice2;
        Utilisateur user1;
        Utilisateur user;
        Menu menu = new Menu();
        Employe travailleur;
        Personne toto;
 
        
        System.out.println("Bonjour et bienvenue sur le site code-closet");
        
            user1 = menu.createProfil();
            
            do {
            System.out.println("Souhaitez-vous ajouter un utilisateur? o/n");
            ouiOuNon = monScanner.nextLine();
            choice2 = ouiOuNon.charAt(0);                   
                if (choice2 == 'o' || choice2 == 'O') {
                    user = new Utilisateur();
                    user.creerUtilisateur();
                } else {                    
                }
            } while (choice2 == 'o' ||choice2 == 'O');                
                
            System.out.println("Souhaitez-vous tester une exception?");    
            ouiOuNon = monScanner.nextLine();
            choice2 = ouiOuNon.charAt(0); 
            if (choice2 == 'o' || choice2 == 'O') { 
            System.out.println("Que se passe t'il si l'on essaie de faire une division par zéro? (20/0)");
                int j = 20, i = 0;
                try {
                    System.out.println(j/i);
                } catch (ArithmeticException e) {
            System.out.println("Le programme ne comprenant pas l'instruction demandée pour des raisons évidentes d'arithmétiques devrait planter");
            System.out.println("La gestion des exceptions nous permet d'anticiper le plantage du programme, de renvoyer la ligne de texte ci-dessous par exemple et de permettre au programme de continuer");
            System.out.println("DIVISION PAR ZÉRO INTERDITE, retour au programme !");
        }
}
            do {
                    menu.afficherMenu(user1);

                    choice = menu.navigation(user1);
                                
            } while (((user1.getClass().getName().contains ("Moderateur")) == false || choice != 10) && (((user1.getClass().getName().contains ("Utilisateur")) == false || choice != 8))); 
            
            System.out.println("Êtes-vous employé? o/n");
            
            ouiOuNon = monScanner.nextLine();
            choice2 = ouiOuNon.charAt(0);
                if (choice2 == 'o' || choice2 == 'O') {
                    travailleur = new Employe();
                    travailleur.recevoirPaiement();
                } else { 
                    System.out.println("Êtes-vous directeur ou Modérateur? o/n");
                    ouiOuNon = monScanner.nextLine();
                    choice2 = ouiOuNon.charAt(0);
                    if (choice2 == 'o' || choice2 == 'O') {     
                        toto = new Directeur();
                        
//                        Directeur d = (Directeur)toto;
//                        d.ajouterPersonne();
//                        
                        ((Directeur)toto).ajouterPersonne();
                    }
                    else
                    {
                        toto = new Moderateur();
                    }
                       ((Salarie)toto).recevoirPaiement();
            
        /** sortie du programme */
        System.out.println("Merci d'avoir utiliser mon programme!");
    }
}
}
