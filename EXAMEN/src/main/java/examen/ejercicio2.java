/*
 * Ejercicio 2: Hacer un cuadrado vacio
 */
package examen;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        boolean fallo = true;

        do {
            System.out.println("Introduce un numero entre 10 y 20 para generar un cuadrado: ");
            num = teclado.nextInt();
            if (num > 10 && num < 20) {
                fallo = false;
            } else {
                System.out.println("Fallo");
            }
        } while (fallo);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}


//Para realizar un rectangulo habria que declarar la variable para el ancho (int ancho = num*1.5)
