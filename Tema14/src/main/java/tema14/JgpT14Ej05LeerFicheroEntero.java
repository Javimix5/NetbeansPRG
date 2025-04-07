package tema14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Javier González Prados
 */
public class JgpT14Ej05LeerFicheroEntero {

    public static void main(String[] args) {

        //Busca y abre el fichero de archivos/fich2.txt
         File fichero = new File("archivos/fich02.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println("Error: El fichero no existe.");
        }
    }
}