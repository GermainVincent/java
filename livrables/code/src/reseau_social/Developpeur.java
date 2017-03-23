package reseau_social;

/** Création de la classe "Développeur" héritant de la classe "Employé" */
public class Developpeur extends Employe {

    public void travailler() {
        System.out.println("Je suis un employé et je travaille");
    }

    @Override
    public void recevoirPaiement() {
        System.out.println("Je suis salarié");
    }
    
}
