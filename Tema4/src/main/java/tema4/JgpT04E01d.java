/*
 * 4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
 * Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01d {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();

        String cadena2 = cadena.substring(3);
                
        if (cadena.contains("x")|| cadena.contains ("X")) {
            System.out.println("La cadena contiene alguna X o x");
        } else {
            System.out.println("La cadena no contiene ninguna X o x");
        }
    }
}
