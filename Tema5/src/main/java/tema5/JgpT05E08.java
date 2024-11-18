package tema5;

import java.util.Scanner;

public class JgpT05E08 {

    /*
* Fernando Parga Fernandez
* Ejercicio 8: Un número primo es aquel que solo tiene como divisores el número 1 y a él mismo. Usando 
la función del programa anterior, haz un programa que muestre la suma de los números primos 
comprendidos entre 1 y 1000. 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce un segundo numero: ");
        int num2 = teclado.nextInt();

        if (cantidadDivisores(num1) > cantidadDivisores(num2)) {
            System.out.println("El numero con mayor cantidad de divisores es: " + num1);
        } else {
            if (cantidadDivisores(num2) > cantidadDivisores(num1)) {
                System.out.println("El numero con mayor cantidad de divisores es: " + num2);
            } else {
                System.out.println("Los dos numeros tienen la misma cantidad de divisores.");
            }
        }

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
