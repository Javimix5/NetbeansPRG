package tema5;

import java.util.Scanner;

public class JgpT05E06ContarDivisores {

    /*
* Fernando Parga Fernandez
* Ejercicio 6: Realiza una función llamada cantidadDivisores al que se le pase como parámetro un número 
entero y devuelva el número de divisores o bien cero si el número es negativo. Usa dicha función en 
un main.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para saber cuantos divisores tiene: ");
        int num = teclado.nextInt();

        System.out.println("El numero " + num + " tiene " + cantidadDivisores(num) + " divisores.");

    }

    public static int cantidadDivisores(int num) {

        if (num < 0) {
            return 0;
        } else {
            int contador = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    contador++;
                }
            }
            return contador;
        }
    }
}
