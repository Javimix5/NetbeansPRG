package tema13;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT13Ej02SumaTry {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        double num1, num2, suma;

        try {

            System.out.println("Vamos a sumar");
            System.out.println("Indica el primer numero");
            num1 = Double.parseDouble(teclado.nextLine());
            System.out.println("Indica el segundo numero");
            num2 = Double.parseDouble(teclado.nextLine());

            suma = num1 + num2;

            System.out.println("Resultado: ");
            System.out.println(num1 + " + " + num2 + " = " + suma);

        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no valida. Debes introducir un numero valido");
        }

    }// Fin main

}// Fin clase
