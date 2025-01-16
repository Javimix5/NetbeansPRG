/*
Ejercicio 6 - Programa que reciba un array de enteros y busque un numero específico, si existe devuelve su indice; si no, devuelve -1.
 */
package boletinarrays;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JgpT7e06BuscaIndice {

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

        int indice = indiceNum(lista, busca);

        if (indice != -1) {
            System.out.println("El numero " + busca + " esta en la posicion " + indiceNum(lista, busca));
        } else {
           System.out.println("El numero " + busca + " no esta en la lista por lo tanto su posicion es " + indiceNum(lista, busca)); 
        }
        

    }// Fin main

    //Función Buscar e Devolver Indice numero
    public static int indiceNum(int[] array, int busca) {

        int indice = 0;

        for (int i : array) {
            if (i == busca) {
                return i;
            }

        }
        return -1;

    }

}// Fin clase
