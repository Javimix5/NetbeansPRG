package examenevaluacion;

import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */
public class Ejercicio1 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce la cadena numerica:");

        String niveles = teclado.nextLine();

        if (esSeguro(niveles)) {
            System.out.println("El informe es seguro");
        } else {
            System.out.println("El informe no es seguro");
        }
    }

    public static boolean esSeguro(String informe) {
        boolean esCreciente = true, esDecreciente = false;

        for (int i = 1; i < informe.length() - 1; i++) {

            int anterior = Character.getNumericValue(informe.charAt(0));

            int actual = Character.getNumericValue(informe.charAt(i));

            int diferencia = Math.abs(anterior - actual);
            
            if (diferencia < 1 || diferencia > 3) {
                return false;
            }
            if ((actual > anterior && i > 1 && informe.charAt(i - 1) < informe.charAt(i - 2))) {
                return false;
            }
            anterior = actual;

        }
        return true;
    }
}
