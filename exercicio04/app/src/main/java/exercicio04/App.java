
package exercicio04;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        String nome;
        float salarioFixo = 0.00f;
        int totVendas;
        float totSalario;
        float comissao = 0.15f;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Qual seu nome vendedor? ");
        nome = leitor.next();
        System.out.print("Qual o salario fixo? ");
        salarioFixo = leitor.nextFloat();
        System.out.print("Qual foi o total de vendas nesse mes? ");
        totVendas = leitor.nextInt();
       
        comissao *= salarioFixo;
        comissao *= totVendas;
        totSalario = comissao + salarioFixo;
        
        System.out.print("Nome: "+nome+" Salario fixo: "+salarioFixo+" Salario do "
                + "final do mes com comissao: "+totSalario+ " reais");
        
     
        
        
        
    
        
        
        
    }
}
