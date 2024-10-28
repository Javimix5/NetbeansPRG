/*
 * Escribe un programa que diga si un número introducido por teclado es o no primo. Un 
número primo es aquel que sólo es divisible entre él mismo y la unidad. 

 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        boolean primo = true;

        System.out.println("Introduce un numero para averiguar si es primo: ");
        num = teclado.nextInt();

        for (int i = 2; i <= Math.sqrt(num); i ++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
