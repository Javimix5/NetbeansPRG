/*
Ejercicio 4 - Dado un array de enteros, ordena de forma ascendente.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JgpT7e04OrdenAsc {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduca cuantos valores deseas");
        int tamaño = teclado.nextInt();

        int[] lista = new int[tamaño];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para la posicion: " + i);
            lista[i] = teclado.nextInt();

        }
        Orden(lista);
        System.out.println("El orden ascendente es: " + Arrays.toString(lista));

    }// Fin main

    //Función Orden Ascendente
    public static void Orden(int[] array) {
        int Orden = 0;
        
        for (int i = 0; i < array.length-1; i++) {
            int posMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[posMin]) {
                    posMin = j;
                }
            }
            //intercambio del actual i con el menor 
            Orden = array[i];
            array[i] = array[posMin];
            array[posMin] = Orden;
        }
        
    }

}// Fin clase
