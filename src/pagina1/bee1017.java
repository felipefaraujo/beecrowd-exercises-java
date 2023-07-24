package pagina1;

import java.util.Scanner;

public class bee1017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDeHoras = scanner.nextInt();
        int velMedia = scanner.nextInt();

        double litros = (double) (velMedia / 12.0) * totalDeHoras;

        System.out.printf("%.3f\n", litros);
    }
}
