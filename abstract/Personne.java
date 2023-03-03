
public abstract class Personne {
    private String prenom;
    private String nom;
    public Personne(String prenom, String nom){
        this.nom = nom;
        this.prenom = prenom;
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
    public abstract void quiSuisJe();
    
    public void Afficher(){
        System.out.println("Nom: "+this.nom+ " \nPrenom: "+ this.prenom);
    }
	public void quiSuisje() {
		// TODO Auto-generated method stub
		
	}
};