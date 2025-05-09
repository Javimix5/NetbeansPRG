package tema13;

/**
 * Realiza una función/método que se le pase por parámetro una cadena que representa una 
dirección de correo electrónico. En caso de que la cadena no cumpla las condiciones sintácticas de 
un email, se generará una excepción de tipo: “Formato email inválido”. Los requisitos que tiene que 
tener una dirección de email podrían ser: número mínimo de caracteres=5, una arroba y al menos 
un punto después de la arroba. Hacer también un programa que llame a la función anterior y capture 
la excepción generada. 
 * @author Javier González Prados
 *
 */

import java.util.Scanner;

public class JgpT13Ej08ValidarEmailTry {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) throws FormatoEmailInvalido {
        
        // Solicita por pantalla la introducción de un email
        System.out.println("Introduce el email a validar");
        String email = teclado.nextLine();

        // Entramos en el try catch para controlar posibles errores
        try {
            // Llama a la función validarEmail
            validarEmail(email);
            System.out.println("Email válido");
            
            // Mostrará el error de email inválido en caso de error
        } catch (FormatoEmailInvalido e) {
            System.out.println("Error: " + e.getMessage());
        }
      

    }// Fin main

    // Función validarEmail
    public static void validarEmail(String email) throws FormatoEmailInvalido {
        
        // Si el email está vacío o tiene una longitud menor a 5 caracteres, mostrará el error: Formato inválido
        if (email == null || email.length() < 5) {
            throw new FormatoEmailInvalido("Formato email inválido");
        }
        
        // Si el email no contiene la @, mostrará el error: Formato inválido
        if (!email.contains("@")) {
            throw new FormatoEmailInvalido("Formato email inválido");
        }
        
        // Si el email no tiene un punto después de la @, mostrará el error: Formato inválido
        int arrobaIndex = email.indexOf("@");
        if (!email.substring(arrobaIndex + 1).contains(".")) {
            throw new FormatoEmailInvalido("Formato email inválido");
        }
    }
}// Fin clase
