/*
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i = 320;

        do {
            System.out.println(i);
            i -= 20;
        } while ((i >= 160) && (i <= 320));
    }
}
