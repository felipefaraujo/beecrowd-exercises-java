package pagina1;

import java.util.Scanner;

public class bee1002 {
    public static void main(String[] args) {
        double n = 3.14159;

        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();

        double area = n * raio * raio;

        System.out.printf("A=%.4f\n", area);
    }
}
