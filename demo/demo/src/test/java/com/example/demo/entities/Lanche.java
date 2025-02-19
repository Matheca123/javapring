package com.example.demo.entities;

public class Lanche {
    private int codigo;
    private string nome;
    private double preco;
    private string imagem;

    public Lanche(int codigo, string nome, double preco, string imagem) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public string getImagem() {
        return imagem;
    }

    public void setImagem(string imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Lanche{" +
                "codigo=" + codigo +
                ", nome=" + nome +
                ", preco=" + preco +
                ", imagem=" + imagem +
                '}';
    }
}

