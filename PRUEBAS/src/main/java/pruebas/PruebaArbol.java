/*
 * Estructura de Arbol con *
 */
package pruebas;

import java.util.Scanner;

public class PruebaArbol {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.print("\n");
            System.out.println("");
        }
    }
}
