package tema5repaso;

import java.util.Scanner;

public class JgpT05r04 {

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

        System.out.println("Introduce dos numero para multiplicar de forma recursiva: ");
        System.out.println("Numero 1: ");
        num1 = teclado.nextInt();
        System.out.println("Numero 2: ");
        num2 = teclado.nextInt();

        int resultado = Optimizar(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + resultado);
        
    }

    public static int multiplicar(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return a + multiplicar(a, (b - 1));
        }
        
    }

    public static int Optimizar(int a, int b){
    
        if (a < b){
        return multiplicar(b, a);
        } else  {
        return multiplicar(a, b);
        }
        
    }
}
