/*
 * 4.12. Realizar un programa que solicite la entrada de una cadena de 6 posiciones, que todas sean 
 * dígitos y sin repetidos. Si no cumple esas condiciones, el usuario deberá introducirla de nuevo hasta 
 * que lo haga correctamente.   
 */
package tema4;

import java.util.Scanner;

public class JgpT04E12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce una cadena de 6 dígitos sin repetidos: ");
            String cadena = teclado.nextLine();

            // Verifica si la cadena tiene 6 caracteres, todos son dígitos y no hay repetidos
            if (esCadenaValida(cadena)) {
                System.out.println("Cadena válida: " + cadena);
                break;
            } else {
                System.out.println("La cadena no cumple los requisitos. Inténtalo de nuevo.");
            }
        }
    }
    private static boolean esCadenaValida(String cadena) {
        // Comprueba si la cadena tiene exactamente 6 caracteres
        if (cadena.length() != 6) {
            return false;
        }
        // Verifica que cada caracter sea un dígito y que no se repita
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            // Comprueba si el carácter es un dígito
            if (!Character.isDigit(c)) {
                return false;
            }
            // Comprueba si el dígito actual se repite en cualquier posición posterior
            for (int j = i + 1; j < cadena.length(); j++) {
                if (c == cadena.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
