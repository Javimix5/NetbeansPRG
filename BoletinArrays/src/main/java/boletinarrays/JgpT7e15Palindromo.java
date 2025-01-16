/*
Ejercicio 15 - Crea un programa que reciba un array de enteros y diga si es un Palindromo.
 */
package boletinarrays;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT7e15Palindromo {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduca cuantos valores deseas");
        int tamaño = teclado.nextInt();

        int[] lista = new int[tamaño];
        int suma = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para la posicion: " + i);
            lista[i] = teclado.nextInt();

        }

        System.out.println("El array es palindromo: " + esPalindromo(lista));

    }// Fin main

    public static boolean esPalindromo(int[] array) {
        boolean palindromo = true;
        int j = (array.length) - 1;

        for (int i = 0; i < array.length; i++) {
            if (i < j) {
                if (array[i] == array[j]) {
                    j--;
                } else {
                    palindromo = false;
                    break;
                }
            } else {
                break;
            }

        }
        return palindromo;
    }

}// Fin clase
