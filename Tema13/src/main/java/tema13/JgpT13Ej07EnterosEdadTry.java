package tema13;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class JgpT13Ej07EnterosEdadTry {

    static Scanner teclado = new Scanner(System.in);
    static int num;
    static int max = 120;
    static int min = 0;

    public static void main(String[] args) {

        int edad = leerEntero("Introduzca su edad", min, max);

        System.out.println("Edad introducida: " + edad);

    }// Fin main

    public static int leerEntero(String mensaje, int min, int max) {
        int num = 0;
        boolean error;
        do {
            error = false;
            System.out.println("Introduce un numero comprendido entre " + min + " y " + max);
            try {
                num = teclado.nextInt();
                if (num < min || num > max) {
                    System.out.println("Edad fuera de rango. Introduce una nueva edad");
                    error = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: entrada no valida. Debes introducir un numero valido");
                teclado.nextLine();
                error = true;

            }

        } while (error);

        return num;
    }

}// Fin clase
