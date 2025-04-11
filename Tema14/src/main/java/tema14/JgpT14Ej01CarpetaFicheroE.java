package tema14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */
public class JgpT14Ej01CarpetaFicheroE {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        try (
                FileOutputStream escritor = new FileOutputStream(
                        "Archivos" + File.separator + "fich01D.txt", true)) {

            escritor.write(("Primera línea con acento: camión, rápido, útil, vía, trébol"
                    + System.lineSeparator()).getBytes("UTF-8"));
            escritor.write(("Segunda línea con eñes: año, muñeca, cañón"
                    + System.lineSeparator()).getBytes("UTF-8"));
            escritor.write(("Tercera línea: ¡Hola, qué tal estás!"
                    + System.lineSeparator()).getBytes("UTF-8"));

            System.out.println("Fichero creado correctamente con UTF-8");

        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }

    }
}
