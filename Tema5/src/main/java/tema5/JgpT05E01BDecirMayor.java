/*
 * 5.1. Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a 
dichas funciones: 
 
• Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos. 
 
 */
package tema5;

import java.util.Scanner;

public class JgpT05E01BDecirMayor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Introduce el primer numero");
        num1 = teclado.nextDouble();
        System.out.println("Introduce el segundo numero");
        num2 = teclado.nextDouble();
        System.out.println("Introduce el tercer numero");
        num3 = teclado.nextDouble();

        double mayor = mayor(num1, num2, num3);
        System.out.println("El mayor de los tres números es: " + mayor);
    }

    public static double mayor(double num1, double num2, double num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
