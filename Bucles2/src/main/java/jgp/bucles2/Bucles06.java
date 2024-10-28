/*
 * Imprime los valores de x² para x de 1 al 20
 */
package jgp.bucles2;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

public class Bucles06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = 1,resultado, resultado2;

        System.out.println("Bucle WHILE");

        while (x <= 20) {
            resultado = (x * x);
            x ++;
            System.out.println(resultado);
            

        }

        System.out.println("\n");
        System.out.println("Bucle FOR");
        int num=1;
        for (int i = 1; i <= 20; i++) {
            resultado2 = num*num;
            num++;
            System.out.println(resultado2);

        }
    }
}
