package Aula_05;

// @author diego.amalmeida
 
public class No {
    
    private int elemento;
    private No prox;
    
    public No(int elemento, No prox){
        this.elemento = elemento;
        this.prox = prox;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
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
