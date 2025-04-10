package tema14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */
public class JgpT14Ej01CarpetaFichero {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        try (PrintWriter escritor = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("Archivos" + File.separator + "fich01.txt", true), 
                                StandardCharsets.UTF_8)),true)) {
            
            escritor.println("Primera línea con acento: áéíóú");
            escritor.println("Segunda línea con eñes: año, muñeca, cañón");
            escritor.println("Tercera línea: ¡Hola, qué tal estás!");            
            
            
            System.out.println("Fichero creado correctamente con UTF-8");

        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }

    }
}
