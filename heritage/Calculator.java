package heritage;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Entrez le 1er nombre: ");
      double num1 = sc.nextDouble();
      System.out.print("Entrez le 2eme nombre: ");
      double num2 = sc.nextDouble();
      System.out.print("Entrez type d'operation (+, -, *, /): ");
      char operator = sc.next().charAt(0);
      double result;

      switch (operator) {
        case '+':
          result = num1 + num2;
          break;
        case '-':
          result = num1 - num2;
          break;
        case '*':
          result = num1 * num2;
          break;
        case '/':
          result = num1 / num2;
          break;
        default:
          System.out.println("Operation non valide");
          return;
      }

      System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
  }
}