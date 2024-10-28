/*
* Calculador Media con 1 Variable
* Autor: Javier González Prados
* Fecha 13-SEP-2024
 */
package tema1;

import java.util.Scanner;

public class JGPt01e08c {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float sumaEdades;

        System.out.println("Vamos a calcular la media introduciendo solo una variable");
        System.out.println("Introduce la edad de la primer persona: ");
        sumaEdades = teclado.nextInt();
        System.out.println("Introduce la edad de la segunda persona: ");
        sumaEdades += teclado.nextInt();
        System.out.println("Introduce la edad de la tercera persona: ");
        sumaEdades += teclado.nextInt();
        System.out.println("Introduce la edad de la cuarta persona: ");
        sumaEdades += teclado.nextInt();

        sumaEdades /= 4;

        System.out.println("La media de edad es: " + String.format("%.2f", sumaEdades));
    }
}
