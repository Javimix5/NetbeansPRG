/*
 * Utiliza continue: Imprime los números del 100 al 200 saltando los números del 10 al 80
 */
package jgp.bucles2;

import java.util.Scanner;

public class Bucles18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 100;

        System.out.println("Bucle WHILE");

        while (num <= 200) {

            if (num >= 110 && num <= 180) {
                num++;
                continue;
            }
            System.out.print(num + ", ");
            num++;
        }
        System.out.println("\n");
        System.out.println("Bucle FOR");

        num = 100;

        for (num = 100; num <= 200; num++) {

            if (num >= 110 && num <= 180) {
                continue;
            }
            System.out.print(num + ", ");
        }
    }
}
