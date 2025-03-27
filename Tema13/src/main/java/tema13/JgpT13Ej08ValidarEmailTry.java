package tema13;

/**
 *
 * @author Javier González Prados
 *
 */

import java.util.Scanner;

public class JgpT13Ej08ValidarEmailTry {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduce el email a validar");
        String email = teclado.nextLine();

        try {
            validarEmail(email);
            System.out.println("Email válido");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
      

    }// Fin main

    public static void validarEmail(String email)  {
        if (email == null || email.length() < 5) {
            throw new IllegalArgumentException("Formato email inválido");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Formato email inválido");
        }
        int arrobaIndex = email.indexOf("@");
        if (!email.substring(arrobaIndex + 1).contains(".")) {
            throw new IllegalArgumentException("Formato email inválido");
        }
    }
}// Fin clase
