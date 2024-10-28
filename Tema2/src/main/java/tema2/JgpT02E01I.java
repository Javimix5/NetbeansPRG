/*
 * Programa que Lea dos números enteros y diga si el segundo 
 * es divisor del primero 
 * Autor: Javier González Prados
 */

package tema2;

import java.util.Scanner;

public class JgpT02E01I {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.println("Introduce el primer numero entero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero entero: ");
        num2 = teclado.nextInt();
        
        if ((num1 != 0) && (num1 % num2 == 0)) System.out.println("El segundo numero es divisor del primero");
        else System.out.println("El segundo no es divisor del primero");
    }
}
