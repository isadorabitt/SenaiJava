package com.senai.java.DISBRA;


import java.util.List;
import java.util.Scanner;


public class listaProdutos {

    Scanner scanner = new Scanner(System.in);

    private String nomeProduto;
    private double  valor;
    private int quantidade;
    private List<String> totalProdutos;


    public listaProdutos(String nomeProduto, double valor, int quantidade, List<String> totalProdutos) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
        this.totalProdutos = totalProdutos;

    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public List<String> getTotalProdutos(){return totalProdutos;}

    public void alterarNome(){


    }

    public  int i;

    public void adicionarProduto(double altValor, int altQuantidade,String altProduto,int i,boolean continuar) {
        valor=altValor;
        quantidade=altQuantidade;
        nomeProduto=altProduto;

            for (i=0;continuar!=false ;i++){

                System.out.println("Qual o nome do produto");
                altProduto = scanner.nextLine();


                altQuantidade=0;
                altValor=0;

                while (altQuantidade <0){

                    System.out.println("Digite a quantidade");
                    altQuantidade = scanner.nextInt();

                }

                while (altValor <0){

                    System.out.println("Qual valor");
                    altValor = scanner.nextDouble();

                }

                totalProdutos.add("O Produto : "+altProduto+" seu valor e : "+altValor+"quantida do produto "+altQuantidade+" O ID do produto e : "+i);
            }
        }
    public  void removerProduto(){

        for (i=0;i <= totalProdutos.size();i++){

            System.out.println( totalProdutos.get(i) );
        }
        i=0;

        System.out.println("Digite o ID do produto que deseseja remover");
        i = scanner.nextInt();
        totalProdutos.remove(i);


    }


    }

