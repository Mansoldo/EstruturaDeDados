package Aula_05;

// @author diego.amalmeida
public class testaListaEncadeada {

    public static void main(String[] args) {

        /*
        No p = new No(10, null);
        No q = new No(20, p);
        No r = new No(1000, q);
        System.out.println(r);
         */
        
        ListaEncadeada lista = new ListaEncadeada();
        lista.insereInicio(30);
        lista.insereInicio(20);
        lista.insereInicio(10);
        lista.insereFinal(40);
        lista.insereFinal(50);
        lista.insereOrdenado(25);
        lista.insereOrdenado(5);
        lista.insereOrdenado(60);
        System.out.println(lista);
        //lista.removerInicio();
        //System.out.println(lista);
        //lista.removerFinal();
        //System.out.println(lista);
        //lista.removerOrdenado(30);
        //System.out.println(lista);
        lista.removerFinalRecursivo();
        System.out.println(lista);

    }

}
