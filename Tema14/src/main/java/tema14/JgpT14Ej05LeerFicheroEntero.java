package tema14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Busca y lee un fichero que se encuentra en la carpeta archivos creado previamente en el ejercicio 14.4
 * @author Javier González Prados
 */
public class JgpT14Ej05LeerFicheroEntero {

    public static void main(String[] args) {

        //Busca y abre el fichero de archivos/fich2.txt
         File fichero = new File("archivos/fich02.txt");

        // Entramos en el try catch para controlar cualquier posible error que suceda durante la ejecución 
        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {           
            String linea;
            
            //Entramos en el bucle para comprobar que exista el fichero
            while ((linea = reader.readLine()) != null) {
                
            //Muestra por pantalla el contenido del fichero y lo convierte a mayúsculas    
                System.out.println(linea.toUpperCase());
            }
           
            // En caso de error monstrará= Error: El fichero no existe
        } catch (IOException e) {
            System.out.println("Error: El fichero no existe.");
        }
    }
} // Fin clase