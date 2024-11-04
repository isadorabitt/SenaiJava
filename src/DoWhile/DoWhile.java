package DoWhile;

import br.com.aula.Pessoa;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        //insatncia de classe Scanner
        Scanner scanner = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        // Declaração de variável
        int sair;
        double imc;


        //laço de repetição
        do {
            // Entrada de dados
            System.out.println("Informe o nome do usuário: ");
            usuario.setNome(scanner.nextLine());
            System.out.println("Informe o peso em kg do usuário: ");
            usuario.setPeso(scanner.nextDouble());
            System.out.println("Informe a altura em metros do usuário: ");
            usuario.setAltura(scanner.nextDouble());

            // Calculo do imc
            imc = usuario.getPeso()/(usuario.getAltura()+ usuario.getAltura());

            // Exibe o imc
            System.out.println("IMC do usuário: " + String.format("%.2f", imc));

            // Pergunta ao usuário se deseja continuar
            System.out.println("Deseja sair?");
            System.out.println("1 - continuar");
            System.out.println("2 - sair");
            sair = scanner.nextInt();

            // Limpeza de buffer
            scanner.nextLine();


        }while (sair==1);

        scanner.close();
    }

}