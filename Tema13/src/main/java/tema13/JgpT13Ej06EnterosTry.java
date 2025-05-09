package tema13;

/**
 * Crear una función leerEntero(int max, int min) que solicite al usuario la entrada de un número 
entero y que valide que es un valor entero y que está comprendido entre los parámetros max y min 
(esto es, mayor o igual que min y menor o igual que max). El usuario deberá repetir la entrada de 
datos hasta que lo haga bien, devolviendo finalmente la función el valor introducido y validado
 * @author Javier González Prados
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class JgpT13Ej06EnterosTry {

    static Scanner teclado = new Scanner(System.in);
    static int num;

    public static void main(String[] args) {

        // Solita por pantalla, introducir un número entero máximo
        System.out.println("Indica el numero maximo");
        int max = teclado.nextInt();
        
        // Solicita por pantalla, introducir un número entero mínimo
        System.out.println("Introduce el numero minimo");
        int min = teclado.nextInt();

        // Llama a la función leerEntero
        leerEntero(min, max);
        
        // Muestra por pantalla el mensaje que incluye los dos parámetros anteriores
        System.out.println("El numero " + num + " esta entre el " + min + " y el " + max);

    }// Fin main

    // Función de leerEntero
    public static int leerEntero(int min, int max) {
        
        boolean error = true;
        do {
            System.out.println("Introduce un numero comprendido entre " + min + " y " + max);
            
            // Entra en el try catch para controlar posibles errores durante la entrada de datos
            try {
                num = teclado.nextInt();
                
                // Error en caso de número no válido 
            } catch (InputMismatchException e) {
                System.out.println("Error: entrada no valida. Debes introducir un numero valido");
                teclado.nextLine();
                
                // Error en caso de formato de número erróneo
            } catch (NumberFormatException e) {
                System.out.println("Error: error de formato de numero");
                teclado.nextLine();
            } finally {
                
                // Comprobar si el número se encuentra dentro del rango
                if (min < num && num < max) {
                    error = false;
                } else {
                    System.out.println("Numero fuera de rango");
                }
            }

        } while (error);

        // Devuelve el número resultante
        return num;
    }

}// Fin clase
