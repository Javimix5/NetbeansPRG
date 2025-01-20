/*
Ejercicio 2 - Realiza un programa que tenga definido un Array como variable global llamado
temperaturaMeses, de 12 enteros, con las temperaturas medias de un lugar en cada uno de los
meses del año. Serán valores enteros negativos o positivos. El programa tendrá diferentes funciones
que realicen las siguientes tareas:
a. Llenar el Array con valores al azar para todos los meses (entre 0 y 40).
b. Mostrar la temperatura media del año.
c. Mostrar los meses en los que hizo más de 30 grados.
d. Decir si hay algún mes con más de 30 grados, recorriendo lo imprescindible del array, es
decir, en cuanto sepa que sí hay alguno, que pare de recorrer el array. Puedes usar break
o return.
e. Decir si hay algún mes con más de 30 grados, recorriendo lo imprescindible del array pero
ahora sin usar ni break ni return.
f. Decir si hay alguna temperatura repetida en dos o más meses.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Random;
import java.util.Scanner;

public class JgpT07Ej02Temp30Rep {

    static Scanner teclado = new Scanner(System.in);

    static int[] temperaturaMeses = new int[12];

    public static void main(String[] args) {
        llenarArray();
        mostrarMedia();
        mesesMas30();
        hayMas30Break();
        hayMas30Sin();
        Repetida();
    }

    // Método para llenar el array con valores al azar entre 0 y 40
    public static void llenarArray() {
        Random rand = new Random();
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = rand.nextInt(41); // Generar un número entre 0 y 40
        }
    }

    // Método para mostrar la temperatura media del año
    public static void mostrarMedia() {
        int suma = 0;
        for (int temp : temperaturaMeses) {
            suma += temp;
        }
        double media = (double) suma / temperaturaMeses.length;
        System.out.println("Temperatura media del año: " + media + "°C");
    }

    // Método para mostrar los meses en los que hizo más de 30 grados
    public static void mesesMas30() {
        System.out.println("Meses con más de 30 grados:");
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (temperaturaMeses[i] > 30) {
                System.out.println("Mes " + (i + 1) + ": " + temperaturaMeses[i] + "°C");
            }
        }
    }

    // Método para decir si hay algún mes con más de 30 grados usando break
    public static void hayMas30Break() {
        for (int temp : temperaturaMeses) {
            if (temp > 30) {
                System.out.println("Hay al menos un mes con más de 30 grados.");
                return;
            }
        }
        System.out.println("No hay ningún mes con más de 30 grados.");
    }

    // Método para decir si hay algún mes con más de 30 grados sin usar break ni return
    public static void hayMas30Sin() {
        boolean hayMes = false;
        for (int temp : temperaturaMeses) {
            hayMes = hayMes || (temp > 30);
        }
        if (hayMes) {
            System.out.println("Hay al menos un mes con más de 30 grados. (sin Break)");
        } else {
            System.out.println("No hay ningún mes con más de 30 grados.");
        }
    }

    // Método para decir si hay alguna temperatura repetida en dos o más meses
    public static void Repetida() {
        boolean repetida = false;
        for (int i = 0; i < temperaturaMeses.length; i++) {
            for (int j = i + 1; j < temperaturaMeses.length; j++) {
                if (temperaturaMeses[i] == temperaturaMeses[j]) {
                    repetida = true;
                    break;
                }
            }
            if (repetida) {
                break;
            }
        }
        if (repetida) {
            System.out.println("Hay al menos una temperatura repetida en dos o más meses.");
        } else {
            System.out.println("No hay ninguna temperatura repetida en dos o más meses.");
        }
    }
}
