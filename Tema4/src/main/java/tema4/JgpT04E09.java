/*
 * 4.9. Escribe un programa que solicite que se introduzca por teclado un nombre completo y una 
 * edad y muestre el siguiente mensaje. Hacer una versión utilizando la clase Format y otra versión con 
 * el método System.out.printf.
 * Hola, me llamo Pepe Pérez López y tengo 20 años   
 */
package tema4;

import java.text.MessageFormat;
import java.util.Scanner;

public class JgpT04E09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.print("Introduce la edad: ");
        int edad = teclado.nextInt();
        
        String frase = MessageFormat.format("Hola, me llamo {0} y tengo {1} años", nombre, edad); 
                    
        System.out.println(frase);
        
        
        /* Usamos System.out.printf para formatear el mensaje
        System.out.printf("Hola, me llamo %s y tengo %d años%n", nombre, edad);*/
    }
}
