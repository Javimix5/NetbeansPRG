/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la 
potencia.

 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int base, exponente, resultado = 1;

        System.out.println("Introduce un numero base: ");
        base = teclado.nextInt();

        System.out.println("Introduce un numero exponente: ");
        exponente = teclado.nextInt();

        if (exponente < 0) {
            System.out.println("Error, introduce un numero positivo");
        } else {
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }
            System.out.println("La potencia de " + base + " elevado a " + exponente + " es igual a: " + resultado);
        }

    }
}
