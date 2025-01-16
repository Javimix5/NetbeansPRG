/*
Ejercicio 5 - Programa que reciba un array de enteros y cuente cuantas veces se repite un numero específico.
 */
package boletinarrays;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JgpT7e05BuscaRepeticion {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduca cuantos valores deseas");
        int tamaño = teclado.nextInt();
        int busca = 0;

        int[] lista = new int[tamaño];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para la posicion: " + i);
            lista[i] = teclado.nextInt();

            
        }
        System.out.println("Escribe el numero que quieres buscar");
            busca = teclado.nextInt();
        
        System.out.println("El numero " + busca + " esta repetido " + contarNum(lista, busca) + " veces.");

    }// Fin main

    //Función Buscar y Contar Numero
    public static int contarNum(int[] array, int busca) {

        int contador = 0;

        for (int i : array) {
            if (i == busca) {
                contador++;
            }

        }
        return contador;

    }

}// Fin clase
