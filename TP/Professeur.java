public class Professeur extends Employe implements Profil{
    private String specialite;
    public Professeur(int id, String nom, String prenom, Double salaire, String specialite){
        super(id, nom, prenom, salaire);
        this.specialite = specialite;
    }
    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    public void AfficherAll(){
        super.AfficherAll();
        System.out.println("specialite" + specialite);
    }
    @Override
    public void quiSuisJe(){
        System.out.println("Je suis Professeur.\n");
    }
}
