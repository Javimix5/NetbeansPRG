/*
 * Diseñar un programa que muestre los números pares comprendidos entre 
 * 100 y 1 en orden descendente. 
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
