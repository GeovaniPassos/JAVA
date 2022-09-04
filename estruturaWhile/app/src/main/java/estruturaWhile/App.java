package estruturaWhile;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       int totalAlunos = 10;
       Scanner leitorScanner = new Scanner(System.in);
       while(totalAlunos > 0){
           System.out.print("Diga o nome do aluno: ");
           String nomeAluno = leitorScanner.nextLine();
           System.out.print("Diga a idade do aluno: ");
           int idadeAluno = leitorScanner.nextInt();
           System.out.println("O nome do aluno e "+nomeAluno+" e sua idade e "
                   +idadeAluno+" anos!");
           totalAlunos = totalAlunos - 1;
           
       }
        
    }
}
