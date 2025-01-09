/*
Ejercicio 3 - Crea un programa que reciba in array de numeros y calcule el promedio de sus enteros.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT7e03Promedio {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduca cuantos valores deseas");
        int tamaño = teclado.nextInt();

        int[] lista = new int[tamaño];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para la posicion: " + i);
            lista[i] = teclado.nextInt();

        }
        System.out.println("La suma de todos los valores es: " + Promedio(lista));

    }// Fin main

    //Funcion Promedio
    public static int Promedio(int[] array) {
        int suma = 0;
        for (int i : array) {
            suma += i;

        }
        int Promedio = suma / array.length;

        return Promedio;

    }

}// Fin clase
