package Aula_Pilha_06;

// @author diego.amalmeida
public class No {

    private Object elemento;
    private No prox;
    
    public No(){        
    }

    public No(Object elemento, No prox) {
        this.elemento = elemento;
        this.prox = prox;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }   

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", prox=" + prox + '}';
    }
}
