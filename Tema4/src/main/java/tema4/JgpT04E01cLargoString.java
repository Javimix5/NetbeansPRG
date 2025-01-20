/*
 * 4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
 * Decir si la cadena tiene más de 10 posiciones
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01cLargoString {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto: ");
        String letras = teclado.nextLine();

        int longitud = letras.length ();
        if (longitud >=10) {
            System.out.println("El texto tiene mas de 10 caracteres");
        } else {
            System.out.println("El texto NO tiene mas de 10 caracteres");
        }
    }
}
