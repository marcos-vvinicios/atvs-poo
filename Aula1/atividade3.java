package Aula1;
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero:");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero:");
        int num3 = scanner.nextInt();

        int mediapond = (num1 * 1 + num2 * 4 + num3 * 6) / 11;

        System.out.print("A média ponderada dos quatro numeros é: " + mediapond);
        scanner.close();
    }
}
