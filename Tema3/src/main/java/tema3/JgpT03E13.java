/*
 * Programa al que le introduzcas un número y que garantice que es positivo, 
 * es decir si lo introducimos menor o igual que cero nos obligará a volver a 
 * introducirlo las veces que sea necesario hasta que se introduzca uno positivo.
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        boolean positivo = true;

        System.out.println("Introduce el valor de N: ");

        while (true) {
            n = teclado.nextInt();
            if (n > 0) {
                positivo = false;
                break;
            } else {
                System.out.println("Error introduce un numero positivo");
            }
        }
        System.out.println("El numero " + n + " es positivo");
    }
}
