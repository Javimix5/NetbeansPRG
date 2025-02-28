package tema13;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT13Ej01 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int dividendo, divisor, division;

        System.out.println("Vamos a dividir");
        System.out.println("Indica el dividendo");
        dividendo = teclado.nextInt();
        System.out.println("Indica el divisor");
        divisor = teclado.nextInt();

        try {
            division = dividendo / divisor;
        } catch (Exception e) {
            division = 0;
        }
        System.out.println("Resultado: ");
        System.out.println(dividendo + " / " + divisor + " = " + division);

    }// Fin main

}// Fin clase
