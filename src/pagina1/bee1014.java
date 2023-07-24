package pagina1;

import java.util.Scanner;

public class bee1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia = scanner.nextInt();
        double combustivel = scanner.nextDouble();

        double media = (double) distancia / combustivel;

        System.out.printf("%.3f km/l\n", media);
    }
}
