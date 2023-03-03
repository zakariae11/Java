package Interfaces;

public class Test {
    public static void main(String[] args) {
        Etudiant e = new Etudiant(null, null, "T00000");
        Enseignant e1 = new Enseignant(null, null, "10/30");
        e.Afficher();
        e.travailler();
        e1.Afficher();
        e1.travailler();
    }
}
