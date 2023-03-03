package Interfaces;

public class Etudiant extends Personne implements Affichage{
    private String cne;
    public Etudiant(String prenom, String nom, String CNE) {
        super(prenom, nom);
        this.cne = CNE;

    }
    public void AfficheAll(){
        super.Afficher();
        System.out.println("CNE: " + cne);
    }
    public String getCne() {
        return cne;
    }
    public void setCne(String cne) {
        this.cne = cne;
    }
    @Override
    public void Afficher(){
        System.out.println("Mon CNE est: " + cne);
    }
    @Override
    public void travailler() {
        System.out.println("Travailler pour moi c`est étudier.");
        
    }

    
}
