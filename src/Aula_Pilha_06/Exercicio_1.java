package Aula_Pilha_06;

// @author diego.amalmeida
import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        String seq;

        System.out.println("Digite uma cadeia de caracteres que contenha apenas () e []: ");
        seq = leitor.nextLine();

        Pilha_2 p = new Pilha_2();

        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(' || seq.charAt(i) == '[') {
                p.empilhar(seq.charAt(i));
            } else {
                //Verifica se pilha está vazia
                if (p.vazia()) {
                    System.out.println("Não está bem formada a sequência");
                    return;
                }
                char chatTopo = (char) p.desempilhar();

                if (chatTopo == '(' && seq.charAt(i) == ']') {
                    System.out.println("Não está bem formada a sequência");
                    return;
                }

                if (chatTopo == '[' && seq.charAt(i) == ')') {
                    System.out.println("Não está bem formada a sequência");
                    return;
                }
            }
        }

        //Terminou de percorrer a sequência e analisa a pilha
        if (p.vazia()) {
            System.out.println("Está bem formada a sequência");
        } else {
            System.out.println("Não está bem formada a sequência");
        }
    }

}
