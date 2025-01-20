/*
Ejercicio 1 - Realiza un programa que tenga definido un Array como variable global llamado
temperaturaMeses, de 12 enteros, con las temperaturas medias de un lugar en cada uno de los
meses del año. Serán valores enteros negativos o positivos. El programa tendrá diferentes funciones
que realicen las siguientes tareas:
a) Llenar el Array con valores al azar para todos los meses (entre 0 y 40).
b) Mostrar por pantalla el contenido del Array.
c) Mostrar por pantalla el contenido del Array en orden inverso.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Random;
import java.util.Scanner;

public class JgpT07Ej01TemperaturaMes {

    static Scanner teclado = new Scanner(System.in);

    static int[] temperatura = new int[12]; //para que sea fijo siempre

    public static void main(String[] args) {

        llenarArray();
        mostrarArray();
        mostrarInverso();

    }

    public static void llenarArray() {
        Random random = new Random();
        for (int i = 0; i < temperatura.length; i++) {
            temperatura[i] = random.nextInt(41);

        }
    }

    public static void mostrarArray() {
        System.out.println("Temperaturas medias del año son: ");
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Mes " + (i + 1) + ": " + temperatura[i]);            
        }
        System.out.println(" ");
    }

    public static void mostrarInverso() {
        System.out.println("Temperaturas medias del año (orden inverso):");
        for (int i = temperatura.length - 1; i >= 0; i--) {
            System.out.println("Mes " + (i + 1) + ": " + temperatura[i] + "°C");
        }

    }

}// Fin clase
