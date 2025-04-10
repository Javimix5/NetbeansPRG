package tema14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */
public class JgpT14Ej01CarpetaFicheroA {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        try (BufferedWriter escritor = 
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("Archivos" + File.separator + "fich01.txt", true), 
                                "UTF_8"))
                ) {
            
            escritor.write("Primera línea con acento: camión, rápido, útil, vía, trébol");
            escritor.newLine();
            escritor.write("Segunda línea con eñes: año, muñeca, cañón");
            escritor.newLine();
            escritor.write("Tercera línea: ¡Hola, qué tal estás!");            
            escritor.newLine();
            escritor.flush(); //autoflush no sería necesario debido al try-with-resources
            
            
            System.out.println("Fichero creado correctamente con UTF-8");

        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }

    }
}
