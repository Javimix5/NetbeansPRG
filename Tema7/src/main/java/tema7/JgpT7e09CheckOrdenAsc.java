/*
Ejercicio 9 - Crea un programa que verifique si un array está ordenado de forma ascendente.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JgpT7e09CheckOrdenAsc {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduca cuantos valores deseas");
        int tamaño = teclado.nextInt();

        int[] lista = new int[tamaño];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para la posicion: " + i);
            lista[i] = teclado.nextInt();

        }

        System.out.println("Los enteros introducidos son estos:");
        System.out.println(Arrays.toString(lista));

        if (Orden(lista)) {

            System.out.println("El array esta en orden ascendente");

        } else {
            System.out.println("El array NO esta en orden ascendente");
        }

    }// Fin main5

    //Función Comprobar si esta en Orden Ascendente
    public static boolean Orden(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}// Fin clase
