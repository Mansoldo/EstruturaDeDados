
package Aula_04;

// @author diego.amalmeida

import java.util.Scanner;

/*
Escreva uma função recursiva que calcula o produto de A * B, em que A e B são inteiros
maiores que zero. Considere que o produto pode ser definido como A somado a si mesmo
B vezes, usando uma definição recursiva temos

A * B = A...              se B = 1
A * B = A * (B -1) + A... se B >1

*/ 
public class Ex_04 {
    
    
    public static int solicitaNum(){
        
        Scanner leitor = new Scanner (System.in);
        
        int num;
        
        do{
            System.out.println("Digite um número: ");
            num = leitor.nextInt();
            
        } while(num <= 0);
        
        return num;        
    }
    
    public static int produtoNumeros(int a, int b){
        
        if(b ==1){
            return a;
        } else {
            return a + produtoNumeros(a, b -1);
        }
    }
    
    public static void main(String[] args) {        
        
        int a = solicitaNum();
        int b = solicitaNum();
        
        System.out.println("Produto do número " + a + " * " + b + " = " +produtoNumeros(a, b));
        
    }
    
}
