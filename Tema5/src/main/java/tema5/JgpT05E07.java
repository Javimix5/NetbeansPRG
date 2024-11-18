package tema5;

import java.util.Scanner;

public class JgpT05E07 {

    /*
* Fernando Parga Fernandez
* Ejercicio 7: Un número primo es aquel que solo tiene como divisores el número 1 y a él mismo. Usando 
la función del programa anterior, haz un programa que muestre la suma de los números primos 
comprendidos entre 1 y 1000. 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma = 0;

        System.out.println("Los numeros primos comprendidos entre 1 y 1000 son: ");

        for (int num = 1; num <= 1000; num++) {
            if (cantidadDivisores(num) == 2) {
                System.out.println(num);
                suma += num;
            }
        }
        System.out.println("Y su suma total es: " + suma);

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
