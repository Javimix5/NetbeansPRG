/*
 * Programa que se le introduzcan números por consola y que informe si están 
 * ordenados ascendentemente o no. El programa finaliza si se introduce cero 
 * o en cuanto se detecte que los números no están ordenados.  
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E19 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = 1, num;

        System.out.println("Introduce numeros en orden, en caso de introducir 0 o esten desordenados se parara el proceso");
        num = teclado.nextInt();

        while ((n != 0) || (num != 0)) {
            System.out.println("Introduce otro numero: ");
            n = teclado.nextInt();

            if (n > num) {
                System.out.println("Estan en orden");

            } else {
                System.out.println("No esta en orden");
            }
            num = n;

        }
    }
}
