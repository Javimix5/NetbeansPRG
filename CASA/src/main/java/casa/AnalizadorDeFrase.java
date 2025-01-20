/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casa;

/**
 *
 * @author CASA
 */
public class AnalizadorDeFrase {

    public static void main(String[] args) {
        // Frase a analizar
        final String frase = "¡Hola Mundo! 2024 es increíble.";

        // Recorremos cada carácter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            // Verificamos el tipo de carácter
            if (Character.isWhitespace(c)) {
                System.out.println("'" + c + "' -> ESPACIO");
            } else if (Character.isDigit(c)) {
                System.out.println("'" + c + "' -> DIGITO");
            } else if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    System.out.println("'" + c + "' -> LETRA MAYUSCULA");
                } else if (Character.isLowerCase(c)) {
                    System.out.println("'" + c + "' -> LETRA MINUSCULA");
                }
            } else {
                System.out.println("'" + c + "' -> OTRO");
            }
        }
    }
}
