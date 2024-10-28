/*
 * Imprime los números del 100 al 200 de la siguiente manera:
100, 200, 101, 199, 102, 198,…, 151, 150.
 */
package jgp.bucles2;

import java.util.Scanner;

public class Bucles15 {

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
            num++;
            num2--;
        }
        System.out.println("\n");
        System.out.println("Bucle FOR");

        num = 100;
        num2 = 200;

        for (num = 100; num <= 150; num++) {
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
