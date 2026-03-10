package Aula1;
import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario:");
        int salario = scanner.nextInt();

        double salariofim = salario + (salario * 0.25);

        System.out.print("O salario com aumento é: " + salariofim);
        scanner.close();
    }
}
