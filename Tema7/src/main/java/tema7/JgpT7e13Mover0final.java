/*
Ejercicio 13 - Crea un programa que mueve todos los 0 de un array al final sin cambiar el orden de los demás elementos.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JgpT7e13Mover0final {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduca cuantos valores deseas");
        int tamaño = teclado.nextInt();
        
        int[] lista = new int[tamaño];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para la posicion: " + i);
            lista[i] = teclado.nextInt();
            
        }
        
        System.out.println("Los enteros introducidos son estos:");
        System.out.println(Arrays.toString(lista));
        
        mover(lista);
        System.out.println("El resultado de mover los 0 al final es: " + (Arrays.toString(lista)));
        
    }// Fin main

    //Función Mover 0 al final
    public static void mover(int[] array) {
        int index = 0;
        for (int i : array) {
            if (i != 0) {
                array[index++] = i;
            }
        }
        while (index < array.length) {
            array[index++] = 0;
            
        }        
        
    }
}// Fin clase
