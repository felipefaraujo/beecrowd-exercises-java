package pagina1;

import java.util.Scanner;

public class bee1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] valoresA = scanner.nextLine().split(" ");
        String[] valoresB = scanner.nextLine().split(" ");

        double x1 = Double.parseDouble(valoresA[0]);
        double y1 = Double.parseDouble(valoresA[1]);
        double x2 = Double.parseDouble(valoresB[0]);
        double y2 = Double.parseDouble(valoresB[1]);

        double media = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f\n", media);
    }
}
