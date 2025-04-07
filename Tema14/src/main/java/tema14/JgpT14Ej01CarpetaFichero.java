package tema14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */
public class JgpT14Ej01CarpetaFichero {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            //Crear carpeta si no existe
            File carpeta = new File("Archivos");
            if (!carpeta.exists()) {
                carpeta.mkdir();
            }
            //Crear Fichero.txt
            File fichero = new File(carpeta, "fich01.txt");

            //Usar UTF-8 para escribir el fichero
            Writer escritor = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero), StandardCharsets.UTF_8));

            //Escribir con tildes, eñes y simbolos
            escritor.write("Primera línea con acento: áéíóú\n");
            escritor.write("Segunda línea con eñes: añon, muñeca, cañón\n");
            escritor.write("Tercera línea: ¡Hola, qué tal estás!\n");
            escritor.close();

            System.out.println("Fichero creado correctamente con UTF-8");

        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }

    }
}
