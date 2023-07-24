package pagina1;

import java.util.Scanner;

public class bee1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] valores = scanner.nextLine().split(" ");
        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);

        double triangulo = (a * c) / 2.0;
        double circulo = 3.14159 * Math.pow(c, 2);
        double trapezio = ((a + b) * c) / 2.0;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}
