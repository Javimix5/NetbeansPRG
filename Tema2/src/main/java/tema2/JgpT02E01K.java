/*
 * Programa que Lea un número entero y diga si es multiplo de 2, 3 y/o 10 
 * En caso de que no sea multiplo de 2, ya no lo será de 10
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E01K {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero entero: ");
        num = teclado.nextInt();

        if ((num % 10 == 0) && (num % 3 == 0)) {
            System.out.println("El numero es multiplo de 2 , 3 y/o 10");
        } else if ((num % 2 == 0) && (num % 3 == 0)) {
            System.out.println("El numero es multiplo de 2 y/o 3");
        } else if (num % 10 == 0) {
            System.out.println("El numero es multiplo de 2 y/o 10");
        } else if (num % 3 == 0) {
            System.out.println("El numero es multiplo de 3");
        } else if (num % 2 != 0) {
            System.out.println("El numero no es multiplo de 10");
        }
    }
}
