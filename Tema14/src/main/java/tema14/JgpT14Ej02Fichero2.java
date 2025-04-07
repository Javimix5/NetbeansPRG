package tema14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */
public class JgpT14Ej02Fichero2 {

    //Crear función de teclado con codificación ISO-8859-1
    static Scanner teclado = new Scanner(System.in,"ISO-8859-1");

    public static void main(String[] args) {

        //Declarar variables FileWriter y PrintWriter
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            //Crear fichero y reconocedor de teclado para escribir un fichero
            fichero = new FileWriter("fich02.txt");
            pw = new PrintWriter(fichero);

            //Condición de escritura hasta escribir fin
            while (true) {
                System.out.print("Introduce una palabra o frase (escribe 'fin' para terminar): ");
                String linea = teclado.nextLine();

                if (linea.equalsIgnoreCase("fin")) {
                    break;
                }

                //Separador de línea
                pw.println(linea);
            }

            //Cierre de PrintWriter y FileWriter
            pw.close();
            fichero.close();
            
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}