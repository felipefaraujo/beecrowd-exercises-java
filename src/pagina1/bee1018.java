package pagina1;

import java.util.Scanner;

public class bee1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int valorOriginal = valor;
        int cem = valor / 100;
        valor = valor % 100;
        int cinq = valor / 50;
        valor = valor % 50;
        int vinte = valor / 20;
        valor = valor % 20;
        int dez = valor / 10;
        valor = valor % 10;
        int cinco = valor / 5;
        valor = valor % 5;
        int dois = valor / 2;
        valor = valor % 2;
        int um = valor;
        valor = 0;
        System.out.println(valorOriginal);
        System.out.printf("%d nota(s) de R$ 100,00\n", cem);
        System.out.printf("%d nota(s) de R$ 50,00\n", cinq);
        System.out.printf("%d nota(s) de R$ 20,00\n", vinte);
        System.out.printf("%d nota(s) de R$ 10,00\n", dez);
        System.out.printf("%d nota(s) de R$ 5,00\n", cinco);
        System.out.printf("%d nota(s) de R$ 2,00\n", dois);
        System.out.printf("%d nota(s) de R$ 1,00\n", um);
    }
}
