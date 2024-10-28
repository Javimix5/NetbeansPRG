/*
 * Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y 
cuántos son negativos.

 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int positivos = 0;
        int negativos = 0;
        int cantidadNum = 0;

        System.out.println("Introduce 10 numeros: ");

        do {
            num = teclado.nextInt();
            if (num < 0) {
                negativos++;
            } else {
                positivos++;
            }
            cantidadNum++;
            System.out.println("Numeros restantes: " + (10 - cantidadNum));
        } while (cantidadNum != 10);
        System.out.println("Total numeros positivos: " + positivos);
        System.out.println("Total numeros negativos: " + negativos);

    }
}
