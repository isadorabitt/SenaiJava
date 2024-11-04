package com.senai.java.ContaDigitalparaFintech;

public class ContaPoupanca extends Conta implements Transacao {
    private double taxaDeJuros; // Taxa de juros para o rendimento da poupança.

    public ContaPoupanca(String titular, String numeroConta) {
        super(titular, numeroConta);
        this.taxaDeJuros = 5.0; // Definindo a taxa de juros como 5%.
    }

    @Override
    public void realizarDeposito(double valor) {
        adicionarSaldo(valor);
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    @Override
    public void realizarSaque(double valor) {
        if (getSaldo() >= valor) {
            subtrairSaldo(valor);
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void realizarTransferencia(double valor, Conta destino) {
        if (getSaldo() >= valor) {
            subtrairSaldo(valor);
            destino.adicionarSaldo(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso para " + destino.getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void aplicarJuros() {
        double juros = getSaldo() * (taxaDeJuros / 100); // Calcula o valor dos juros.
        adicionarSaldo(juros); // Adiciona o valor dos juros ao saldo.
        System.out.println("Juros de " + juros + " aplicados ao saldo.");
    }
}
