package com.senai.java.DISBRA;

public class Pedidos {
    private int numeroPedido;
    private String nomeCliente;
    private String listaProdutos;
    private double ValorTotal;



    public Pedidos(int numeroPedido, String listaProdutos, double valorTotal, String nomeCliente) {
        this.numeroPedido = numeroPedido;
        this.listaProdutos = listaProdutos;
        this.nomeCliente = nomeCliente;
        ValorTotal = valorTotal;

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(String listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double valorTotal) {
        ValorTotal = valorTotal;
    }
}

//public void venda(double valorTotal,) {
//    System.out.println(": " + );
//    System.out.println(": R$ " + );
//}
