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
            while (temp.getProx() != null) {
                //Para 1 ou mais Nos na lista
                temp = temp.getProx();
            }
            temp.setProx(novo);
        }
    }

    public void insereOrdenado(int elemento) {

        No novo = new No(elemento, null);
        No temp = ini;        
        No anterior = null;
        
        while(temp != null && temp.getElemento() < novo.getElemento()){
            anterior = temp;
            temp = temp.getProx();            
        }
        
        //Lista vazia
        if(anterior == null){
            novo.setProx(ini.getProx());
            ini = novo;
            
        } else {
            novo.setProx(anterior.getProx());
            anterior.setProx(novo);
        }

    }

}
