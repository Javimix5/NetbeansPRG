/*
 * 4.6. Realiza un programa al que se le introduzca un email y nos devuelva el nombre del dominio 
 * es decir, lo que está entre la arroba y el punto (Ejemplo: info@mundo-r.com mostraría mundo-r ). 
 * Opcionalmente, hacer una segunda versión que contemple que pueda haber varios puntos en el 
 * dominio (Ejemplo: info@clientes.mundo-r.com mostraría clientes.mundo-r )   
 */
package tema4;

import java.util.Scanner;

public class JgpT04E06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un email: ");
        String email = teclado.nextLine();

        // Buscar la posición de '@' y del primer '.' después de '@'
        int arrobaPos = email.indexOf('@');
        int puntoPos = email.indexOf('.', arrobaPos);

        if (arrobaPos != -1 && puntoPos != -1) {
            // Extraer el texto entre '@' y el primer '.'
            String dominio = email.substring(arrobaPos + 1, puntoPos);
            System.out.println("Dominio: " + dominio);
        } else {
            System.out.println("Email no válido.");
        }
        
//        Segunda versión que contemple que pueda haber varios puntos en el dominio (Ejemplo: info@clientes.mundo-r.com mostraría clientes.mundo-r )
//        // Buscar la posición de '@' y del último '.' después de '@'
//        int arrobaPos = email.indexOf('@');
//        int ultimoPuntoPos = email.lastIndexOf('.');
//
//        if (arrobaPos != -1 && ultimoPuntoPos != -1 && ultimoPuntoPos > arrobaPos) {
//            // Extraer el texto entre '@' y el último '.'
//            String dominio = email.substring(arrobaPos + 1, ultimoPuntoPos);
//            System.out.println("Dominio: " + dominio);
//        } else {
//            System.out.println("Email no válido.");
//        }
    }

}
