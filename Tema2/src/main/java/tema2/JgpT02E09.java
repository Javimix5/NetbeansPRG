/*
 * Realizar un programa al que se le introduzca la hora del día (0 –23) 
 * y nos diga que días de la semana hay salida de bus
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numHora;

        System.out.println("Introduzca la hora entre las 0 y las 23 horas: ");
        numHora = teclado.nextInt();

        switch (numHora) {
            case 0,1,2,3,4,5,6,7,8 -> System.out.println("No hay bus ningun dia de la semana a esta hora");
            case 9,11,13 -> System.out.println("Solo hay bus los domingos");
            case 10 -> System.out.println("Hay bus todos los dias");
            case 12 -> System.out.println("Hay bus solo jueves y domingo");
            case 14 -> System.out.println("Hay todos los dias");
            case 15,16,17,18,19,20,21,22,23 -> System.out.println("No hay bus ningun dia de la semana a esta hora");
            default -> System.out.println("Introduzca una hora correcta");
        }
    }
}
