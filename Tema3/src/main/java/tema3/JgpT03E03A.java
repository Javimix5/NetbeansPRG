/*
 * Diseñar un algoritmo que permita introducir números positivos y nos vaya 
 * informando uno a uno si es par o impar. El programa finalizará cuando se 
 * introduzca un número negativo.
 * 
 * Versión con una lectura de teclado adelantada (antes de entrar en el bucle)
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E03A {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float n;

        System.out.println("Introduce un numero para saber si es par o impar (si introduces uno negativo se parara la operacion): ");
        n = teclado.nextInt();

        while (n >=0) {
            if (n % 2 == 0){
            System.out.println("Es un numero par");
            }else{ System.out.println("Es un numero impar");
            }
            System.out.println("Introduce un numero para saber si es par o impar (si introduces uno negativo se parara la operacion): ");
            n = teclado.nextFloat();          
        }

    }
}