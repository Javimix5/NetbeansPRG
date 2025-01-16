/*
Ejercicio 9 - Comprueba si esta un array ordenado ascendentemente.
 */
package boletinarrays;

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

        CheckOrden(lista);
        System.out.println("El array está en orden ascendente: " + CheckOrden(lista));

    }// Fin main

    //Función Comprobar Orden Ascendente
    public static boolean CheckOrden(int[] array) {
        boolean creciente = true;

        int anterior = Integer.MIN_VALUE;

        for (int i : array) {
            if (anterior < i) {
                anterior = i;
            } else {
                creciente = false;
            }

        }
        return creciente;
    }

}// Fin clase
