package Aula_03;

// @author diego.amalmeida
/*
Escreva um algoritmo que recebe um vetor A de tamanho N contendo inteiros e encontra 
o par de elementos distinto A e B do vetor que fazem com que a diferença
A-B seja a maior possível. A função deve ter complexidade O(n), ou seja, o tamanho 
do vetor V[];
*/
import java.util.Random;
import java.util.Scanner;

public class Ex_04 {

    public static int [] maiorDiferenca(int[] vetor) {

        int menor = 0, maior = 0, aux = 0;

        int [] v = new int [2];
        
        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] > vetor[maior]) {
                maior = i;
            }

            if (vetor[i] < vetor[menor]) {
                menor = i;
            }
        }
        v[0] = vetor[maior];
        v[1] = vetor[menor];        
        
        return v;
    }

    public static void populaVetorAleatorio(int[] v) {

        //Random aleatorio = new Random();
        Scanner leitor = new Scanner(System.in);        
        System.out.println("Popule o vetor: ");
        //System.out.println("Popule o vetor com números inteiros: ");        
        for (int i = 0; i < v.length; i++) {
            v[i] = leitor.nextInt();
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
        int [] vetorDiferenca = maiorDiferenca(vetor);
        imprimirVetor(vetorDiferenca);        

    }

}
