package Aula_Pilha_06;

// @author diego.amalmeida
public class Exerc_Pilha_01 {

    public static void main(String[] args) throws Exception {
        Pilha p = new Pilha(10);
        p.empilhar(3);
        p.empilhar(5);
        p.empilhar(8);
        System.out.println(p.vazia());
        System.out.println(p.desempilhar());
        System.out.println(p.desempilhar());
        System.out.println(p.tamanho());
        System.out.println(p.desempilhar());
        System.out.println(p.vazia());
    }

}
