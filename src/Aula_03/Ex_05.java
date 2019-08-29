package Aula_03;

// @author diego.amalmeida
import java.util.Scanner;

public class Ex_05 {

    public static int maiorSequencia(int[] v) {

        int sequencia = 1, maiorSequencia = 0;

        for (int i = 0; i < v.length - 1; i++) {

            if (v[i] < v[i + 1]) {

                sequencia++;
            } else {
                if (sequencia > maiorSequencia) {
                    maiorSequencia = sequencia;
                }
                sequencia = 1;
            }
        }
        if (maiorSequencia > sequencia) {
            return maiorSequencia;
        } else {
            return sequencia;
        }

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
        int maiorSeq = maiorSequencia(vetor);

        System.out.println("A maior sequência é " + maiorSeq);
    }

}
