/*
 * 4.1. Realizar un programa al que se le introduzca una cadenaHEX por teclado y haga lo siguiente: 
 * Decir si la primera posición de la cadena es igual a la última  
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01k {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String cadena = teclado.nextLine();

        if (!cadena.isEmpty()) {
            boolean Iguales = cadena.charAt(0) == cadena.charAt(cadena.length() - 1);
            System.out.println("L primera y la ultima posicion sin iguales " + Iguales);
        } else {
            System.out.println("Cadena vacia");
        }

    }

}
