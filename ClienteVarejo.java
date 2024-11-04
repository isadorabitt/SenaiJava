package com.senai.java.DISBRA;



class ClienteVarejo extends Cliente {
    private static final int PONTOS_POR_REAL = 1; // 1 ponto por R$ 1,00

    public ClienteVarejo(String nome, String endereco) {
        super(nome, endereco);
    }

    @Override
    public double calcularDesconto(double valorTotal) {
        return 0.0;
    }

    @Override
    public int calcularPontosFidelidade(double valorTotal) {
        return (int) valorTotal * PONTOS_POR_REAL;
    }
}
