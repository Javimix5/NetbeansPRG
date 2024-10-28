/*
 * Calcular la suma de los 100 números siguientes a uno tecleado previamente
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int n, valor;
        
        
        System.out.println("Introduce el numero del cual quieras saber la suma de los 100 siguientes");
        n = teclado.nextInt();
        
        valor = n;
        
        for (int i = 1; i <= 100; i++) {
            
            n += (valor + i);
        }           
            System.out.println("Esta es la suma " + n);
        

    }
}