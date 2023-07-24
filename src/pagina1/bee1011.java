package pagina1;

import java.util.Scanner;

public class bee1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();

        double volume = 3.14159 * 4.0/3.0 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
