/*
Ejercicio 10 - Programa que rote un array de enteros a la derecha un numero especifico de veces.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JgpT7e10BuscaRota {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduca cuantos valores deseas");
        int tamaño = teclado.nextInt();
        int rotar = 0;

        int[] lista = new int[tamaño];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para la posicion: " + i);
            lista[i] = teclado.nextInt();

        }
        System.out.println("Escribe el numero veces a rotar");
        rotar = teclado.nextInt();

        System.out.println("El array inicial es: " + Arrays.toString(lista));

        lista = rotarVeces(lista, rotar);
        System.out.println("El array tras rotar " + rotar + " veces es: " + Arrays.toString(lista));

    }// Fin main

    //Función Rotar Array X veces Derecha
    public static int[] rotarVeces(int[] array, int rotar) {

        int n = array.length;

        //comprobar que no excesa el tamaño del array
        rotar = rotar % n;

        int[] resultado = new int[array.length];

        for (int i = 0; i < rotar; i++) {
            resultado[i] = array[n - rotar + i];

        }
        for (int i = rotar; i < n; i++) {
            resultado[i] = array[(i - rotar)];

        }

        return resultado;

    }

}// Fin clase
