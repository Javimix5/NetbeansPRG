/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles03 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        

        int i = 5;

        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while ((i >= 5) && (i <= 100));
    }
}
