package escaperoom;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner teclado = new Scanner(System.in);

    static int segundosLeer;
    static int definicion;
    static int segundosTotales;

    public static void main(String[] args) {

        boolean salir = false;

        System.out.println("Leyendo el diccionario");

        do {
            segundosTotales = 0;
            definicion = 0;
            segundosLeer = 0;
            int num = 1;

            System.out.println("Tiempo de lectura por definición (en segundos)");
            segundosLeer = teclado.nextInt();

            if (segundosLeer == 0) {
                salir = true;
                break;
            } else {
                do {

                    System.out.println("Definicion pagina " + num + ": ");
                    definicion = teclado.nextInt();
                    if (definicion == 0) {
                        break;
                    }
                    segundosTotales += (definicion * segundosLeer);
                    num++;
                } while (definicion != 0);

                int horas = segundosTotales / 3600;
                int minutos = (segundosTotales % 3600) / 60;
                int segundos = segundosTotales % 60;
                System.out.println(horas + ":" + minutos + ":" + segundos);
            }
        } while (!salir);

    }// Fin main

}// Fin clase
