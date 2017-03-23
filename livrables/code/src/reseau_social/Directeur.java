package reseau_social;

/** Création de la classe "Directeur" héritant de la classe "Employé" et de l'interface "Relation" */
 
public class Directeur extends Employe implements Relation {
      
    public void travailler() {
        System.out.println("Je suis directeur et je travaille");
    }

    @Override
    public void recevoirPaiement() {
        System.out.println("Je suis salarié, je recevrais un salaire en fin de mois");
    }

    @Override
    public void ajouterPersonne() {
        System.out.println("Je suis directeur et je peux ajouter de nouveaux utilisateurs");
    }
    
}
