package reseau_social;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    int count = 0;
    
    private final ArrayList<Utilisateur> profilList;  
    Scanner monScanner = new Scanner(System.in);   

    public Menu() {
        this.profilList = new ArrayList<>();
    }

    public void afficherMenu(Utilisateur user) {
        System.out.println("");
        System.out.println("Que souhaitez-vous faire?");
        System.out.println("1) Afficher votre profil");
        System.out.println("2) Modifier votre profil");
        System.out.println("3) Écrire un message");
        System.out.println("4) Afficher les messagess");
        System.out.println("5) Supprimer un message");
        System.out.println("6) Ajouter un ami");
        System.out.println("7) Afficher le nom d'un ami");
        if ((user.getClass().getName().contains ("Moderateur")) == true)
        {
            System.out.println("8) Afficher les utilisateur");
            System.out.println("9) Supprimer un utilisateur");
            System.out.println("10) Quitter");
        } else {
            System.out.println("8) Quitter");
        } 
    }
    
    public Utilisateur createProfil() {
        Utilisateur u;
        
        System.out.println("Êtes-vous administrateur? o/n");
        String ouiOuNon = monScanner.nextLine();
        char choice = ouiOuNon.charAt(0);
                
        if (choice == 'o' || choice == 'O')
        {
            u = new Moderateur();
            u.creerUtilisateur();
            profilList.add(0, u);
        }
        else
        {
            u = new Utilisateur();
            u.creerUtilisateur();
            u.usersList.add(0, u);
        }     
        return u;
   }
   
   public int navigation(Utilisateur user) {
       
    Scanner monScanner = new Scanner(System.in);
    
    int choice = monScanner.nextInt(); monScanner.nextLine();
         
    switch (choice) {
            
            /** case 1 : Afficher votre profil */
            case 1 :
                afficherProfil();
            break;
                
            /** case 2 : Modifier votre profil */
            case 2 :
                createProfil();
            break;
                    
            /** case 3 : Écrire un message */ 
            case 3 :
                user.ecrireMessage();
            break;
                
            /** case 4 : afficher les messages */
            case 4 :
                user.afficherMessages();
            break;
                
            /** case 5 : Supprimer un message */
            case 5 :
                user.supprimerMessage();
            break;
                
            /** case 6 : Ajouter un ami */
            case 6 :
                
            break;
                
            /** Afficher un ami */
            case 7 :
       
            break;
                
            /** Afficher les utilisateurs */
            case 8 :
                user.afficherUtilisateur();
            break;
            
            /** Supprimer un utilisateur */
            case 9 :

            break;
            
            /** Quitter */
            case 10 :
               
            break;
        }
    
    return choice;
    }
   
    public void afficherProfil() {
        System.out.println("Prénom: " + profilList.get(0).getPrenom());
        System.out.println("Nom: " + profilList.get(0).getNom());
        System.out.println("Année de naissance: " + profilList.get(0).getAnneeNaissance());
        System.out.println("Pseudo: " + profilList.get(0).getPseudo());
    }
}
