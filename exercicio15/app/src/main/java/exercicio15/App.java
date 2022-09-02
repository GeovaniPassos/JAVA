
package exercicio15;

import java.util.Scanner;

public class App {
    
public static void main(String[] args) {
    
        System.out.println("Diga um numero: ");
        Scanner leitor = new Scanner (System.in);
        int numero = leitor.nextInt();
    
        if (numero >= 100 && numero <= 200) {
            System.out.print("Este numero esta entre 100 e 200.");
        } else {
            System.out.print("Este numero nao está entre 100 e 200."); 
        }
    
    
    }
}
