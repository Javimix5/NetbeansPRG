/*
 * 4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
 * Decir si en la cadena aparece el carácter ‘x’
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto: ");
        String letras = teclado.nextLine();

        if (letras.contains("x")|| letras.contains ("X")) {
            System.out.println("La cadena contiene alguna X o x");
        } else {
            System.out.println("La cadena no contiene ninguna X o x");
        }
    }
}
