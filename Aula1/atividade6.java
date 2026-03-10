package Aula1;
import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        int salario = scanner.nextInt();

        double gratificacao = salario * 0.05;
        double imposto = salario * 0.07;

        double salariofim = salario + gratificacao - imposto;

        System.out.print("O salario final é: " + salariofim);
        scanner.close();
    }
}
