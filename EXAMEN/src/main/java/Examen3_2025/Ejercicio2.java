package Examen3_2025;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] enteros = {3, 3, 10, 3, 8, 6, 3, 8, 7, 2, 8, 2};

        int[] repeticion = new int[enteros.length];

        Arrays.fill(repeticion, 0);

        for (int i = 0; i < enteros.length; i++) {

            if (repeticion[i] == -1) {
                continue;
            }

            int contador = 1;
            for (int j = i + 1; j < enteros.length; j++) {
                if (enteros[i] == enteros[j]) {
                    contador++;
                    repeticion[j] = -1;
                }
            }

            repeticion[i] = contador;
        }
        System.out.println("Numeros que se repiten");
        for (int i = 0; i < enteros.length; i++) {
            if (repeticion[i] > 1) {
                System.out.println(enteros[i] + " se repite " + repeticion[i] + " veces");
            }
        }

    }

}
