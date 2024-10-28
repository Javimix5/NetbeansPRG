/*
 * Programa que Lea dos números enteros y diga si al menos uno de los
 * dos es mayor de 10
 * Autor: Javier González Prados
 */

package tema2;

import java.util.Scanner;

public class JgpT02E01E {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.println("Introduce el primer numero entero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero entero: ");
        num2 = teclado.nextInt();
        
        if ((num1 > 10 && 10 > num2)||(num1 < 10 && 10 < num2)) System.out.println("Al menos uno de los numeros es mayor a 10");
        else System.out.println("Ambos numeros son simultaneamente mayores o menores a 10");
    }
}
