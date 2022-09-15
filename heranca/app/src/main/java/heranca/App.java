
package heranca;

import java.util.Date;

public class App {
     
    public static void main(String[] args) {
    
        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setSalario(1000.0f);
        v.setCpf("12332112365");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.printf("O salário do vendedor é: " + v.calcularSalario());
        
        
        
        v.calcularSalario();
       
        Motorista m = new Motorista();
    }
    
    
}
