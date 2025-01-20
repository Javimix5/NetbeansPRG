/*
 * 5.1. Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a 
dichas funciones: 
 
• Función llamada aleatorio() que se le pasan dos valores enteros devuelve un entero al 
azar comprendido entre esos dos valores (el primero es menor que el segundo, y ambos 
mayores que cero, en caso contrario devuelve -1)
 
 */
package tema5;

import java.util.Scanner;

public class JgpT05E01EAleatorioEntre2num {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduce el primer numero");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        num2 = teclado.nextInt();

        int aleatorio = aleatorio(num1, num2);
        System.out.println("Este es el resultado: " + aleatorio);
    }

    public static int aleatorio(int num1, int num2) {
        if (num1 > 0 && num2 > 0 && num1 < num2) {
            return (int) (Math.random() * (num2 - num1 + 1)) + num1;
        } else {
            return -1;
        }
    }

}
