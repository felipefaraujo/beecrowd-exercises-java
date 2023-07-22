package pagina1;

import java.util.Scanner;

public class bee1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] linha1 = scanner.nextLine().split(" ");
        int codigoPeca1 = Integer.parseInt(linha1[0]);
        int quantidadePeca1 = Integer.parseInt(linha1[1]);
        double valorUnitarioPeca1 = Double.parseDouble(linha1[2]);

        String[] linha2 = scanner.nextLine().split(" ");
        int codigoPeca2 = Integer.parseInt(linha2[0]);
        int quantidadePeca2 = Integer.parseInt(linha2[1]);
        double valorUnitarioPeca2 = Double.parseDouble(linha2[2]);

        double valorTotalPeca1 = quantidadePeca1 * valorUnitarioPeca1;
        double valorTotalPeca2 = quantidadePeca2 * valorUnitarioPeca2;
        double valorTotalAPagar = valorTotalPeca1 + valorTotalPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotalAPagar);
    }
}
