package classemethod;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
                
        pessoa objetopessoa = new pessoa(70.0f, 1.70f);
        
        Scanner leitor= new Scanner(System.in);
         
        /* Metodo errado que altera os dados do objeto
        System.out.println("Digite o peso da pessoa: ");
        objetopessoa.peso = leitor.nextFloat();
        System.out.println("Digite a altura da pessoa: ");
        objetopessoa.altura = leitor.nextFloat();
        */
        
        System.out.println("Digite o peso da pessoa: ");
        objetopessoa.setPeso(leitor.nextFloat()); 
        System.out.println("Digite a altura da pessoa: ");
        objetopessoa.setAltura(leitor.nextFloat());
        
        System.out.println("IMC = "+ objetopessoa.calcularIMC());
        
    }
}
