/*
 * 4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
 * Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena 
es un número, esto es, contiene solo dígitos decimales (del 0 a 9) 
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01hStringInt {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de numeros: ");
        String cadena = teclado.nextLine();

        if (esNumerico(cadena)) {
            // Convertir la cadena a un número entero
            int numero = Integer.parseInt(cadena);
            System.out.println("El numero convertido es: " + numero);
        } else {
            System.out.println("Error: La cadena no es un numero válido.");
        }

    }

    // Método para verificar si una cadena contiene solo dígitos
    public static boolean esNumerico(String cadena) {
        return cadena.matches("\\d+"); // Expresión regular que verifica solo dígitos del 0 al 9
    }
}
