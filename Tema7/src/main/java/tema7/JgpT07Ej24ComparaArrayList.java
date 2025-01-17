/*
Ejercicio 24 - Realizar un programa con una función a la que se le pasan dos ArrayList de enteros como 
parámetros y nos devuelva true si los dos ArrayList tienen los mismos elementos, aunque sean en 
otro orden, y devuelva false en caso contrario (suponemos que no tienen valores repetidos). 

 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JgpT07Ej24ComparaArrayList {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        // Creación de dos ArrayList
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        // Llenar lista1
        System.out.println("Vamos a añadir elementos a la primera lista.");
        añadirElementosALista(teclado, lista1);

        // Llenar lista2
        System.out.println("Vamos a añadir elementos a la segunda lista.");
        añadirElementosALista(teclado, lista2);

        // Imprimir el contenido de las listas
        System.out.println("Contenido de la primera lista: " + lista1);
        System.out.println("Contenido de la segunda lista: " + lista2);

        //Imprime si son iguales ambos ArrayList
        System.out.println("Ambos arrays tienen los mismos valores: " + sonIguales(lista1, lista2));

    } //Fin main

    // Función para añadir elementos a un ArrayList
    public static void añadirElementosALista(Scanner teclado, ArrayList<String> lista) {
        boolean seguirAñadiendo = true;

        while (seguirAñadiendo) {
            System.out.println("Introduce un valor para añadir a la lista:");
            String valor = teclado.nextLine();
            lista.add(valor);  // Añadir el valor al ArrayList

            // Preguntar si desea añadir más valores
            System.out.println("¿Deseas añadir otro valor? (S/N)");
            String respuesta = teclado.nextLine();

            if (respuesta.equalsIgnoreCase("N")) {
                seguirAñadiendo = false;  // Terminar el ciclo si la respuesta es 'N'
            }
        }
    }

    //Funcion Comparar Arraylist
    public static boolean sonIguales(ArrayList<String> lista1, ArrayList<String> lista2) {
        boolean iguales = true;

        if (lista1.size() != lista2.size()) {
            iguales = false;

        } else {
            ArrayList<String> Newlista1 = new ArrayList<>();
            ArrayList<String> Newlista2 = new ArrayList<>();

            Collections.sort(Newlista1);
            Collections.sort(Newlista2);

            iguales = Newlista1.equals(Newlista2);

        }
        return iguales;

    }
}
