/*
 * Mostrar por pantalla los n primeros números naturales, siendo n el valor tecleado 
 * previamente
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int n;
        
        System.out.println("Introduce un numero: ");
        n = teclado.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}
