package pagina1;

import java.util.Scanner;

public class bee1007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int diferenca = a * b - c * d;

        System.out.println("DIFERENCA = " + diferenca);
    }
}
