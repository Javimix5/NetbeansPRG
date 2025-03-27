package tema13;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class JgpT13Ej06EnterosTry {

    static Scanner teclado = new Scanner(System.in);
    static int num;

    public static void main(String[] args) {

        System.out.println("Indica el numero maximo");
        int max = teclado.nextInt();
        System.out.println("Introduce el numero minimo");
        int min = teclado.nextInt();

        leerEntero(min, max);
        System.out.println("El numero " + num + " esta entre el " + min + " y el " + max);

    }// Fin main

    public static int leerEntero(int min, int max) {
        boolean error = true;
        do {
            System.out.println("Introduce un numero comprendido entre " + min + " y " + max);
            try {
                num = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: entrada no valida. Debes introducir un numero valido");
                teclado.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Error: error de formato de numero");
                teclado.nextLine();
            } finally {
                if (min < num && num < max) {
                    error = false;
                } else {
                    System.out.println("Numero fuera de rango");
                }
            }

        } while (error);

        return num;
    }

}// Fin clase
