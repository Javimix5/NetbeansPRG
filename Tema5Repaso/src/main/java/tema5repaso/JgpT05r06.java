package tema5repaso;

import java.util.Scanner;

public class JgpT05r06 {

    /*
    
6. El máximo común divisor se puede calcular de forma recursiva con el algoritmo de Euclides que
afirma que:
mcd(a,b) = mcd(min(a,b), |a-b|)
El caso base será cuando ambos números sean iguales, ya que el mcd(a, a) = a.
IMPORTANTE: Solo se calcula el mcd para números positivos.

     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a,b;
        
        System.out.println("Introduce dos numeros para saber el MCD (Maximo Comun Divisor: ");
        System.out.println("Numero 1: ");
        a = teclado.nextInt();
        System.out.println("Numero 2: ");
        b = teclado.nextInt();

        
     System.out.println("El MCD de " + a + " y " + b + " es: " + mcd(a, b));
    }

    public static int mcd(int a, int b) {
        // Asegurarse de que ambos números son positivos
        a = Math.abs(a);
        b = Math.abs(b);
        
        // Caso base: cuando ambos números son iguales
        if (a == b) {
            return a;
        }
        // Caso recursivo: calcular mcd(min(a, b), |a - b|)
        if (a > b) {
            return mcd(b, a - b);
        } else {
            return mcd(a, b - a);
        }
    }
}
