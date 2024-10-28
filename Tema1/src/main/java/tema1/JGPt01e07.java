/*
* Ordenador a bordo Consumo cada 100km
* Autor: Javier González Prados
* Fecha 13-SEP-2024
 */
package tema1;

import java.util.Scanner;

public class JGPt01e07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float kmInicial,kmFinal,depositoInicial,depositoFinal,consumo;

        System.out.println("Introduce los kilometros previos al repostaje: ");
        kmInicial = teclado.nextInt();
        System.out.println("Introduce los kilometros tras el repostaje: ");
        kmFinal = teclado.nextInt();
        System.out.println("Introduce el combustible previo al repostaje: ");
        depositoInicial = teclado.nextInt();
        System.out.println("Introduce el combustible tras el respotaje: ");
        depositoFinal = teclado.nextInt();
        
        consumo = ((depositoFinal - depositoInicial) *100 / (kmFinal - kmInicial));
        System.out.println("\nEl consumo cada 100km es: " + String.format("%.2f", consumo) + "\n");

    }
}
