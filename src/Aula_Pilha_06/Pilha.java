package Aula_Pilha_06;

// @author diego.amalmeida
public class Pilha {

    private Object item[];
    private int topo;

    public Pilha(int maxTam) {
        this.item = new Object[maxTam];
        this.topo = 0;
    }

    public void empilhar(Object x) throws Exception {

        if (this.topo == this.item.length) {
            throw new Exception("Erro: A pilha está cheia!");
        }
        this.item[this.topo++] = x;
    }

    public Object desempilhar() throws Exception {

        if (this.vazia()) {
            throw new Exception("Erro: A pilha está cheia!");
        }
        return this.item[--this.topo];
    }

    public boolean vazia() {
        return (this.topo == 0);
    }

    public int tamanho(){
        return this.topo;
    }
    
}
