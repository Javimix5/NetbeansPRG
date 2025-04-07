package tema14;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Javier González Prados
 */
public class JgpT14Ej04LeerFichero {

    public static void main(String[] args) {

        //Busca y abre el fichero de archivos/fich2.txt
        File fichero = new File("archivos/fich02.txt");

        try (FileReader reader = new FileReader(fichero)) {
            int caracter;
            while ((caracter = reader.read()) != -1) {
                System.out.print(Character.toUpperCase((char) caracter));
            }
        } catch (IOException e) {
            System.out.println("Error: El fichero no existe.");
        }
    }
}
