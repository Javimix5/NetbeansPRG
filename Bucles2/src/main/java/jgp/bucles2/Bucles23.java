/*
 * Dado un número, imprime “El número es par entre 1 y 10” si es igual a 2, 4, 6, 8 o 10 y “El número no es par o no está entre 1 y 10” en caso contrario.
 */
package jgp.bucles2;

import java.util.Scanner;

public class Bucles23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();

        if (num >= 1 && num <=10) {
            System.out.println("El número no es par o no está entre 1 y 10");
            if (num %2 ==0) {
               System.out.println("El número es par entre 1 y 10"); 
            }
        } else {
            System.out.println("No es un numero entre 1 y 10");
        }
}
}
