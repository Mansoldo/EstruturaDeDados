package Aula_04;

import java.util.Scanner;
// @author diego.amalmeida

public class Ex_07 {

    public static int solicitaNum() {

        Scanner leitor = new Scanner(System.in);

        int num;

        do {
            System.out.println("Digite um número positivo: ");
            num = leitor.nextInt();

        } while (num <= 0);

        return num;
    }

    public static boolean ePrimo(int n) {

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean ePrimoRecursivo(int n) {

        return ePrimoRec(n, n - 1);
    }
    
    public static boolean ePrimoRec(int n, int i) {
        
        if(i == 1){
            return true;
        }
        
        if(n%i == 0){
            return false;
        }
        return ePrimoRec(n, i - 1);
    }

    public static void main(String[] args) {

        int a = solicitaNum();

        if (ePrimoRecursivo(a)) {
            System.out.println("Número primo!");
        } else {
            System.out.println("Não é número primo!");
        }
    }
}
