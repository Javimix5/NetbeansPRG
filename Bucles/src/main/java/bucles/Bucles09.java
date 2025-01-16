/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. 
Hay que realizar el ejercicio utilizando bucles. La única limitación en el número de dígitos 
la establece el tipo de dato que se utilice (int o long).
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles09 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        

        int num, digitos = 0;

        System.out.println("Introduce un numero para informar de cuantos digitos esta formado: ");
        num = teclado.nextInt();

        if (num < 0) {
            num = Math.abs(num);
        }
        do {
            num /= 10;  /*cada vez que divide entre 10, cuenta un digito por cada movimiento de su coma y lo suma interntamente*/
            digitos++;
        } while (num > 0);
        System.out.println("El numero tiene " + digitos + " digitos");
    }

}
