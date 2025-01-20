package tema5;

import java.util.Scanner;

public class JgpT05E05Factorial {

    /*
* Fernando Parga Fernandez
* Ejercicio 5: Programa que calcule el factorial de números menores de 20. El programa permite al usuario 
* meter los números que desee y finalizará cuando meta un número menor que 1 o mayor que 20. 
* Crea las funciones que consideres útiles y que puedas reutilizar en otros programas.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 2;

        System.out.println("Introduce un numero para calcular su factorial (<1 o >20 cierra el programa): ");
        do {
            num = teclado.nextInt();
            if (num <= 20 && num >= 1) {
                System.out.println("El factorial es: " + calculoFactorial(num));

                System.out.println("Introduce otro numero (<1 o >20 cierra el programa): ");
            }

        } while (num >= 1 && num <= 20);
        System.out.println("Fin del programa.");

    }

    public static int calculoFactorial(int num) {
        int factorial = num;
        for (int i = (num - 1); i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
