package com.senai.java.ContaDigitalparaFintech;

public class ContaCorrente extends Conta implements Transacao {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double limiteChequeEspecial) {
        super(titular, numeroConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void realizarDeposito(double valor) {
        adicionarSaldo(valor);
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    @Override
    public void realizarSaque(double valor) {
        if (getSaldo() + limiteChequeEspecial >= valor) {
            subtrairSaldo(valor);
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente, incluindo cheque especial.");
        }
    }

    @Override
    public void realizarTransferencia(double valor, Conta destino) {
        if (getSaldo() + limiteChequeEspecial >= valor) {
            subtrairSaldo(valor);
            destino.adicionarSaldo(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso para " + destino.getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente, incluindo cheque especial.");
        }
    }
}