package com.senai.java.ContaDigitalparaFintech;

import java.util.ArrayList; // Importa a classe ArrayList para usar uma lista dinâmica.
import java.util.List; // Importa a classe List para definir uma lista.
import java.util.Random; // Importa a classe Random para gerar números aleatórios.
import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário.

public class MainBanco {
    private static List<Conta> contas = new ArrayList<>(); // Lista para armazenar todas as contas criadas.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário.
        boolean executando = true; // Variável para controlar o loop principal do menu.

        while (executando) { // Loop para manter o menu ativo até que o usuário decida sair.
            System.out.println("\nMenu:");
            System.out.println("1. Criar Conta Corrente");
            System.out.println("2. Criar Conta Poupança");
            System.out.println("3. Inserir Saldo");
            System.out.println("4. Mostrar Saldo");
            System.out.println("5. Mostrar Histórico de Transações");
            System.out.println("6. Mostrar Contas Criadas");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário.

            switch (opcao) { // Estrutura de controle para executar a ação correspondente à opção escolhida.
                case 1:
                    criarContaCorrente(scanner); // Criando uma Conta Corrente
                    break;
                case 2:
                    criarContaPoupanca(scanner); // Criando uma Conta Poupança
                    break;
                case 3:
                    inserirSaldo(scanner); // Inserir saldo em uma conta
                    break;
                case 4:
                    mostrarSaldo(scanner); // Mostrar Saldo
                    break;
                case 5:
                    mostrarHistorico(scanner); // Mostrar Histórico de Transações
                    break;
                case 6:
                    mostrarContasCriadas(); // Mostrar Contas Criadas
                    break;
                case 7:
                    executando = false; // Sair do sistema
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente."); // Mensagem de erro para opção inválida.
            }
        }

        scanner.close(); // Fecha o scanner para liberar recursos.
    }

    // Método para criar uma conta corrente
    private static void criarContaCorrente(Scanner scanner) {
        System.out.print("Digite o nome do titular da Conta Corrente: ");
        String titularCorrente = scanner.next(); // Lê o nome do titular.
        String numeroContaCorrente = gerarNumeroConta(); // Gera um número de conta aleatório.
        ContaCorrente contaCorrente = new ContaCorrente(titularCorrente, numeroContaCorrente, 500.0); // Cria a conta corrente.
        contas.add(contaCorrente); // Adiciona a nova conta à lista de contas.
        System.out.println("Conta Corrente criada com sucesso! Número da conta: " + numeroContaCorrente);
    }

    // Método para criar uma conta poupança
    private static void criarContaPoupanca(Scanner scanner) {
        System.out.print("Digite o nome do titular da Conta Poupança: ");
        String titularPoupanca = scanner.next(); // Lê o nome do titular.
        String numeroContaPoupanca = gerarNumeroConta(); // Gera um número de conta aleatório.
        ContaPoupanca contaPoupanca = new ContaPoupanca(titularPoupanca, numeroContaPoupanca); // Cria a conta poupança.
        contas.add(contaPoupanca); // Adiciona a nova conta à lista de contas.
        System.out.println("Conta Poupança criada com sucesso! Número da conta: " + numeroContaPoupanca);
    }

    // Método para inserir saldo em uma conta
    private static void inserirSaldo(Scanner scanner) {
        System.out.print("Digite o número da conta para inserir saldo: ");
        String numeroConta = scanner.next(); // Lê o número da conta.
        Conta conta = encontrarConta(numeroConta); // Busca a conta pelo número informado.
        if (conta != null) { // Se a conta for encontrada
            System.out.print("Digite o valor a ser inserido: R$ ");
            double valor = scanner.nextDouble(); // Lê o valor a ser inserido.
            conta.adicionarSaldo(valor); // Chama o método depositar da conta.
            System.out.println("Saldo inserido com sucesso! Novo saldo: R$ " + conta.getSaldo()); // Mostra o novo saldo.
        } else {
            System.out.println("Conta não encontrada."); // Mensagem de erro se a conta não existir.
        }
    }

    // Método para mostrar o saldo de uma conta
    private static void mostrarSaldo(Scanner scanner) {
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.next(); // Lê o número da conta.
        Conta conta = encontrarConta(numeroConta); // Busca a conta pelo número informado.
        if (conta != null) { // Se a conta for encontrada
            System.out.println("Saldo da conta " + numeroConta + ": R$ " + conta.getSaldo()); // Mostra o saldo.
        } else {
            System.out.println("Conta não encontrada."); // Mensagem de erro se a conta não existir.
        }
    }

    // Método para mostrar o histórico de transações de uma conta
    private static void mostrarHistorico(Scanner scanner) {
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.next(); // Lê o número da conta.
        Conta conta = encontrarConta(numeroConta); // Busca a conta pelo número informado.
        if (conta != null) { // Se a conta for encontrada
            conta.exibirHistorico(); // Exibe o histórico de transações da conta.
        } else {
            System.out.println("Conta não encontrada."); // Mensagem de erro se a conta não existir.
        }
    }

    // Método para mostrar todas as contas criadas
    private static void mostrarContasCriadas() {
        if (contas.isEmpty()) { // Verifica se a lista de contas está vazia
            System.out.println("Nenhuma conta foi criada."); // Mensagem caso não haja contas
            return; // Retorna do método
        }
        System.out.println("Contas Criadas:");
        for (Conta conta : contas) { // Percorre a lista de contas
            System.out.println("Número da Conta: " + conta.getNumeroConta() + ", Titular: " + conta.getTitular() + ", Saldo: R$ " + conta.getSaldo()); // Mostra detalhes da conta
        }
    }

    // Método para gerar um número de conta aleatório
    public static String gerarNumeroConta() {
        Random random = new Random(); // Cria um objeto Random para gerar números aleatórios.
        int numero = random.nextInt(100000); // Gera um número aleatório entre 0 e 99999.
        return String.format("%05d", numero); // Formata o número para ter 5 dígitos, preenchendo com zeros à esquerda.
    }

    // Método para encontrar uma conta pelo número
    private static Conta encontrarConta(String numeroConta) {
        for (Conta conta : contas) { // Percorre a lista de contas
            if (conta.getNumeroConta().equals(numeroConta)) { // Compara o número da conta
                return conta; // Retorna a conta se encontrada
            }
        }
        return null; // Retorna null se a conta não for encontrada
    }
}