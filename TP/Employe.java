public class Employe extends Personne implements Profil{
    private double salaire;
    public Employe(int id, String nom, String prenom, Double salaire){
        super(id, nom, prenom);
        this.salaire = salaire;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }
    public void AfficherAll(){
        super.Afficher();
        System.out.println("salaire: " + salaire);
    }
    @Override
    public void quiSuisJe() {
        System.out.println("Je suis Employe.\n");
        
    }
}
