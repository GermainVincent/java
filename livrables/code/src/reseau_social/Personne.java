package reseau_social;

/** Création de la classe "Personne" */
abstract class Personne {
    protected String nom;
    protected String prenom;
    protected int anneeNaissance;
    
    protected String getNom() {
        return nom;
    }
    
    protected void setNom(String nom) {
        this.nom = nom;
    }
    
    protected String getPrenom() {
        return prenom;
    }
    
    protected void setPrenom (String prenom) {
        this.prenom = prenom;
    }
    
    protected int getAnneeNaissance() {
        return anneeNaissance;
    }
    
    protected void setAnneeNaissance (int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }
}
