/*
 * 5.2. Programa que presente un menú y permita calcular repetidas veces a) el área de círculo –
necesitará el radio- , b) el área de cuadrado –necesitará el lado - , c) el área de triángulo –necesitará 
base y altura – d) Salir. Usar funciones para cada una de las 3 opciones
 
 */
package tema5;

import java.util.Scanner;

public class JgpT05E02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

       
    }

    public static int aleatorio(int num1, int num2) {
        if (num1 > 0 && num2 > 0 && num1 < num2) {
            return (int) (Math.random() * (num2 - num1 + 1)) + num1;
        } else {
            return -1;
        }
    }

}
