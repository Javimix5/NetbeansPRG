/*
 * 4.4. Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las 
siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre la ‘a’ y la ‘j’.  
 */
package tema4;

import java.util.Scanner;

public class JgpT04E04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 0;

        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        System.out.print("Introduce un caracter: ");
        char caracter = teclado.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("El caracter '" + caracter + "' aparece " + contador + " veces en la cadena.");
    }
}
