package ADO_1;

// @author diego
/*
2. Escreva um programa que leia dois vetores, A e B, com n ≤ 20 e m≤  20 elementos respectivamente. 
O programa deve efetuar UNIÃO entre os vetores,. Os dois vetores não contêm valores duplicados e não estão ordenados. 
Como resultado deve ser gerado o vetor C, que conterá a intersecção de A e B 
Exemplo:A= { 7, 2, 5, 8, 4} e B= {4, 2, 9, 5}, C= A ∪ B= {7, 2, 5, 8, 4, 9}A= { 3, 9, 11} 
e B= {2, 6, 1}, C= A ∪ B= {3, 9, 11, 2, 6, 1}
 */
public class ADO_1_B {

    public static int[] validarUniao(int v1[], int v2[]) {

        int tamanho1 = v1.length - 1;
        int tamanho2 = v2.length - 1;
        int tamanho3;

        int aux = 0, j = 0;

        tamanho3 = tamanho1 + tamanho2;

        int resultado[] = new int[tamanho3];

        for (int i = 0; i <= tamanho3; i++) {

            if (i < tamanho1) {
                resultado[i] = v1[aux];
                aux++;
            } else if (i > tamanho1 && resultado[i] != v2[j]) {
                resultado[aux] = v2[j];
                j++;
            }
        }
        return resultado;
    }

    public static void ordenaVetor(int vetor[]) {

        int elemento = vetor.length;

        int aux1, aux2, aux;

        for (aux1 = 0; aux1 < elemento; aux1++) {

            for (aux2 = 0; aux2 < elemento - 1; aux2++) {

                if (vetor[aux2] > vetor[aux2 + 1]) {

                    aux = vetor[aux2];
                    vetor[aux2] = vetor[aux2 + 1];
                    vetor[aux2 + 1] = aux;
                }
            }
        }
    }

    public static void imprimirVetor(int[] v) {

        for (int i = 0; i < v.length; i++) {

            if (v[i] != 0) {
                System.out.print(v[i] + " ");
            } else {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int v1[] = {1, 2, 3, 4, 5};
        int v2[] = {5, 6, 7, 8, 9};

        ordenaVetor(v1);
        ordenaVetor(v2);
        imprimirVetor(v1);
        imprimirVetor(v2);
        int[] resposta = validarUniao(v1,v2);
        imprimirVetor(resposta);

    }

}
