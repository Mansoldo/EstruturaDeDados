package Aula_05;

// @author diego.amalmeida
public class ListaEncadeada {

    private No ini;

    //Constructor de lista vazia
    public ListaEncadeada() {
        this.ini = null;
    }

    public boolean vazia() {
        return ini == null;
    }

    @Override
    public String toString() {

        String srtLista = "";
        //olha o primeiro No
        No temp = ini;
        while (temp != null) {
            srtLista += temp.getElemento() + " ";
            temp = temp.getProx();
        }
        return srtLista;
    }

    public void insereInicio(int elemento) {

        No novo = new No(elemento, ini);
        ini = novo;
    }

    public void insereFinal(int elemento) {

        No novo = new No(elemento, null);
        No temp = ini;

        if (temp == null) {
            ini = novo; //Lista Vazia
        } else {
            //Para 1 ou mais Nos na lista
            while (temp.getProx() != null) {
                temp = temp.getProx();
            }
            temp.setProx(novo);
        }
    }

    public void insereOrdenado(int elemento) {

        No novo = new No(elemento, null);
        No temp = ini;
        No anterior = null;

        while (temp != null && temp.getElemento() < novo.getElemento()) {
            anterior = temp;
            temp = temp.getProx();
        }

        //Lista vazia
        if (anterior == null) {
            novo.setProx(ini.getProx());
            ini = novo;

        } else {
            novo.setProx(anterior.getProx());
            anterior.setProx(novo);
        }
    }

    public void removerInicio() {

        if (vazia()) {
            System.out.println("Lista vazia");
        } else {
            //Possui ao menos um Node, removendo o primeiro Node
            ini = ini.getProx();
        }
    }

    public void removerFinal() {

        No temp = ini;
        No anterior = null;

        while (temp.getProx() != null) {

            anterior = temp;
            temp = temp.getProx();
        }
        //Apenas um node
        if (anterior == null) {
            ini = null; //Lista ficou vazia
        } else {
            anterior.setProx(null);
        }
    }

    public void removerOrdenado(int elemento) {

        if (vazia()) {
            System.out.println("Lista vazia");
        } else {
            //Possui ao menos um Node, removendo o primeiro Node
            No temp = ini;
            No anterior = null;

            while (temp != null && temp.getElemento() != elemento) {
                anterior = temp;
                temp = temp.getProx();
            }
            //Encontrei no primeiro No
            if (anterior == null) {
                ini = ini.getProx(); //Remoção do início
            } else {
                anterior.setProx(temp.getProx());
            }
        }
    }

    public void removerFinalRecursivo() {

        removerFinalRecursivo(null, ini);
    }

    public void removerFinalRecursivo(No anterior, No temp) {

        if (vazia()) {
            System.out.println("Lista vazia");
        } else {
            if (temp.getProx() == null) {
                anterior.setProx(null);
            } else {
                if (anterior == null && temp.getProx() == null) {
                    ini = null; //Lista ficou vazia
                } else {
                    removerFinalRecursivo(temp, temp.getProx());
                }
            }
        }
    }
}
