/*
Ejercicio 14 - Realizar un programa que defina un Array con 10 elementos e introduzca valores
a azar entre 1 y 20 pero garantizando que no se introducen repetidos y una vez introducidos,
ordénalos ascendentemente programando un algoritmo de ordenación.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Random;
import java.util.Scanner;

public class JgpT07Ej14ArrayVerificar {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[10];
        llenarArray(array);
        System.out.println("Array antes de ordenar:");
        mostrarArray(array);
        ordenarArray(array);
        System.out.println("Array después de ordenar:");
        mostrarArray(array);

    }

    // Método para llenar el array con valores al azar entre 1 y 20 sin repetir 
    public static void llenarArray(int[] array) {
        Random rand = new Random();
        int i = 0;
        while (i < array.length) {
            int num = rand.nextInt(20) + 1; // Generar un número entre 1 y 20 
            if (!contiene(array, num)) {
                array[i] = num;
                i++;
            }
        }
    }

// Método para verificar si el array contiene un valor 
    public static boolean contiene(int[] array, int valor) {
        for (int i : array) {
            if (i == valor) {
                return true;
            }
        }
        return false;
    }

// Método para mostrar el contenido del array 
    public static void mostrarArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

// Método para ordenar el array ascendentemente (algoritmo de burbuja) 
    public static void ordenarArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar array[j] y array[j + 1] 
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }
}
