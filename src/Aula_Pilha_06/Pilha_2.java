package Aula_Pilha_06;
// @author diego.amalmeida

public class Pilha_2 {

    private No topo;
    private int tam;

    public Pilha_2() {
        this.topo = null;
        this.tam = 0;
    }

    public void empilhar(Object x) throws Exception {

        No aux = this.topo;
        this.topo = new No();
        this.topo.setElemento(x);
        this.topo.setProx(aux);
        this.tam++;
    }

    public Object desempilhar() throws Exception {

        if (this.vazia()) {
            throw new Exception("Erro: A pilha está vazia");            
        }
        Object elemento = this.topo.getElemento();
        this.topo = this.topo.getProx();
        this.tam--;
        return elemento;        
    }

    public boolean vazia() {
        return (this.topo == null);
    }

    public int tamanho() {
        return this.tam;
    }

}
