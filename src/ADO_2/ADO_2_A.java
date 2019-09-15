package ADO_2;

// @author Mansoldo
/*
1) Escreva uma função que receba dois vetores (A[] e B[]) já ordenados em ordem crescente 
e ambos possuem o mesmo tamanho. A sua função imprime a intersecção entre os dois vetores, 
ou seja, os elementos em comum entre os vetores A[] e B[]. 
Considere que os vetores não contêm valores duplicados. 
A função deve ter deve ter complexidade O(n), ou seja, 
o tamanho do vetor A[] e do vetor B[].
 */
public class ADO_2_A {

    public static int[] validarInterseccao(int v1[], int v2[]) {

        int tamanho1 = v1.length - 1;

        int l = 0;
        int j = 0;
        int k = 0;

        int resultado[] = new int[tamanho1];

        for (int i = 0; i <= tamanho1; i++) {

            if (v1[j] == v2[k]) {

                resultado[l] = v1[j];
                l++;
                j++;
                k++;

            } else if (v1[j] > v2[k]) {

                k++;

            } else if (v1[j] < v2[k]) {

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

        int v1[] = {1, 2, 7, 8, 3};
        int v2[] = {4, 2, 9, 5, 6};

        ordenaVetor(v1);
        imprimirVetor(v1);
        ordenaVetor(v2);
        imprimirVetor(v2);

        int resultado[] = validarInterseccao(v1, v2);
        imprimirVetor(resultado);
    }
}
