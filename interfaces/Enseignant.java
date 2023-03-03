package Interfaces;

public class Enseignant extends Personne implements Affichage{
    private String PPR;
    public Enseignant(String prenom, String nom, String PPR) {
        super(prenom, nom);
        this.PPR = PPR;
    }
    public void AfficheAll(){
        super.Afficher();
        System.out.println("PPR: " + PPR);
    }
    public String getPPR() {
        return PPR;
    }
    public void setPPR(String pPR) {
        PPR = pPR;
    }
    @Override
    public void Afficher(){
        System.out.println("Mon PPR est: "+PPR);
    }
    @Override
    public void travailler(){
        System.out.println("Travailler pour moi c`est enseigner.");
    }
}
