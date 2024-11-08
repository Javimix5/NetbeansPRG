/*
 * 4.10. Realizar un programa que solicite la entrada de 10 cadenas de caracteres y construya una 
 * cadena con el primer carácter de cada cadena. Finalmente mostrará dicha cadena por pantalla.   
 */
package tema4;

import java.util.Scanner;

public class JgpT04E10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce la cadena " + i + ": ");
            String entrada = teclado.nextLine();

            // Verifica que la cadena no esté vacía antes de tomar el primer carácter
            if (!entrada.isEmpty()) {
                resultado.append(entrada.charAt(0));
            } else {
                System.out.println("La cadena está vacía, no se añadirá ningún carácter.");
            }
        }

        System.out.println("La cadena construida con los primeros caracteres es: " + resultado.toString());
    }
}
