/*
 * 5.1. Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a 
dichas funciones: 
 
• Función llamada contarCeros() que se le pasa una cadena y devuelve la cantidad de ceros 
que tiene
 
 */
package tema5;

import java.util.Scanner;

public class JgpT05E01D {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de numeros con algun ceros (0)");
        String cadena = teclado.next();

        // Llamada a la función contarCeros() e impresión del resultado
        int cantidadCeros = contarCeros(cadena);
        System.out.println("La cantidad de ceros en la cadena es: " + cantidadCeros);

    }

    public static int contarCeros(String cadena) {
        int contador = 0;

        // Recorre cada carácter de la cadena y cuenta los ceros
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0') {
                contador++;
            }
        }
        return contador;
    }
}
