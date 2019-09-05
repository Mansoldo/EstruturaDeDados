package Aula_04;

import java.util.Scanner;

// @author diego.amalmeida
/*
Implemente uma função recursiva para calcular o quociente da divisão inteira de X 
por Y, supondo X e Y números inteiros;
*/
public class Ex_09 {

    public static int solicitaNum() {

        Scanner leitor = new Scanner(System.in);

        int num;

        do {
            System.out.println("Digite um número positivo: ");
            num = leitor.nextInt();

        } while (num <= 0);

        return num;
    }

    public static int restoDivisao(int a, int b) {
        if (a < b) {
            return 0;
        } else {
            return 1 + restoDivisao(a - b, b);
        }
    }

    public static void main(String[] args) {

        int a = solicitaNum();
        int b = solicitaNum();

        System.out.println("Quociente: " + restoDivisao(a, b));
    }

}
