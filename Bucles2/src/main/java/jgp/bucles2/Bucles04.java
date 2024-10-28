/*
 * Imprime los 20 primeros múltiplos de 2.
 */
package jgp.bucles2;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

public class Bucles04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 2;
        
        System.out.println("Bucle WHILE");
        
        while (num <= 40){
        System.out.println(num);
        num+=2;
        
        
        
        }
        
        
        System.out.println("Bucle FOR");
        int multiplo =0;
        for(int i=1;i<=20;i++){
        multiplo +=2;
        System.out.println(multiplo);
        
        
        }
    }
}
