

class Etudiant extends Personne{
    private String cne;
    public Etudiant(int i, String prenom, String nom, String cne){
        super(prenom, nom);
        this.cne = cne;
    }
    public void AfficherAll(){
        super.Afficher();
        System.out.println("cne: "+ this.cne);
    }
    @Override
    public void quiSuisJe() {
        System.out.println("Je suis un etudiant");

        
    }
}