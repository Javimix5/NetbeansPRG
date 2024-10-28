/*
 * Diseñar un algoritmo que informe de los números perfectos que hay 
 * entre 1 y 10000. Un número perfecto si es igual a la suma de todos 
 * los divisores menores que él.
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 10000; i++) {
            int sumaDiv = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sumaDiv += j;
                }
            }
            if (i == sumaDiv) {
                System.out.println(i);
            }
        }
    }
}
