/*
 * Imprime los números del 0 al 10.
 */
package jgp.bucles2;


import java.util.Scanner;

public class Bucles01 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        

        int num = 0;
        
        System.out.println("Bucle WHILE");
        
        while (num <= 10){
        System.out.println(num);
        num++;
        }
        System.out.println("\n");
        System.out.println("Bucle FOR");
        for(int i=0;i<=10;i++){
        System.out.println(i);
        }
    }
}
