
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC {

    public static void main(String[] args) {

        int choix;
        int choix2;
     
        Scanner monScanner = new Scanner(System.in);
           
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            System.out.println("Driver O.K.");

            String url = "jdbc:mysql://localhost/utilisateurs";

            String user = "root";

            String passwd = "root";

            Connection conn = DriverManager.getConnection(url, user, passwd);

            System.out.println("Connexion effective !");  
      
            //Création d'un objet Statement
            Statement etat = conn.createStatement();
            
            do {
          
                System.out.println("");
                System.out.println("");
                System.out.println("Que souhaitez-vous faire?");
                System.out.println("1) Afficher tous les utilisateurs");
                System.out.println("2) Afficher un utilisateur spécifique");
                System.out.println("3) Ajouter un utilisateur");
                System.out.println("10) Quitter");
       
                choix = monScanner.nextInt(); monScanner.nextLine();
        
                ResultSet result = etat.executeQuery("SELECT * FROM users");
                ResultSetMetaData resultMeta = result.getMetaData();
      
                switch (choix) {
      
                    case 1 :
              
                    System.out.println("\n********************************************************************");

                    //On affiche le nom des colonnes
                    for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                        System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
                        System.out.println("\n********************************************************************");
                    while(result.next()){         
            
                    for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                        System.out.print("\t" + result.getObject(i).toString() + "\t |");
                        System.out.println("\n------------------------------------------------------------------");
                    }
                    break;
      
                    case 2 :
                        System.out.println("Veuillez entrer l'ID de l'utilisateur");
                        choix2 = monScanner.nextInt();
                        for(int j = 1; j <= resultMeta.getColumnCount(); j++) {
                            result.absolute(choix2); 
                            System.out.print(result.getObject(j).toString()+ " ");
                    }    
                    break;
      
                    case 3 :
                        System.out.println("Veuillez entrer le nom de l'utilisateur");
                        String nom = monScanner.nextLine();
              
                        System.out.println("Veuillez entrer le prénom de l'utilisateur");
                        String prenom = monScanner.nextLine();
              
                        System.out.println("Veuillez entrer l'age de l'utilisateur");
                        int age = monScanner.nextInt(); monScanner.nextLine();
              
                        System.out.println("Veuillez entrer le pseudo de l'utilisateur");
                        String pseudo = monScanner.nextLine();
                   
                        String requete = "INSERT INTO users(nom, " + "prenom, age, pseudo) VALUES('" + nom + "','" + prenom + "','" + age + "','" + pseudo + "')";
                        Statement etat2 = conn.createStatement();
                        etat2.executeUpdate(requete);
                    break;
                    }
            } while (choix != 10);  
            
        } catch (Exception e) {
            e.printStackTrace();
        }       
    
        System.out.println("Merci d'avoir utiliser mon programme");
    }  
}
