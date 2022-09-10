
package classemethod;

public class pessoa {
    //atributos
    private float peso;
    private float altura;
    
    public pessoa(float peso, float altura){
        System.out.println("Executando o metodo contrutor.");
        this.peso = peso;
        this.altura = altura;
    }
    
    public float calcularIMC(){
        float imc = peso/(altura*altura);
        return imc;
    }
    
    //Métodos acessores
    public void setPeso(float peso){
        this.peso = peso; 
    }
    public float getPeso(){
        return peso;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float setAltura(){
        return altura;
    }
}
