/*
 * 4.1. Realizar un programa al que se le introduzca una cadenaHEX por teclado y haga lo siguiente: 
 * Si se encuentra con en su interior con “prueva” sustituir por “prueba”  
 */
package tema4;

import java.util.Scanner;

public class JgpT04E01j {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una frase que incluya la palabra prueva");
        String cadenaHex = teclado.nextLine();

        
        String cadenaCorregida = cadenaHex.replace("prueva", "prueba");

        System.out.println("Cadena corregida: " + cadenaCorregida);
        

    }

    
}
