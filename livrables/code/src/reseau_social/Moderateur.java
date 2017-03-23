package reseau_social;

/** Création de la classe "Modérateur" héritant de la classe "Utilisateur" et de l'interface "Salarié" */
public class Moderateur extends Utilisateur implements Salarie {
    
    protected int niveau;
        
    @Override
    public void seConnecter()
    {
        System.out.print("connexion");
    }
    @Override
    public void seDeconnecter()
    {
        System.out.print("Déconexion");
    }
    
    @Override
    public void recevoirPaiement() {
        System.out.println ("Je suis employé et je recois des bons d'achat");
    };
    
    /** Getter et setter
     * @return  */
    protected int getNiveau() {
        return niveau;
    }
    
    protected void setNiveau(int niveau) {
        this.niveau = niveau;
    } 
    /** Fin getter et setter */
}
