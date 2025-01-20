/*
 * 4.1. Realizar un programa al que se le introduzca una cadenaHEX por teclado y haga lo siguiente: 
 * Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)  
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01mStringPalindromo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        // Limpiar la cadena: quitar espacios y convertir a minúsculas
        String cadenaLimpia = cadena.replaceAll("\\s+", "").toLowerCase();

        // Invertir la cadena limpia y compararla con la original
        String cadenaInvertida = new StringBuilder(cadenaLimpia).reverse().toString();

        if (cadenaLimpia.equals(cadenaInvertida)) {
            System.out.println("La cadena es un palindromo.");
        } else {
            System.out.println("La cadena NO es un palindromo.");
        }
    }

}
