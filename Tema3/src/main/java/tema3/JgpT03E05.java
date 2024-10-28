/*
 * Sumar una cantidad de números que se van introduciendo, siempre que 
 * sean positivos hasta que se teclee el -1
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = 0, total = 0;

        while (n != -1) {
            System.out.println("Introduce un numero para ir sumando (-1 para finalizar): ");
            n = teclado.nextInt();

            total += n;

            System.out.println("Total: " + total);
        }
    }
}
