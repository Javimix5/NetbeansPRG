package tema5repaso;

import java.util.Scanner;

public class JgpT05r04MultipRecursiva {

    /*
    
4. La multiplicación se puede programar de forma recursiva a través de la suma. Multiplicar un
número por otro es el mismo resultado que si sumamos el primer número a la multiplicación del
primer número por el anterior del otro, hasta llegar a que el otro número sea 1. Por ejemplo, 2 * 4 =
2 + 2 * 3.
Haz un programa donde se haga la multiplicación de manera recursiva.
IMPORTANTE: Si el primer número es menor que el segundo, podemos cambiarlos de orden para
que se hagan menos llamadas recursivas. Por ejemplo, 2 * 4 es igual a 4 * 2.

     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        
        System.out.println("Introduce el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el primer numero: ");
        num2 = teclado.nextInt();
        
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + multiplicar(num1, num2));

    }

    public static int multiplicar(int a, int b) {
        // Asegurar que el mayor número sea el primero para reducir llamadas recursivas
        if (a < b) {
            return multiplicar(b, a);
        }
        // Caso base: cuando el segundo número (num2) es 1
        if (b == 1) {
            return a;
        }
        // Llamada recursiva: sumar a con el resultado de multiplicar a por (num2-1)
        return a + multiplicar(a, b - 1);
    }
}
