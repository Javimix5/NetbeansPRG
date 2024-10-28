/*
 * Programa que Lea dos números enteros y muestre si el primero es 
 * mayor que el segundo
 * Autor: Javier González Prados
 */

package tema2;

import java.util.Scanner;

public class JgpT02E01B {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.println("Introduce el primer numero entero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero entero: ");
        num2 = teclado.nextInt();
        
        if (num1 > num2) System.out.println("El primer numero es mayor que el segundo");
        else if (num1 < num2) System.out.println("El primer numero no es mayor que el segundo");
    }
}
