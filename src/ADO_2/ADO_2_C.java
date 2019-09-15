package ADO_2;

/*
3) Escreva uma função que receba dois vetores (A[] e B[]), com n e m elementos, 
respectivamente. Os vetores estão ordenados em ordem crescente, a função aloca um vetor C[], 
exatamente com soma dos tamanhos de A e B, e intercala os elementos de A[] e B[] 
em C[], de forma que o vetor C[] fique em ordem crescente. 
A função deve ter deve ter complexidade O(n+m), ou seja, a soma dos tamanho dos vetores.
 */
// @author Mansoldo
public class ADO_2_C {

    public static int[] validarInterseccao(int v1[], int v2[]) {

        int tamanho1 = v1.length;
        int tamanho2 = v2.length;
        int tamanho3 = tamanho1 + tamanho2;

        int l = 0;
        int j = 0;
        int k = 0;

        int resultado[] = new int[tamanho3];

        for (int i = 0; i < tamanho1; i++) {

            resultado[k] = v1[l];
            k++;
            l++;            
            resultado[k] = v2[j];
            k++;
            j++;
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

        int v1[] = {1, 2, 7, 8, 3};
        int v2[] = {2, 4, 6, 8, 3};

        ordenaVetor(v1);
        imprimirVetor(v1);
        ordenaVetor(v2);
        imprimirVetor(v2);

        int resultado[] = validarInterseccao(v1, v2);
        imprimirVetor(resultado);

    }

}
