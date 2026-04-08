package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n MENU ");
            System.out.println("1 - Retângulo");
            System.out.println("2 - Círculo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {

                System.out.print("Largura: ");
                double largura = scanner.nextDouble();

                System.out.print("Altura: ");
                double altura = scanner.nextDouble();

                Retangulo r = new Retangulo(largura, altura);

                System.out.println("Área: " + r.calcularArea());
                System.out.println("Perímetro: " + r.calcularPerimetro());

            } else if (opcao == 2) {

                System.out.print("Raio: ");
                double raio = scanner.nextDouble();

                Circulo c = new Circulo(raio);

                System.out.println("Área: " + c.calcularArea());
                System.out.println("Perímetro: " + c.calcularPerimetro());

            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
