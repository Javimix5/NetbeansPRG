/*
 * Escribe un programa que dados dos números, uno real (base) y un entero positivo 
(exponente), saque por pantalla todas las potencias con base el numero dado y exponentes 
entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación. Por
ejemplo, si introducimos el 2 y el 5, se deberán mostrar 21, 22, 23, 24 y 25.

 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int base,exponente,resultado = 1;

        System.out.println("Introduce un numero base: ");
        base = teclado.nextInt();

        System.out.println("Introduce un numero exponente: ");
        exponente = teclado.nextInt();

        if (exponente <= 0) {
            System.out.println("Error, introduce un numero positivo");
        } else {
            for (int i = 1; i <= exponente; i++) 
            {
                                 resultado *= base;   
                
               System.out.println("Las potencias de " + base + " elevado a " + i + " es igual a: " + resultado); 
            }
            
        }

    }
}
