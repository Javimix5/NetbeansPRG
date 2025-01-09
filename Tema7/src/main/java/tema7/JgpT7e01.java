/*
Ejercicio 1 - Crea un programa que reciba un array de enteros y devuelva una suma de todos los elementos.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT7e01 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduca cuantos valores deseas");
        int tamaño = teclado.nextInt();
        
        int[] lista = new int[tamaño];
        int suma = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para la posicion: " + i);
            lista[i] = teclado.nextInt();
            suma += lista[i];
        }
        System.out.println("La suma de todos los valores es: " + suma);

    }// Fin main

}// Fin clase
