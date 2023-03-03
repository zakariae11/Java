package packages.generalisation;


public abstract class Personne {
    private String prenom, nom ;
    public Personne(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void Afficher(){
        System.out.println("\nVos informations:\n");
        System.out.println("Prenom:" + prenom + "\nNom:" + nom);
    }
    public abstract void travailler();
}
