
package exercicio24;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        char continuar = 's';
        while(continuar == 'S' || continuar == 's') {
            System.out.print("Me diga um numero: ");
            int n = leitor.nextInt();
                if ( n == 0) {
                    System.out.println("O numero informado e zero!");
                    } else {
                        if (n > 0) {
                        System.out.println("O numero e positivo");
                        } else {
                        System.out.println("O numero e negativo");
                    }
                }
     
        System.out.println("Deseja continuar? [sim] ou [nao]");
        continuar = leitor.next().charAt(0);
         
            
                
            
        } 
        System.out.println("Saindo...");
        
    }
}
