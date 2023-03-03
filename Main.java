import java.util.Scanner;

public class Main {
    public static void main(String []args){
       Scanner in = new Scanner(System.in);
       
       System.out.println("Entrez le premier nombre :");
       int n1 = in.nextInt();

       System.out.println("Entrez le deuxième nombre :");
       int n2 = in.nextInt();
       
       //appeler le constructeur par défaut.
       Somme s = new Somme(n1,n2);
       System.out.println("Le résultat de l'addition est : "+ s.sum());
       
       in.close(); 
    }
}




