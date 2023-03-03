//import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);

        System.out.println("Entrez id: ");
        int id = in.nextInt();
        
        System.out.println("Entrez prenom: ");
        String prenom = in.nextLine();
        
        System.out.println("Entrez nom: ");
        String nom = in.nextLine();

        System.out.println("Entrez cne: ");
        String cne = in.nextLine();
        in.nextLine();
        
        in.close();*/
        Personne p = new Personne(0, "JOHN", "DOE");
        Etudiant e = new Etudiant(1, "Heddaje", "Zakariae", "T99999");
        Employe e1 = new Employe(10, "Doe", "Joe", 10000d);
        Professeur p1 = new Professeur(10, "Doe", "Joe", 10000d, "dev");
        p.Afficher();

        e.AfficherAll();
        e.quiSuisJe();

        e1.AfficherAll();
        e1.quiSuisJe();

        p1.AfficherAll();
        p1.quiSuisJe();

    }
}
