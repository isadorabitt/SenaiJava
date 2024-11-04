package br.com.aula;

import java.util.Scanner;

public class AulaAlex02 {
    public static void main(String[] args) {

        // Instanciar a classe
        Pessoa usuario = new Pessoa();
        Scanner sc = new Scanner(System.in);

        //Selando os valores
        System.out.println("Informe o nome do usuário: ");
        usuario.setNome(sc.nextLine());
        System.out.println("Informe o E-mail do usuário: ");
        usuario.setEmail(sc.nextLine());
        System.out.println("Informe a idade do usuário: ");
        usuario.setAltura(sc.nextInt());

        //Saída de dados
        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("E-mail do usuário: " + usuario.getEmail());
        System.out.println("Idade do usuário: " + usuario.getAltura());
    }
}
