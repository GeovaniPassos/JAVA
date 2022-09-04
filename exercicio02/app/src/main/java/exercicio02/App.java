package exercicio02;
import java.util.Scanner;
public class App {
      public static void main(String[] args) {
          Scanner leitor = new Scanner(System.in);
          System.out.println("Escolha um numero: ");
          int n1 = leitor.nextInt();
          System.out.println("Escolha outro numero: ");
          int n2 = leitor.nextInt();
          
          int soma = n1 + n2;
          int sub = n1 - n2;
          int div = n1 / n2;
          int mult = n1 * n2;
          System.out.println("A soma de " + n1 + " + " + n2 +" e " + soma);
          System.out.println("A subtracao de " + n1 + " - " + n2 +" e " + sub);
          System.out.println("A multiplicacao de " + n1 + " * " + n2 +" e " + mult);
          System.out.println("A divisao de " + n1 + " / " + n2 +" e " + div);
    }
}
