/*
 * Imprime los números del 100 al 200 saltando de 2 en 2 de la siguiente manera:
100, 200, 102, 198, 104, 196, …, 152, 150.
 */
package jgp.bucles2;

import java.util.Scanner;

public class Bucles16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 100, num2 = 200;

        System.out.println("Bucle WHILE");

        while (num <= num2) {
            if (num == num2) {
                System.out.print(num);
            } else {
                System.out.print(num + ", " + num2);
            }
            if (num < num2) {
                System.out.print(", ");
            }
            num+=2;
            num2-=2;
        }
        System.out.println("\n");
        System.out.println("Bucle FOR");

        num = 100;
        num2 = 200;

        for (num = 100; num <= 150; num+=2) {
            if (num == num2) {
                System.out.print(num);
            } else {
                System.out.print(num + ", " + num2);
            }

            if (num < num2) {
                System.out.print(", ");
            }
            num2-=2;
        }
    }
}
