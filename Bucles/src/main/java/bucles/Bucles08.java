/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, producto;

        System.out.println("Introduce un numero para mostrar su tabla de multiplicar: ");
        num = teclado.nextInt();

        System.out.println("Esta es la tabla del " + num + "\n");

        for (int i = 0; i <= 10; i++) {
            producto = (num * i);

            System.out.println(num + "x" + i + "=" + producto);
        }
    }

}
