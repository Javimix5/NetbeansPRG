/*
Ejercicio 12 - Crea un programa que verifique si dos arrays son iguales (tienen los mismos elementos en el mismo orden.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JgpT7e09CheckOrdenAsc {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int[] lista = {0, 1, 2, 3, 4, 5};
        
        int[] lista2 = {0, 1, 2, 3, 4, 5};
        
        System.out.println(Arrays.toString(lista));
        System.out.println(Arrays.toString(lista2));
        
        System.out.println("Son iguales? " + Iguales(lista, lista2));
        
    }// Fin main

    //Función Comprobar si dos arrays son iguales
    public static boolean Iguales(int[] array, int[] array2) {
        boolean iguales = true;
        
        if (array.length == array2.length) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] != array2[i]) {
                    iguales = false;
                }
            }
        } else {
            iguales = false;
        }
        return iguales;
    }
}// Fin clase
