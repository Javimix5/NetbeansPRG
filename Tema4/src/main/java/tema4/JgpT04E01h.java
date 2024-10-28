/*
 * 4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
 * Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena 
es un número, esto es, contiene solo dígitos decimales (del 0 a 9) 
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01h {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de numeros: ");
        String cadena = teclado.nextLine();

        try {

            int numero = Integer.parseInt(cadena);
            System.out.println("La cadena convertida a numero entero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no es un numero valido.");
        }

    }
}
