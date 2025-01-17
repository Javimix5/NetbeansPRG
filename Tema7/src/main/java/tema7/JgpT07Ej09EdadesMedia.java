/*
Ejercicio 9 - Realiza un programa que tenga una función a la que se le pasa un array con las edades de los alumnos de una clase y nos devuelva la edad media. Añadir una función a la que se le pasa un Array con las edades de los alumnos y nos devuelva un Array solo con los mayores de edad.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class JgpT07Ej09EdadesMedia {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduca cuantos alumnos hay en clase");
        int tamaño = teclado.nextInt();

        int[] edad = new int[tamaño];

        for (int i = 0; i < edad.length; i++) {
            System.out.println("Indica la edad de los alumnos" + i);
            edad[i] = teclado.nextInt();
        }

        System.out.println("Las edades introducidas son:");
        System.out.println(Arrays.toString(edad));
        
        System.out.println("El promedio de edad es: " + Promedio(edad));

        int [] mayorEdad =  mayorEdad(edad);        
        
        System.out.println("Y estas son sus edades " + Arrays.toString(mayorEdad));

    }//Fin main

    //Funcion para calcular Media
    public static int Promedio(int[] array) {
        int suma = 0;
        for (int i : array) {
            suma += i;
        }
        int Promedio = suma / array.length;

        return Promedio;
    }

    //Funcion para calcular Mayores de edad
    public static int[] mayorEdad(int[] array) {

        int contador = 0;

        for (int i : array) {
            if (i >= 18) contador++;
            
        }
        int[] mayorEdad = new int[contador];
        int indice = 0;
        for (int edad : array) {
            if (edad >= 18) {
                mayorEdad[indice++] = edad;
            }
        }
        return mayorEdad;             
        
    }

}
