package tema14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */
public class JgpT14Ej03Fichero2B {

    //Crear función de teclado con codificación ISO-8859-1
    static Scanner teclado = new Scanner(System.in,"ISO-8859-1");

    public static void main(String[] args) {

        File fichero = new File("fich02.txt");
        File backup = new File("fich02.bak");

        //Comprueba si existe
        if (fichero.exists()) {
            System.out.println("El fichero fich02.txt ya existe. Creando copia de seguridad...");
            try {
                if (backup.exists()) {
                    backup.delete();
                }
                
                //Crea Backup
                Files.copy(fichero.toPath(), backup.toPath());
                System.out.println("Copia de seguridad creada con éxito.");
            } catch (IOException e) {
                System.out.println("Error al crear copia de seguridad: " + e.getMessage());
                return;
            }
        }      
        
        //Empezar a escribir
        try (FileWriter fw = new FileWriter(fichero)) {
            while (true) {
                System.out.print("Introduce una palabra o frase (escribe 'fin' para terminar): ");
                String linea = teclado.nextLine();

                if (linea.equalsIgnoreCase("fin")) {
                    break;
                }

                fw.write(linea + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}