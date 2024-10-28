/*
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos 
anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 
144… El número n se debe introducir por teclado.

 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int ant = 0, ant2 = 1, num, a;
        
        System.out.print("Introduce la cantidad de numeros que deseas que se muestre en el bucle: ");
        a = teclado.nextInt();
        
        for (int i = 1; i <= a; i++) {
            System.out.println(ant);
            
            num = ant + ant2;
            
            ant = ant2;  ant2 = num;

        }
    }
}
