/*
 * 4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
 * Crear una cadena formada por las 5 últimas posiciones de la cadena.

Hay que tener en cuenta que el 0 si es el inicio de la cadena pero el último caractér debe ser 5 ya que no se contabiliza como tal dicho 0
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01fStringFin {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();

        String cadena2 = cadena.substring(cadena.length()-5); 
           
        System.out.println("El texto resultante es: " + cadena2);
    }
}
