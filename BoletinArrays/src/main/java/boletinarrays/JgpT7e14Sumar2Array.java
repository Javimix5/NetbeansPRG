/*
Ejercicio 12 - Crea un programa que verifique si dos arrays son iguales (tienen los mismos elementos en el mismo orden.
 */
package boletinarrays;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JgpT7e14Sumar2Array {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int[] lista = {0, 1, 2, 3, 4, 5};
        
        int[] lista2 = {0, 1, 2, 3, 4, 5};
        
        System.out.println(Arrays.toString(lista));
        System.out.println(Arrays.toString(lista2));
        
        if (lista.length == lista2.length) {
            int resultado[] = sumaTamaño(lista,lista2);
            System.out.println("El resultado de la suma es: " + Arrays.toString(resultado) );
        } else {
            System.out.println("Error, no son del mismo tamaño");
        }             
       
        
    }// Fin main

    //Función Comprobar si dos arrays son iguales
    public static int [] sumaTamaño(int[] array, int[] array2) {
        int j=0;
        int [] resultado = new int[array.length];
        
        for (int i : resultado) {
            resultado [j] = (array[j] + array2[j]);
            j++;            
        }
        return resultado;
    }
}// Fin clase
