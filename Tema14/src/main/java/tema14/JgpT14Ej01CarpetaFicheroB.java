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
public class JgpT14Ej01CarpetaFicheroB {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //Crear carpeta y fichero
        String nombreCarpeta = "archivos";
        String nombreFichero = "fich01B.txt";

        //Ruta carpeta FileSeparator + si no existe
        String rutaCarpeta = "." + File.separator + nombreCarpeta;
        File carpeta = new File(rutaCarpeta);

        if (!carpeta.exists()) {
            carpeta.mkdir();
        }

        //Crear Fichero.txt
        String rutaFichero = rutaCarpeta + File.separator + nombreFichero;
        File fichero = new File(carpeta, "fich01B.txt");

        //Escribir con tildes, eñes y simbolos
        try ( //Usar UTF-8 para escribir el fichero
                PrintWriter escritor = new PrintWriter(
                        new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream(fichero), StandardCharsets.ISO_8859_1)))) 
            
            /*try (
            FileOutputStream fos = new FileOutputStream(fichero, true); //append=true
            OutputStreamWriter osw = new OutputStreamWriter(fos,ISO_8859_1);                     
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true) //autoflush=true 
            ){
            pw.println("Primera línea con acento: áéíóú");
            pw.println("Segunda línea con eñes: año, maño");
            }catch (IOException e){
            }*/ 
        
        {   //Escribir con tildes, eñes y simbolos
            escritor.write("Fichero modificado con Separator e ISO-8859-1\n");
            escritor.write("Primera línea con acento: áéíóú\n");
            escritor.write("Segunda línea con eñes: añon, muñeca, cañón\n");
            escritor.write("Tercera línea: ¡Hola, qué tal estás!\n");

            System.out.println("Fichero creado correctamente con ISO-8859-1");

        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }

    }
}
