package Aula_04;

// @author diego.amalmeida
import java.util.Scanner;

public class Ex_08 {

    public static int solicitaNum() {

        Scanner leitor = new Scanner(System.in);

        int num;

        do {
            System.out.println("Digite um número positivo: ");
            num = leitor.nextInt();

        } while (num <= 0);

        return num;
    }
    
    public static int restoDivisao(int a, int b){
        if(a < b){
            return a;
        } else {
            return restoDivisao(a - b, b);
        }
    }
    
    public static void main(String[] args) {
        
        int a = solicitaNum();
        int b = solicitaNum();
        
        System.out.println("Resto da divisão: " + restoDivisao(a, b));
    }

}
