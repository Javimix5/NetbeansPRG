package tema13;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT13Ej01DividirTry {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int dividendo, divisor;
        double division;

        System.out.println("Vamos a dividir");
        System.out.println("Indica el dividendo");
        dividendo = teclado.nextInt();

        System.out.println("Indica el divisor");
        divisor = teclado.nextInt();

        try {
            division = dividendo / divisor;
            System.out.println("Resultado: ");
            System.out.println(dividendo + " / " + divisor + " = " + division);
        } catch (ArithmeticException e) {
            System.out.println("El resultado de la division es 0");            
        }

    }// Fin main

}// Fin clase
