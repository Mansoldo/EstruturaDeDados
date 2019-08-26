/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author diego.amalmeida
 */
public class Ex_03 {

    public static void inverterVetor(int[] vetor) {

        int menor = 0, maior = 0, aux = 0;
        
        for(int i = 1; i < vetor.length; i++){
            
            if(vetor[i] > vetor[maior]){
                maior = i;
            }
            
            if(vetor[i] < vetor[menor]){
                menor = i;
            }            
        }
        aux = vetor[maior];
        vetor[maior] = vetor[menor];
        vetor[menor] = aux;
    }

    public static void populaVetorAleatorio(int[] v) {

        Random aleatorio = new Random();
        //Scanner leitor = new Scanner(System.in);        
        //System.out.println("Popule o vetor com números inteiros: ");        
        for (int i = 0; i < v.length; i++) {
            v[i] = aleatorio.nextInt(30) + 1;
        }
    }

    public static void imprimirVetor(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static int leValores() {

        Scanner leitor = new Scanner(System.in);
        int qtd;

        do {
            System.out.println("Quantos elementos terá o vetor? (Digite um número inteiro positivo (Entre 1 e 100)");
            qtd = leitor.nextInt();

        } while (qtd < 0 || qtd > 100);
        return qtd;
    }

    public static void main(String[] args) {

        int qtd = leValores();
        int[] vetor = new int[qtd];
        populaVetorAleatorio(vetor);
        imprimirVetor(vetor);
        inverterVetor(vetor);
        imprimirVetor(vetor);

    }

}
