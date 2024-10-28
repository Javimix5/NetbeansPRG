/*
 * Realiza un programa que sume los 100 números siguientes a un número entero y positivo 
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un 
número positivo)

 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, suma = 0;

        System.out.println("Introduce un numero positivo para que se sumen los 100 siguientes: ");
        num = teclado.nextInt();

        if (num <= 0) {
            System.out.println("Error, introduce un numero positivo");
        } else {
            for (int i = 1; i <= 100; i++) {
                suma += (num + i);
            }
        }
        System.out.println("La suma de los 100 numeros es: " + suma);
    }
}
