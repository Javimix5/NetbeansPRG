/*
 * Programa que muestre los número primos comprendidos entre 2 y 1000. Hacer 
 * los bucles con un número mínimo de iteraciones (se permite el uso de break) 
 * sabiendo que: 
 * - Un número primo es solo divisible por 1 y el mismo.
 * - Los números primos son todos impares salvo el 2. 
 * - Los divisores de un número siempre son menores que la mitad de dicho número 
 * (salvo el mismo). 
 * - Si un número no es divisible por 2 ya no va a serlo por ningún otro 
 * número par. 
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E20 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        for (int i = 3; i <= 1000; i += 2) {
            boolean primo = true;
                        
            for (int divisor = 3; divisor <= Math.sqrt(i); divisor += 2) {
                if (i % divisor == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}
