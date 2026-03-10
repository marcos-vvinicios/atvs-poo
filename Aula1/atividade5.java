package Aula1;
import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o salario: ");
        int salario = scanner.nextInt();

        System.out.print("Digite o percentual de aumento: ");
        int percentual = scanner.nextInt();

        double salariofim = salario + (salario * percentual / 100.0);

        System.out.print("O salario com aumento é: " + salariofim);
        scanner.close();
    }
}
