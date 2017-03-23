package reseau_social;

/** Création de la classe "Employé" héritant de la classe "Personne" et de l'interface "Salarié" */
public class Employe extends Personne implements Salarie {
    protected int salaire;
    protected int dureeContrat;
    
    @Override
    public void recevoirPaiement() {
        System.out.println("Vous recevrez votre salaire en fin de mois");
    };
    
    /** Getter et Setter
     * @return  */ 
    protected int getSalaire() {
        return salaire;
    }
    
    protected void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    
    protected int getDureeContrat() {
        return dureeContrat;
    }
    
    protected void setDureContrat(int dureeContrat) {
        this.dureeContrat = dureeContrat;
    }
    /** Fin getter ete setter */
}
