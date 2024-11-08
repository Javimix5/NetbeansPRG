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

        // Buscamos la posición de la Arroba
        int Arroba = email.indexOf('@');
        
        // Buscamos la posición del primer Punto
        int Punto = email.indexOf('.', Arroba);

        if (Arroba != -1 && Punto != -1) {
            // Extraemos el texto entre la Arroba y el Punto
            String dominio = email.substring(Arroba + 1, Punto);
            System.out.println("Dominio: " + dominio);
        } else {
            // En el caso de que introduzcamos un email erróneo, que muestre el siguiente mensaje
            System.out.println("Email no válido.");
        }
        
//        Segunda versión que contemple que pueda haber varios puntos en el dominio (Ejemplo: info@clientes.mundo-r.com mostraría clientes.mundo-r )
//        // Buscamos la posición de la Arroba
//        int Arroba = email.indexOf('@');

//        // Buscamos la posición del último Punto después de la Arroba
//        int Punto = email.lastIndexOf('.');
//
//        if (Arroba != -1 && Punto != -1 && Punto > Arroba) {
//            // Extraemos el texto entre la Arroba y el Punto
//            String dominio = email.substring(Arroba + 1, Punto);
//            System.out.println("Dominio: " + dominio);
//        } else {
//            // En el caso de que introduzcamos un email erróneo, que muestre el siguiente mensaje
//            System.out.println("Email no válido.");
//        }
    }

}
