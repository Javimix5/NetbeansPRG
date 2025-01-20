/*
 * 4.1. Realizar un programa al que se le introduzca una cadenaHEX por teclado y haga lo siguiente: 
 * Convertir la cadenaHEX de entrada a una variable de tipo int, suponiendo que dicha cadenaHEX 
es un número hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de 
la A a F.  
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01iStringHexaInt {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de numeros: ");
        String cadenaHEX = teclado.nextLine();

        if (esNumerico(cadenaHEX)) {
            // Convertir la cadenaHEX a un número entero
            int numero = Integer.parseInt(cadenaHEX,16);
            System.out.println("El numero convertido es: " + numero);
        } else {
            System.out.println("Error: La cadena no es un numero válido.");
        }

    }

    // Método para verificar si una cadenaHEX contiene solo dígitos
    public static boolean esNumerico(String cadenaHEX) {
        return cadenaHEX.matches("\\d+"); // Expresión regular que verifica solo dígitos del 0 al 9
    }
}
