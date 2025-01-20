/*
 * 5.1. Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a 
dichas funciones: 
 
• Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long con la suma 
de los números comprendidos entre los números pasados (el primero es menor que el 
segundo, y ambos mayores que cero, en caso contrario devuelve -1)
 
 */
package tema5;

import java.util.Scanner;

public class JgpT05E01CSumarLong {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        long num1, num2;

        System.out.println("Introduce el primer numero");
        num1 = teclado.nextLong();
        System.out.println("Introduce el segundo numero");
        num2 = teclado.nextLong();

        long resultado = sumaIntervalo(num1, num2);
        System.out.println("La suma entre los numeros dados es: " + resultado);
    }

    public static long sumaIntervalo(long num1, long num2) {
        if ((num1 >= 0) && (num2 >= 0) && (num1 < num2)) {
            long suma = 0;
            for (long i = num1 + 1; i < num2; i++) {
                suma += 1;
            }
            return suma;
        } else {
            return (-1);
        }
    }

}
