/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04;

import java.util.Scanner;

/**
 *
 * @author diego.amalmeida
 */
public class Ex_05 {

    public static int solicitaNum() {

        Scanner leitor = new Scanner(System.in);

        int num;

        do {
            System.out.println("Digite um número: ");
            num = leitor.nextInt();

        } while (num <= 0);

        return num;
    }

    public static int potenciaNumeros(int a, int b) {

        if (b == 1) {
            return a;
        } else {
            return a * potenciaNumeros(a, b - 1);
        }
    }

    public static void main(String[] args) {

        int a = solicitaNum();
        int b = solicitaNum();

        System.out.println("Potencia do número " + a + " elevado a " + b + " = " + potenciaNumeros(a, b));

    }

}
