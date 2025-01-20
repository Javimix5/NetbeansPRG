
package casa;


/**
 *
 * @author Javier González Prados
 * 
 */
import java.util.Random;
import java.util.Scanner;

public class JgpT7ej1TemperaturaMeses {

    static Scanner teclado = new Scanner(System.in);
    
    static int[] temperaturaMeses = new int[12];  //Variable Global

    public static void main(String[] args) {
        
        llenarArray();
        mostrarArray();
        mostrarArrayInverso();
    }

    // Llena el array con valores aleatorios entre 0 y 40
    public static void llenarArray() {
        Random random = new Random();
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = random.nextInt(41); // Genera números entre 0 y 40
        }
    }

    // Muestra el contenido del array
    public static void mostrarArray() {
        System.out.println("Temperaturas de los meses:");
        for (int temp : temperaturaMeses) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    // Muestra el contenido del array en orden inverso
    public static void mostrarArrayInverso() {
        System.out.println("Temperaturas de los meses (inverso):");
        for (int i = temperaturaMeses.length - 1; i >= 0; i--) {
            System.out.print(temperaturaMeses[i] + " ");
        }
        System.out.println();
    
    }// Fin main

}// Fin clase  
