
package exercicio01;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int n1;
        int n2;
        float res;
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Escolha um numero: ");
        n1 = leitor.nextInt();
        System.out.print("Escolha outro numero: ");
        n2 = leitor.nextInt();
        
        res = n1 + n2 ;
        System.out.print("O resultado ente "+n1+" e "+n2+" e igual a "+res);
        
    }
}
