/*
 * Imprime los números del 20 al 100 saltando de 2 en 2.
 */
package jgp.bucles2;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

public class Bucles08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 20;

        System.out.println("Bucle WHILE");

        while (num <= 100) {
            System.out.println(num);
            num += 2;
        }
        System.out.println("\n");
        System.out.println("Bucle FOR");
        for (int i = 20; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
