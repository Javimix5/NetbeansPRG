/*
 * 4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
 * Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto: ");
        String letras = teclado.nextLine();

        System.out.println("En mayusculas " + letras.toUpperCase());

        System.out.println("En minusculas " + letras.toLowerCase());
    }
}
