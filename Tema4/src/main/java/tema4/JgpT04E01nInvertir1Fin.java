/*
 * 4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
 * Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones 
 * intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”  
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01nInvertir1Fin {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        if (cadena.length() < 2) {
            System.out.println("La cadena resultante es: " + cadena);
        } else {
            // Crear una nueva cadena con el primer y último caracteres intercambiados
            String cadenaModificada = cadena.charAt(cadena.length() - 1)
                    + cadena.substring(1, cadena.length() - 1)
                    + cadena.charAt(0);

            System.out.println("La cadena resultante es: " + cadenaModificada);
        }
    }

}
