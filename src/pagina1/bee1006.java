package pagina1;

import java.util.Scanner;

public class bee1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
