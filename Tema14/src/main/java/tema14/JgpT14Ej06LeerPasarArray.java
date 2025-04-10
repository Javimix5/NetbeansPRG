package tema14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Javier González Prados
 */
public class JgpT14Ej06LeerPasarArray {

    public static void main(String[] args) {
        String ruta = "archivos/fich04.txt";
        crearArchivoDeEjemplo(ruta);

        int[] resultado = analizarFichero(ruta);

        if (resultado != null) {
            System.out.println("Numero de caracteres: " + resultado[0]);
            System.out.println("Numero de lineas: " + resultado[1]);
            System.out.println("Numero de palabras: " + resultado[2]);
        } else {
            System.out.println("El fichero no existe o no se pudo leer.");
        }

    }

    public static int[] analizarFichero(String rutaFichero) {
        File fichero = new File(rutaFichero);

        if (!fichero.exists()) {
            return null;
        }

        int caracteres = 0;
        int lineas = 0;
        int palabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                lineas++;
                caracteres += linea.length();

                boolean enPalabra = false;
                for (int i = 0; i < linea.length(); i++) {
                    char c = linea.charAt(i);
                    if (Character.isLetterOrDigit(c)) {
                        if (!enPalabra) {
                            palabras++;
                            enPalabra = true;
                        }
                    } else {
                        enPalabra = false;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
            return null;
        }

        return new int[]{caracteres, lineas, palabras};
    }

    private static void crearArchivoDeEjemplo(String ruta) {
        File archivo = new File(ruta);
        File carpeta = archivo.getParentFile();

        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        String contenido = """
                Este es un fichero de prueba.
                Tiene varias líneas y palabras.
                Java es divertido.
                Probando cosas...
                """;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(contenido);
        } catch (IOException e) {
            System.out.println("No se pudo crear el archivo de ejemplo: " + e.getMessage());
        }
    }
}
