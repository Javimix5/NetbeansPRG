/*
 * Imprime los números del 100 al 120 saltando de 4 en 4..
 */
package jgp.bucles2;


import java.util.Scanner;

public class Bucles11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 100;

        System.out.println("Bucle WHILE");

        while (num <= 120) {
            System.out.println(num);
            num += 4;
        }
        System.out.println("\n");
        System.out.println("Bucle FOR");
        for (int i = 100; i <= 120; i += 4) {
            System.out.println(i);
        }
    }
}
