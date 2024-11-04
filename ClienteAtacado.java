package com.senai.java.DISBRA;

class ClienteAtacado extends Cliente {
    private double DESCONTO = 0.1;
    private double LIMITE_DESCONTO = 1000.00;

    public ClienteAtacado(String nome, String endereco) {
        super(nome, endereco);
    }

    @Override
    public double calcularDesconto(double valorTotal) {
        if (valorTotal > LIMITE_DESCONTO) {
            return valorTotal * DESCONTO;
        }
        return 0.0;
    }

    @Override
    public int calcularPontosFidelidade(double valorTotal) {
        return 0;
    }
}
