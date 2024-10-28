/*
 * Programa que Lea dos números enteros y diga si  
 * el menor de ellos es divisor del mayor 
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E01J {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduce el primer numero entero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero entero: ");
        num2 = teclado.nextInt();

        if (((num1 > num2) && ((num2 != 0) && (num1 % num2 == 0))) || ((num2 > num1) && ((num1 != 0) && (num2 % num1 == 0)))) System.out.println("El numero menor es dividendo del mayor");
        else System.out.println("El numero menor No es dividendo del mayor");
        
    }
}
