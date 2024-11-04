package br.com.aula;

public class Pessoa {
    // Atributos
    private String Nome;
    private int Peso;
    private double altura;

    public int getAltura() {
        return (int) altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.Peso = (int) (int) peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos de acesso
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(String email) {
        this.Peso = Peso;
    }
}
