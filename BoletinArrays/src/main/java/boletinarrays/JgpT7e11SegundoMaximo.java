/*
Ejercicio 11 - Dado un array de enteros, encuentra el Segundo valor máximo dentro del array.
 */
package boletinarrays;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT7e11SegundoMaximo {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int max = 0;

        System.out.println("Introduce la cantidad de valores deseados");
        int tamaño = teclado.nextInt();

        int[] lista = new int[tamaño];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para: " + i);
            lista[i] = teclado.nextInt();

        }
        System.out.println("El valor maximo es: " + SegundoMaximo(lista));

    }// Fin main

    //Funcion encontrar Segundo máximo
    public static int SegundoMaximo(int[] array) {

        int max = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        int SegMax = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > SegMax && i < max) {
                SegMax = i;
            }
        }
        return SegMax;
    }

}// Fin clase
