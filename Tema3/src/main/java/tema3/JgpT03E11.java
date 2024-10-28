/*
 * Diseñar un algoritmo capaz de leer dos valores enteros, m y n, y nos 
 * muestre los números comprendidos entre ellos ordenados ascendentemente, junto
 * con el valor de elevar cada uno de esos números al cuadrado. No se sabe 
 * si m > n, pero se desea utilizar una sola sentencia repetitiva tanto 
 * si m > n como si m < n
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, m;

        System.out.println("Introduce el valor de N: ");
        n = teclado.nextInt();
        System.out.println("Introduce el valor de M: ");
        m = teclado.nextInt();

        if (n < m) {
            for (int i = n; i <= m; i++) {
                System.out.println("Los numeros son los siguientes: " + i + " ,valor al cuadrado de cada uno: " + (i * i));
            }
        } else {
            for (int i = m; i <= n; i++) {
                System.out.println("Los numeros son los siguientes8: " + i + " ,valor al cuadrado de cada uno: " + (i * i));

            }
        }
    }
}
