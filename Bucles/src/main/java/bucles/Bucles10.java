/*
 * Escribe un programa que calcule la media de un conjunto de números positivos introducidos
por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario 
indicará que ha terminado de introducir los datos cuando meta un número negativo.

 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, suma = 0, media, totalNum = 0;
        boolean positivo = true;

        System.out.println("Introduce numeros enteros, cuando quieras finalizar, introduce uno negativo: ");

        do {
            num = teclado.nextInt();
            if (num < 0) {
                System.out.println("Ya no aceptamos mas numeros");
                positivo = false;
            } else {
                suma += num;
                totalNum++;
            }
        } while (positivo);
        media = (suma / totalNum);
        System.out.println("Esta es la media de los numero introducidos anteriormente: " + media);

    }
}
