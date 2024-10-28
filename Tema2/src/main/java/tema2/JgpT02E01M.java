/*
 * Programa que Lea tres números enteros y diga hay alguno mayor que cero,  
 * pero no todos.
 * Autor: Javier González Prados
 */

package tema2;

import java.util.Scanner;

public class JgpT02E01M {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1,num2,num3;
        
        System.out.println("Introduce el primer numero entero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero entero: ");
        num2 = teclado.nextInt();
        System.out.println("Introduce el tercer numero entero: ");
        num3 = teclado.nextInt();
        
        if ((num1 > 0) && (num2 > 0) && (num3 > 0)) System.out.println("Fallo todos son mayores a 0");
        else if(num1 <= 0 && num2 <= 0 && num3 <= 0) System.out.println("Ningun numero es mayor a 0");
        else System.out.println("Al menos uno es mayor a cero");
    }
}
