/*
 * 4.3. Realiza un programa que solicite que se le introduzcan una cadena y un carácter y nos 
muestre cuantas veces está contenido el carácter en la cadena  
 */
package tema4;

import java.util.Scanner;

public class JgpT04E03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 0;

        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        String cadenaMinus = cadena.replaceAll("\\s+", "").toLowerCase();
        
        System.out.print("Introduce un caracter: ");
        char caracter = teclado.next().charAt(0);
        
        caracter = Character.toLowerCase(caracter);

        for (int i = 0; i < cadenaMinus.length(); i++) {
            if (cadenaMinus.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("El caracter '" + caracter + "' aparece " + contador + " veces en la cadena.");
    }
}
