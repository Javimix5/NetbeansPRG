/*
 * 4.2. Diseña un algoritmo capaz de obtener la letra del NIF a partir del número de DNI. Consiste en 
 * dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente 
 * según la siguiente tabla. Almacena las letras del NIF en una cadena  
 */
package tema4;

import java.util.Scanner;

public class JgpT04E02StringDNI {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Array que contiene las letras del NIF en orden
        String Letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        System.out.print("Introduce el número de DNI: ");
        int dni = teclado.nextInt();

        // Calcular el índice usando el resto de la división por 23
        int indice = dni % 23;

        // Obtener la letra correspondiente al índice
        char letraNIF = Letras.charAt(indice);

        System.out.println("El NIF completo es: " + dni + "-" + letraNIF);
    }

}
