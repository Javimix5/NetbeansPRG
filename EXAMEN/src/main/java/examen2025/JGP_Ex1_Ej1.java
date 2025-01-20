package examen2025;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JGP_Ex1_Ej1 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduca el numero de medidas emitidas por el sonar");
        int n = teclado.nextInt();

        int[] mediciones = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Introduce las medidas");
            System.out.println("Medida: " + i);
            mediciones[i] = teclado.nextInt();

        }
        int aumenta = vecesIncrementa(mediciones);

        System.out.println("La profundidad del fondo marino ha aumentado " + aumenta + " veces en las ultimas " + n);

    }// Fin main

    public static int vecesIncrementa(int[] mediciones) {

        int incremento = 0;
        for (int i = 1; i < mediciones.length; i++) {
            if (mediciones[i] > mediciones[i - 1]) {
                incremento++;
            }
        }
        return incremento;
    }

}// Fin clase
