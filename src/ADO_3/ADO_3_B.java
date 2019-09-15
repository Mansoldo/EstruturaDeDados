package ADO_3;

import java.util.Scanner;
// @author Mansoldo

public class ADO_3_B {

    public static int leInteiro() {

        Scanner leitor = new Scanner(System.in);
        int qtd;

        do {
            System.out.println("Digite um valor binário");
            qtd = leitor.nextInt();

        } while (qtd < 0);

        return qtd;
    }

    public static int bin2Dec(int bin) {

        int decimal = 0;
        int cont = 0;

        while (bin > 0) {
            int resto = bin % 10;
            decimal += resto * Math.pow(2, cont);
            bin = bin / 10; //atualização
            cont++;
        }
        return decimal;
    }

    public static int dec2Bin(int bin) {

        if (bin % 10 != 0) {
            return bin;
        } else {
            return 2 * dec2Bin(bin / 10);
        }
    }

    public static void main(String[] args) {

        int decimal = leInteiro();
        int decimal2 = dec2Bin(decimal);
        System.out.println("Decimal " + " == " + bin2Dec(decimal));
        System.out.println("Decimal " + " == " + decimal2);

    }

}
