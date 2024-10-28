/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int i = 5;
        
        while ((i >= 5) && (i <= 100)){
        if (i% 5==0){
              System.out.println(i);  
            }
        i++;
        }
    }
}
