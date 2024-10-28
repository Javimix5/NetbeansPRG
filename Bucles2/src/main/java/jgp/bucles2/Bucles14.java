/*
 * Imprime los números del 100 al 120 de la siguiente manera:
100, 120, 101, 119, 102, 118,…, 111, 110.
 */
package jgp.bucles2;

import java.util.Scanner;

public class Bucles14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 100, num2 = 120;

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
            num++;
            num2--;
        }
        System.out.println("\n");
        System.out.println("Bucle FOR");

        num = 100;
        num2 = 120;

        for (num = 100; num <= 110; num++) {
            if (num == num2) {
                System.out.print(num);
            } else {
                System.out.print(num + ", " + num2);
            }

            if (num < num2) {
                System.out.print(", ");
            }
            num2--;
        }
    }
}
