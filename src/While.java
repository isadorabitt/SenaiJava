
import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        //insatncia de classe Scanner
        Scanner scanner = new Scanner(System.in);

        //declaração de variáveis
        int N;

        //entrada de dados
        System.out.println("Informe um número inteiro positivo: ");
        N = scanner.nextInt();

        //laço de repetição
        while (N >= 0){
            System.out.println(N);
            N--;
        }
    }

}
