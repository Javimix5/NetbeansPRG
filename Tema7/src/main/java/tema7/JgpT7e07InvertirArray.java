/*
Ejercicio 7 - Dado un array de enteros, invierte el array.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JgpT7e07InvertirArray {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduca cuantos valores deseas");
        int tamaño = teclado.nextInt();

        int[] lista = new int[tamaño];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para la posicion: " + i);
            lista[i] = teclado.nextInt();

        }
        System.out.println("El array inicial es: " + Arrays.toString(lista));
        
        Invertir(lista);
        System.out.println("El array invertido es: " + Arrays.toString(lista));

    }// Fin main

    //Función Orden Ascendente
    public static void Invertir(int[] array) {
        int orden = 0;
        int j = (array.length - 1);

        for (int i = 0; i < array.length; i++) {
            if (i < j) {
                orden = array[i];
                array[i] = array[j];
                array[j] = orden;
                j--;
            } else {
                break;
            }

        }

    }

}// Fin clase
