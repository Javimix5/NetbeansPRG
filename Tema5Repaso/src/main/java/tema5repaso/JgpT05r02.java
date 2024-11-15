/*
5.1. Programa una función, comprobarParentesis() para que recibe como entrada un String y
devuelve verdadero o falso. La función comprobará si hay tantos paréntesis de apertura como de
cierre. Si son iguales ambos números, devolverá true, en caso contrario, false.
Ejemplos de ejecución:
(6 + 4) * 2 → true
((6 * 3) → false

 */
package tema5repaso;

import java.util.Scanner;

public class JgpT05r02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de numeros con ():");
        String cadena = teclado.nextLine();

        boolean comprobarParentesis = comprobarParentesis(cadena);

        System.out.println(comprobarParentesis);

    }

    public static boolean comprobarParentesis(String cadena) {

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == '(') {
                contador++;
            } else if (c == ')') {
                contador--;
            }
        }
        if (contador != 0) {
            return false;
        }
        return true;
    }
}
