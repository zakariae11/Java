

public class Enseignant extends Personne {
	private int PPR;
	public Enseignant(int PPR,String nom,String prenom) {
		super(nom,prenom);
		this.PPR = PPR;
	}
	public int getPPR(){
		return PPR;
		}
	public void setPPR(int PPR) {
		this.PPR = PPR;
		}
	 
	@Override
	public void quiSuisJe() {
		System.out.println("Je suis un enseignant");
		
	}
}
