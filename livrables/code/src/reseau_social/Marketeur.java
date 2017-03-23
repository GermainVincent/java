package reseau_social;

/** Création de la classe "Marketeur" héritant de la classe "Employé" */
public class Marketeur extends Employe {

    public void travailler() {
        System.out.println("Je suis employé et je travaille");
    }

    @Override
    public void recevoirPaiement() {
        System.out.println("Je suis salarié");
    }
    
}
