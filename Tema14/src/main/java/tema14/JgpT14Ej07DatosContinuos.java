package tema14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Introducción de datos de alumno y sus notas para mostrarlos en pantalla
 * @author Javier González Prados
 */
public class JgpT14Ej07DatosContinuos {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String carpeta = "archivos";
        String nombreArchivo = "alumnos.csv";

        // Crear la carpeta si no existe
        File directorio = new File(carpeta);
        if (!directorio.exists()) {
            directorio.mkdir();
        }

        // Ruta completa al archivo
        File archivo = new File(directorio, nombreArchivo);

        // Entramos en un try catch para controlar cualquier error que ocurra al introducir algún dato
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {
            String nombre;
            
            // Bucle while para introducir los parámetros
            while (true) {
                // Solicita por pantalla la introducción del nombre del alumno
                System.out.print("Introduce el nombre del alumno (Z para salir): ");
                nombre = scanner.nextLine();

                // Ignoramos mayúsculas y minúsculas al introducir Z para salir del bucle
                if (nombre.equalsIgnoreCase("Z")) {
                    break;
                }
                
                // Solicita por pantalla la introducción de la fecha
                System.out.print("Introduce la fecha de nacimiento (dd/mm/aaaa): ");
                String fechaNacimiento = scanner.nextLine();

                // Solicita por pantalla la introducción de la nota de la 1ª Evaluación
                System.out.print("Introduce la nota de la 1ª evaluación: ");
                double nota1 = scanner.nextDouble();

                // Solicita por pantalla la introducción de la nota de la 2ª Evaluación
                System.out.print("Introduce la nota de la 2ª evaluación: ");
                double nota2 = scanner.nextDouble();

                // Solicita por pantalla la introducción de la nota de la 3ª Evaluación
                System.out.print("Introduce la nota de la 3ª evaluación: ");
                double nota3 = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea

                // Muestra por pantalla los datos introducidos concatenados
                writer.printf("%s;%s;%.2f;%.2f;%.2f%n", nombre, fechaNacimiento, nota1, nota2, nota3);
            }

            // Muestra por pantalla el mensaje
            System.out.println("Datos guardados correctamente en archivos/alumnos.csv.");

            // En caso de error mostrará el mensaje
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el fichero: " + e.getMessage());
        }
    }
} // Fin main
