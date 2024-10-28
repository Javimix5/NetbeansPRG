/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros 
números enteros a partir de uno que se introduce por teclado.

 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero para calcular los siguientes 5 y mostrar en columnas sus cuadrados y cubos: ");
        num = teclado.nextInt();

        for (int i = num; i <= (num + 5); i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + "\t" + cuadrado + "\t" + cubo);
            /*System.out.printf("%-10d %-10d %-10d %n", i, cuadrado, cubo);*/

        }
    }
}
