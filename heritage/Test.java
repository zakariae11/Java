package heritage;

import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("Entrez le prenom:");
        String p = in.nextLine();    

        System.out.println("Entrez le nom:");
        String n = in.nextLine();    

        System.out.println("Entrez le CNE:");
        String c = in.nextLine();   

        Etudiant e = new Etudiant(p , n  , c);

    
        e.AfficheAll();
        in.close();
    }

}
