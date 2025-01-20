/*
Ejercicio 4 - Realiza un programa similar a los anteriores pero que realice las siguientes funciones:
a. Llenar el Array con valores al azar para todos los meses. Para enero, febrero, marzo, noviembre y
diciembre los valores estarán comprendidos entre -10 y +20 y para el resto de meses entre +10 y
+40.
b. Mostrar por pantalla el contenido del array con el nombre de los meses (usar clases Java para
obtener el nombre del mes)
c. Mostrar la temperatura máxima del año, usando printf especificando en el formato que incluya el
signo “+” en temperaturas positivas y que solo muestre 1 decimal.
d. Mostrar el nombre del mes más frío del año.
e. Para hacer pruebas estadísticas, desplazar los valores a la derecha, pasando el último al primero
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.time.Month;
import java.util.Random;
import java.util.Scanner;

public class JgpT07Ej04TempFuncion {

    static Scanner teclado = new Scanner(System.in);

    static int[] temperaturaMeses = new int[12];

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMenú de Temperaturas:");
            System.out.println("1. Llenar el Array con valores al azar");
            System.out.println("2. Mostrar el contenido del Array con el nombre de los meses");
            System.out.println("3. Mostrar la temperatura máxima del año");
            System.out.println("4. Mostrar el nombre del mes más frío del año");
            System.out.println("5. Desplazar los valores a la derecha");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer 
            switch (opcion) {
                case 1:
                    llenarArray();
                    break;
                case 2:
                    mostrarArray();
                    break;
                case 3:
                    mostrarTemperaturaMaxima();
                    break;
                case 4:
                    mostrarMesMasFrio();
                    break;
                case 5:
                    desplazarValoresDerecha();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 6.");
            }
        } while (opcion != 6);
        teclado.close();
    }

// Método para llenar el array con valores al azar 
    public static void llenarArray() {
        Random rand = new Random();
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (i == 0 || i == 1 || i == 2 || i == 10 || i == 11) {
                temperaturaMeses[i] = rand.nextInt(31) - 10; // Generar un número entre -10 y +20 
            } else {
                temperaturaMeses[i] = rand.nextInt(31) + 10; // Generar un número entre +10 y +40 
            }
        }
        System.out.println("Array llenado con valores al azar.");
    }

// Método para mostrar el contenido del array con el nombre de los meses 
    public static void mostrarArray() {
        System.out.println("Temperaturas medias del año:");
        for (int i = 0; i < temperaturaMeses.length; i++) {
            System.out.println(Month.of(i + 1).name() + ": " + temperaturaMeses[i] + "°C");
        }
    }

// Método para mostrar la temperatura máxima del año 
    public static void mostrarTemperaturaMaxima() {
        int maxTemp = Integer.MIN_VALUE;
        for (int temp : temperaturaMeses) {
            if (temp > maxTemp) {
                maxTemp = temp;
            }
        }
        System.out.printf("Temperatura máxima del año: %+1.1f°C\n", (double) maxTemp);
    }

// Método para mostrar el nombre del mes más frío del año 
    public static void mostrarMesMasFrio() {
        int minTemp = Integer.MAX_VALUE;
        int mesMasFrio = 0;
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (temperaturaMeses[i] < minTemp) {
                minTemp = temperaturaMeses[i];
                mesMasFrio = i;
            }
        }
        System.out.println("El mes más frío del año es " + Month.of(mesMasFrio + 1).name() + " con " + minTemp + "°C");
    }

// Método para desplazar los valores a la derecha 
    public static void desplazarValoresDerecha() {
        int ultimo = temperaturaMeses[temperaturaMeses.length - 1];
        for (int i = temperaturaMeses.length - 1; i > 0; i--) {
            temperaturaMeses[i] = temperaturaMeses[i - 1];
        }
        temperaturaMeses[0] = ultimo;
        System.out.println("Valores desplazados a la derecha.");
    }
}
