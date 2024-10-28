/*
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle 
while
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int i = 320;
        
        while ((i <= 320) && (i >= 160)) {
            System.out.println(i);
            i -= 20;
        }

    }
}
