package Aula_03;

// @author diego
import java.util.Scanner;

public class Ex_06 {
    
    
    public static int interseccaoVetor(int [] v1, int [] v2){
        
        int inter = 0, j = 0;
        
        for(int i = 0; i < v1.length - 1; i++){
            
            if(v1[i] == v2[j]){
                inter++;
                j++;
            } else {
                
                if(v1[i + 1] > v2[j]){
                    j++;
                    
                } else {
                    
                    if(v1[i + 1] == v2[j]){
                        inter++;
                        j++;
                    }
                }
            }            
        }        
        return inter;
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
        int[] vetor2 = new int[qtd];
        populaVetorAleatorio(vetor);
        System.out.println("Popule o segundo vetor: ");
        populaVetorAleatorio(vetor2);
        imprimirVetor(vetor);
        imprimirVetor(vetor2);
        int qtd_inter = interseccaoVetor(vetor, vetor2);

        System.out.println("Intersecção dos números: " + qtd_inter);
    }

}
