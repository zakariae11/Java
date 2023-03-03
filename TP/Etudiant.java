public class Etudiant extends Personne implements Profil{
    private String cne;
    public Etudiant(int id, String nom, String prenom, String cne){
        super(id, nom, prenom);
        this.cne = cne;
    }
    public String getCne() {
        return cne;
    }
    public void setCne(String cne) {
        this.cne = cne;
    }
    public void AfficherAll(){
        super.Afficher();
        System.out.println("CNE: " + cne);
    }
    @Override
    public void quiSuisJe() {
        System.out.println("Je suis Etudiant.\n");
        
    }
}
