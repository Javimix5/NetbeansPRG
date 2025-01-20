/*
 * 4.15. Realizar un programa en el que el usuario introduzca un texto y sustituya sus posiciones 
 * impares por asteriscos, por ejemplo: “abcdefg” cambie las posiciones impares pasaría a: “a*c*e*g”    
 */
package tema4;

import java.util.Scanner;

public class JgpT04E15ConvertirImpares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = teclado.nextLine();
        
        // Convierte el texto en un StringBuilder para modificarlo fácilmente
        StringBuilder sb = new StringBuilder(texto);
        
        // Recorre cada carácter en posición impar y lo reemplaza por un asterisco
        for (int i = 1; i < sb.length(); i += 2) {
            sb.setCharAt(i, '*');
        }
        
        // Imprime el resultado
        System.out.println("Texto con posiciones impares sustituidas por '*': " + sb.toString());
    }
}
