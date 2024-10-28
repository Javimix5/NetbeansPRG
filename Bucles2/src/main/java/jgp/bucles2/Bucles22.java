/*
 * Dado un número, imprime “El número es igual a 5” si el número es igual a 5.
 */
package jgp.bucles2;

import java.util.Scanner;

public class Bucles22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();

        if (num == 5) {
            System.out.println("El numero es igual a 5");
        } else {
            System.out.println("El numero es distinto a 5");
        }
}
}
