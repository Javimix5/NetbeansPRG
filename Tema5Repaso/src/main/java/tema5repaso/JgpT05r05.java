package tema5repaso;

import java.util.Scanner;

public class JgpT05r05 {

    /*
    
5. Programa una función recursiva para el cálculo de una potencia. Para pensarlo de forma
recursiva, una potencia de un número es lo mismo que multiplicar la base por un exponente una
unidad menor. Por ejemplo, 24
 = 2 * 23
. Como caso base, cuando el exponente es 1, el resultado de
la potencia es la base, y cuando el exponente es 0, el resultado de la potencia es 1.

     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int base,exponente;
        

        System.out.println("Introduce una base: ");
        base = teclado.nextInt();
        System.out.println("Introduce una exponente: ");
        exponente = teclado.nextInt();

        
        System.out.println(base + " elevado a la " + exponente + " es: " + potencia(base, exponente));
    }

    public static int potencia(int base, int exponente) {
        /* Caso base: cualquier número elevado a 0 es 1 */
        if (exponente == 0) {
            return 1;
        }
        /* Cuando el exponente es 1, el resultado es la base */
        if (exponente == 1) {
            return base;
        }
        /*
        if (exponente < 0) {
            return 1.0 / potencia(base, -exponente);
        */

        return base * potencia(base, exponente - 1);

    }
}
