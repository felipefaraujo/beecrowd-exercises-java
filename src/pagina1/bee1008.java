package pagina1;

import java.util.Scanner;

public class bee1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        int horas = input.nextInt();
        double valorPorHora = input.nextDouble();

        double salario = horas * valorPorHora;

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
