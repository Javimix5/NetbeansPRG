/*
Ejercicio 8 - Programa que elimine un array y devuelva el array modificado.
 */
package boletinarrays;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JgpT7e08BuscaElimina {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduca cuantos valores deseas");
        int tamaño = teclado.nextInt();
        int numElim = 0;

        int[] lista = new int[tamaño];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para la posicion: " + i);
            lista[i] = teclado.nextInt();

        }
        System.out.println("Escribe el numero que quieres eliminar");
        numElim = teclado.nextInt();

        System.out.println("El array original es: " + Arrays.toString(lista));

        int[] resultado = eliminarNum(lista, numElim);
        System.out.println("El array resultante eliminando " + numElim + " es: " + Arrays.toString(resultado));

    }// Fin main

    //Función Buscar y Eliminar Numero
    public static int[] eliminarNum(int[] array, int numElim) {

        int borrar = 0;

        for (int i : array) {
            if (i == numElim) {
                borrar++;
            }

        }
        int[] resultado = new int[array.length - borrar];

        int j = 0;

        for (int i : array) {
            if (i != numElim) {
                resultado[j++] = i;
            }

        }
        return resultado;
    }

}// Fin clase
