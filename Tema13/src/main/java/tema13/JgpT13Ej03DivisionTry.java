package tema13;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class JgpT13Ej03DivisionTry {

    static Scanner teclado = new Scanner(System.in);
    
    static int division;  //Para no tener que declarar la variable, se añade como static

    public static void main(String[] args) {

        int dividendo, divisor;

        try {
            System.out.print("Ingrese el dividendo: ");
            dividendo = teclado.nextInt();

            System.out.print("Ingrese el divisor: ");
            divisor = teclado.nextInt();

            division = dividendo / divisor;

        } catch (InputMismatchException e) {

            System.out.println("Error: Entrada de valores incorrectos. Por favor, ingrese números enteros.");
            
        } catch (ArithmeticException e) {

            System.out.println("Error: No se puede dividir por cero.");
        }

        System.out.println("Resultado: " + division);

    }// Fin main

}// Fin clase
