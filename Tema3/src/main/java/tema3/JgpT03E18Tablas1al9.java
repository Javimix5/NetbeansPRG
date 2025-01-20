/*
 * Mostrar las tablas de multiplicar del 1 al 9.  
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E18Tablas1al9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 9; i++) {
            System.out.println("\n"
                    + "Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
