package pagina1;

import java.util.Scanner;

public class bee1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] valores = scanner.nextLine().split(" ");
        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maior + " eh o maior");
    }
}
