package com.senai.java.ContaDigitalparaFintech;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private String titular;
    private double saldo;
    private String numeroConta;
    private List<String> historicoTransacoes;
    private List<String> RealizarSaque;
    private List<String> RealizarTransferencia;
    private String RalizarDeposito;
    private String RealizarDeposito = RalizarDeposito;

    public Conta(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.historicoTransacoes = new ArrayList<>();
        this.RealizarSaque = new ArrayList<>();
        this.RealizarTransferencia = new ArrayList<>();

    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public List<String> getHistoricoTransacoes() {
        return historicoTransacoes;
    }
    public List<String> getRealizarSaque() { 
        return RealizarSaque; 
    }
    public List<String> getRealizarTransferencia() {
        return RealizarTransferencia;
    }
    public String getRealizarDeposito() {
        return RealizarDeposito;
    }
    

    protected void adicionarSaldo(double valor) {
        saldo += valor;
        historicoTransacoes.add("Depósito: R$ " + valor);
    }

    protected void subtrairSaldo(double valor) {
        saldo -= valor;
        historicoTransacoes.add("Saque: R$ " + valor);
    }

    public void exibirHistorico() {
        System.out.println("Histórico de Transações da Conta " + numeroConta + ":");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }
}