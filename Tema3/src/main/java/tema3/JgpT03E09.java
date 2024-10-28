/*
 * Sumar una cantidad de números que se van introduciendo por teclado hasta 
 * que la suma de los mismos valga más de 100
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int n;
        int valor = 0;
        
        while (valor <= 100) {
            System.out.println("Introduce el numero del cual quieras saber la suma de los 100 siguientes");
            n = teclado.nextInt();
                
            valor += n;
            }       
            System.out.println("Esta es la suma " + valor);
        
        
    }
}