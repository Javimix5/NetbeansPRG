/*
 * 5.1. Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a 
dichas funciones: 

• Función llamada par() que se le pasa un entero y devuelve true si es par, false si no lo 
es. 
 
 */
package tema5;

import java.util.Scanner;

public class JgpT05E01ABooleanPar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para decir si es par");
        int num = teclado.nextInt();

        if (esPar(num)) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    public static boolean esPar(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
