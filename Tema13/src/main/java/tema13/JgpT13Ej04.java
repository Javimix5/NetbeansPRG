package tema13;

/**
 *
 * @author Javier González Prados
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class JgpT13Ej04 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        // Array de temperaturas medias durante una semana
        double[] temperaturas = new double[7];

        // Llenar el array con valores aleatorios entre 0 y 40
        for (int i = 0; i < 7; i++) {
            temperaturas[i] = Math.random() * 40;
        }
        
        //Mostrar valores del array
        for (double i : temperaturas) {
            System.out.printf("%.2f", i);
            System.out.println("");
        }

        int posicion1, posicion2;
        double media = 0;

        try {
            System.out.print("Ingrese la posición del día inicial (entre 0 y 6): ");
            posicion1 = teclado.nextInt();

            System.out.print("Ingrese la posición del día final (entre 0 y 6): ");
            posicion2 = teclado.nextInt();

            // Verificar que las posiciones sean válidas
            if (posicion1 < 0 || posicion1 > 6 || posicion2 < 0 || posicion2 > 6) {
                throw new IndexOutOfBoundsException();
            }

            // Calcular la temperatura media entre los días seleccionados
            double suma = 0;
            for (int i = posicion1; i <= posicion2; i++) {
                suma += temperaturas[i];
            }
            media = suma / (posicion2 - posicion1 + 1);

        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada de valores incorrectos. Por favor, ingrese números enteros.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Posiciones fuera de los límites del array.");
        }

        System.out.printf("Temperatura media: %.2f", media);
    
        

    }// Fin main

}// Fin clase
