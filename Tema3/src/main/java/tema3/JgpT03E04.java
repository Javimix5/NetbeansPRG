/*
 * Diseñar un programa capaz de leer un valor entero, que verifique que 
 * esté comprendido entre 1 y 10, y mostrar su tabla de multiplicar
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.println("Introduce un numero entre 1 y 10 para calcular su tabla de multiplicar: ");
        n = teclado.nextInt();

        if ((n <= 10) && (n >= 1)) {

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }

        } else {
            System.out.println("Error, numero menor a 1 o mayor a 10 ");
        }

    }
}
