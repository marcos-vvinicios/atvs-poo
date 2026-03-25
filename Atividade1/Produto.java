package org.example;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    //metodos

    public void exibirinfos(){
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public void adicionarAoEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
        }
    }
    public void removerDoEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        }
    }
}
