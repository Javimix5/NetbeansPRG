/*
 * Imprime los números del 0 al 10.
 */
package jgp.bucles2;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

public class Bucles01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

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
