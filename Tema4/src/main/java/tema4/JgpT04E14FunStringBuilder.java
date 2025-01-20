/*
 * 4.14. Realizar un programa al que se le introduzca una cadena por teclado, que la convierta a 
 * StringBuilder, y aplicando métodos de esa clase, haga lo siguiente: 
 * a. Borrar el carácter que haya en la posición 3. 
 * b. Insertar una ‘x’ en la posición 5. 
 * c. Sustituir el carácter de la posición 1 por una ‘z’.
 * d. Borrar los caracteres entre la posición 5 y 10. 
 * e. Darles la vuelta a todos los caracteres del StringBuilder. 
 * f. Convertir el StringBuilder en cadena. 
 * Habrá que verificar en algunos casos que la cadena tiene una longitud mayor que la de 
 * la posición indicada, sino producirá errores.   
 */
package tema4;

import java.util.Scanner;

public class JgpT04E14FunStringBuilder {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String input = teclado.nextLine();
        
        // Convierte la cadena a StringBuilder
        StringBuilder sb = new StringBuilder(input);
        
        // a. Borrar el carácter que haya en la posición 3, si es posible
        if (sb.length() > 3) {
            sb.deleteCharAt(3);
            System.out.println("Después de borrar el carácter en la posición 3: " + sb);
        } else {
            System.out.println("La cadena es demasiado corta para borrar el carácter en la posición 3.");
        }

        // b. Insertar una ‘x’ en la posición 5, si es posible
        if (sb.length() >= 5) {
            sb.insert(5, 'x');
            System.out.println("Después de insertar 'x' en la posición 5: " + sb);
        } else {
            System.out.println("La cadena es demasiado corta para insertar en la posición 5.");
        }

        // c. Sustituir el carácter de la posición 1 por una ‘z’, si es posible
        if (sb.length() > 1) {
            sb.setCharAt(1, 'z');
            System.out.println("Después de sustituir el carácter en la posición 1 por 'z': " + sb);
        } else {
            System.out.println("La cadena es demasiado corta para sustituir el carácter en la posición 1.");
        }

        // d. Borrar los caracteres entre la posición 5 y 10, si es posible
        if (sb.length() >= 10) {
            sb.delete(5, 10);
            System.out.println("Después de borrar los caracteres entre la posición 5 y 10: " + sb);
        } else if (sb.length() > 5) {
            sb.delete(5, sb.length()); // Borra desde la posición 5 hasta el final si no hay 10 caracteres
            System.out.println("Después de borrar desde la posición 5 hasta el final: " + sb);
        } else {
            System.out.println("La cadena es demasiado corta para borrar entre las posiciones 5 y 10.");
        }

        // e. Darles la vuelta a todos los caracteres del StringBuilder
        sb.reverse();
        System.out.println("Después de dar la vuelta a todos los caracteres: " + sb);

        // f. Convertir el StringBuilder en cadena
        String resultado = sb.toString();
        System.out.println("Resultado final como cadena: " + resultado);
        
    }
}
