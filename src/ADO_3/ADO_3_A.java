package ADO_3;

// @author Mansoldo
import java.util.Scanner;

/*
10) Implemente uma função iterativa e outra função recursiva que receba um número 
inteiro positivo na base decimal e o converta para a base binária. 
 */
public class ADO_3_A {

    public static int leInteiro() {

        Scanner leitor = new Scanner(System.in);
        int qtd;

        do {
            System.out.println("Digite um valor entre 0 e 100");
            qtd = leitor.nextInt();

        } while (qtd < 0 || qtd > 100);

        return qtd;
    }

    public static int dec2Bin(int decimal) {

        int bin = 0;
        int cont = 0;

        while (decimal > 0) {
            int resto = decimal % 2;
            bin += resto * Math.pow(10, cont);
            decimal = decimal / 2; //atualização
            cont++;
        }
        return bin;
    }

    public static void recursivoBin(int decimal) {

        if (decimal > 0) {
            recursivoBin(decimal / 2);
            System.out.print(decimal % 2);
        }

    }

    public static void main(String[] args) {

        int decimal = leInteiro();
        recursivoBin(decimal);
        System.out.println();
        System.out.println("Decimal " + " == " + dec2Bin(decimal));
    }
}
