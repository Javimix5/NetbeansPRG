/*
 * 4.1. Realizar un programa al que se le introduzca una cadenaHEX por teclado y haga lo siguiente: 
 * Decir cuántos dígitos numéricos hay en la cadena  
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01lContarString {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 0;

        System.out.println("Introduce un numero para contar sus digitos:");
        String cadena = teclado.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Numero de digitos en la cadena: " + contador);
    }

}
