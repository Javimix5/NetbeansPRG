/*
 * Programa que lea un número entero y determine si es mayor de 10
 * Autor: Javier González Prados
 */

package tema2;

import java.util.Scanner;

public class JgpT02E01A {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        System.out.println("Introduce un numero entero: ");
        num = teclado.nextInt();
        
        if (num > 10) System.out.println("El numero es mayor que 10");
        else if (num < 10) System.out.println("El numero es inferior a 10");
    }
}
