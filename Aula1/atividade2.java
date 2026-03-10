package Aula1;
import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero:");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero:");
        int num3 = scanner.nextInt();
        double media = (num1 + num2 + num3) / 3;

        System.out.print("A média dos quatro numeros é: " + media);
        scanner.close();

    }
}
