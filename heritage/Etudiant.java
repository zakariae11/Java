package heritage;

public class Etudiant extends Personne{
    private String cne;
    public Etudiant(String prenom, String nom, String CNE) {
        super(prenom, nom);
        this.cne = CNE;

    }

    public void AfficheAll(){
        super.Afficher();
        System.out.println("CNE: " + cne);
    }
    
}
