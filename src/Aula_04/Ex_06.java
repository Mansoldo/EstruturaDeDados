
package Aula_04;

// @author diego.amalmeida

import java.util.Scanner;
/*
Implemente uma função recursiva para calcular a soma dos dígitos de um número 
inteiro e positivo
*/ 
public class Ex_06 {
    
    public static int solicitaNum() {

        Scanner leitor = new Scanner(System.in);

        int num;

        do {
            System.out.println("Digite um número: ");
            num = leitor.nextInt();

        } while (num <= 0);

        return num;
    }

    public static int somaDigitos(int a) {

        if(a < 10){
            return a;
        } else {            
            return a%10 + somaDigitos(a/10);
        }
    }

    public static void main(String[] args) {

        int a = solicitaNum();        

        System.out.println("Soma dos dígitos" + " = " + somaDigitos(a));

    }
    
}
