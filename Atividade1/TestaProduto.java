package org.example;


public class TestaProduto {
    static void main() {

        Produto p1 = new Produto("CPU", 1700.0, 100);
        Produto p2 = new Produto("Placa de Video", 2500.0, 50);

        p1.exibirinfos();

        p1.adicionarAoEstoque(50);
        System.out.println("Apos adicionar 50: " + p1.getQuantidadeEmEstoque());

        p1.removerDoEstoque(30);
        System.out.println("Apos remover 30: " + p1.getQuantidadeEmEstoque());

        p1.setPreco(12.0);
        System.out.println("Novo preco: R$ " + p1.getPreco());

    }
}
