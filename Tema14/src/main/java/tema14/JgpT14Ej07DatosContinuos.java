package tema14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
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

        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {
            String nombre;

            while (true) {
                System.out.print("Introduce el nombre del alumno (Z para salir): ");
                nombre = scanner.nextLine();

                if (nombre.equalsIgnoreCase("Z")) {
                    break;
                }

                System.out.print("Introduce la fecha de nacimiento (dd/mm/aaaa): ");
                String fechaNacimiento = scanner.nextLine();

                System.out.print("Introduce la nota de la 1ª evaluación: ");
                double nota1 = scanner.nextDouble();

                System.out.print("Introduce la nota de la 2ª evaluación: ");
                double nota2 = scanner.nextDouble();

                System.out.print("Introduce la nota de la 3ª evaluación: ");
                double nota3 = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea

                writer.printf("%s;%s;%.2f;%.2f;%.2f%n", nombre, fechaNacimiento, nota1, nota2, nota3);
            }

            System.out.println("Datos guardados correctamente en archivos/alumnos.csv.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el fichero: " + e.getMessage());
        }
    }
}
