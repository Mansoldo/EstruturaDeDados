package ADO_2;

// @author Mansoldo
/*
4) Escreva uma função que recebe um vetor como parâmetro, a sua função seleciona 
o primeiro elemento de um vetor e rearranja o vetor de forma que todos elementos 
menores ou iguais ao primeiro elemento fiquem a sua esquerda e os maiores a sua direita.
No vetor {5, 6, 2, 7, 9, 1, 8, 3, 7} após ser rearranjado 
teríamos {1, 3, 2, 5, 9, 7, 8, 6, 7}. A função deve rearranjar o vetor com a complexidade O(n).
 */
public class ADO_2_D {

    public static int[] rearranjoVetor(int[] vetor) {

        int[] resultado = new int[vetor.length];

        int p_num = vetor[0], aux = 0, j = 0;
        //5, 6, 2, 7, 9, 1, 8, 3, 7  
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[j] <= p_num) {
                aux = vetor[j];
                vetor[j] = p_num;
            }
            j++;
        }

        return resultado;
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

        int v1[] = {5, 6, 2, 7, 9, 1, 8, 3, 7};
        imprimirVetor(v1);

    }
}
