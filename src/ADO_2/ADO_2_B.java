package ADO_2;

// @author Mansoldo

/*
2) Repita o exercício anterior, agora deve ser impresso os elementos que estão 
em A[] mas não estão em B[]. A função deve ter deve ter complexidade O(n), 
ou seja, o tamanho dos vetores.
 */
public class ADO_2_B {

    public static int[] validarInterseccao(int v1[], int v2[]) {

        int l = 0;
        int j = 0;
        int k = 0;
        boolean validacao = true;

        int resultado[] = new int[v1.length];
        int resultado2[] = new int[v1.length];

        for (int i = 0; i <= v1.length; i++) {

            if (v1[j] == v2[k]) {

                resultado[l] = v1[j];
                l++;
                j++;
                k++;
                validacao = false;

            } else if (v1[j] > v2[k]) {

                k++;

            } else if (v1[j] < v2[k]) {

                j++;
            }
            
            if(validacao){
                resultado2[i] = v1[i];  
                validacao = true;
            }
        }
        return resultado2;
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
