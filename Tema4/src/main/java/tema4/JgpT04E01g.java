/*
 * 4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
 * Decir si la cadena es igual a la cadena “hola”
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01g {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

               
        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();

        if (cadena.equalsIgnoreCase("hola")) {
            System.out.println("La cadena es igual a \"hola\".");
        } else {
            System.out.println("La cadena NO es igual a \"hola\".");
        }
    }
}
