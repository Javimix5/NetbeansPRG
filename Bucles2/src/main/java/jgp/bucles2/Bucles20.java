/*
 * Utiliza continue y break: Imprime los números a partir de 100 saltando los números múltiplos de 10 y parando cuando la suma de los números impresos sea superior a 1500.
 */
package jgp.bucles2;

import java.util.Scanner;

public class Bucles20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 100, digito = 0;

        System.out.println("Bucle WHILE");

        while (num <= 1500) {

            if (num % 10 == 0) {
                num++;
                continue;

            }
            System.out.print(num + ", ");
            digito += num;
            num++;

            if (digito > 1500) {
                break;
            }
        }

        System.out.println("\n");
        System.out.println("Bucle FOR");

        digito = 0;

        for (int i = 100;; i++) {

            if (i % 10 == 0) {
                continue;
            }
            digito += i;
            System.out.print(i + ", ");

            if (digito > 1500) {
                break;
            }
        }
    }
}
