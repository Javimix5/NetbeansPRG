/*
 * Programa que Lea un número entero y de determinar si se trata de 
 * un número par o impar.
 * Autor: Javier González Prados
 */

package tema2;

import java.util.Scanner;

public class JgpT02E01C {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        System.out.println("Introduce un numero entero: ");
        num = teclado.nextInt();
                
        if (num % 2 == 0) System.out.println("El numero es par");
        else System.out.println("El numero es impar");
    }
}
