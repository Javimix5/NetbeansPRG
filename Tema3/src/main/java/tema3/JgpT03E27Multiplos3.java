/*
 * La suma de los dígitos de los números múltiplos de tres es también un múltiplo de tres. 
Realizar un programa que compruebe si esta afirmación es correcta o no para los primeros 10000 
números enteros positivos.
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E27Multiplos3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean correcta = true;

        for (int i = 1; i <= 10000; i++) {
            if (i % 3 == 0) {
                int suma = ((i % 10) + (i / 10));
                if (suma % 3 != 0) {
                    correcta = false;
                    System.out.println("La afirmacion no se cumple para el numero: " + i
                            + ". Suma de digitos: " + suma);
                    break;
                }
            }
        }

        if (correcta) {
            System.out.println("La afirmacion es correcta para los primeros 10,000 numeros enteros positivos.");
        } else {
            System.out.println("La afirmacion no es correcta.");
        }

    }
}
