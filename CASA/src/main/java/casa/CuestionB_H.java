package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CuestionB_H {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Integer[] arr = {10, 3, 7, 2, 9, 5}; //no fuciona con int

        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(arr));     //Falta esta línea que toma el valor del array y lo añade al ArrayList (lista)

        Collections.sort(lista);
        arr = lista.toArray(new Integer[lista.size()]);;
        System.out.println(Arrays.toString(arr));

        /*Este código convierte el array arr en un ArrayList, lo ordena utilizando Collections.sort(), 
y luego convierte el ArrayList de nuevo en un array. Finalmente, imprime el array ordenado ascendente.*/
    }// Fin main

}// Fin clase
