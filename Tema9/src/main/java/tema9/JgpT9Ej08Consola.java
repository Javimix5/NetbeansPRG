package tema9;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT9Ej08Consola {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Prueba 1: leer Entero");
        int edad = Consola.leerEntero();
        System.out.println("Edad: " + edad);

        System.out.println("Prueba 2: leer Entero (\"Introduzca su edad\")");
        edad = Consola.leerEntero(teclado.nextLine());
        System.out.println("Edad: " + edad);

        System.out.println("Prueba 3: leer Entero (\"Introduzca su edad\", 0, 120) ");
        edad = Consola.leerEntero(teclado.nextLine(), teclado.nextInt(), teclado.nextInt());
        System.out.println("Edad: " + edad);

        System.out.println("Prueba 4: leer Entero (0, 120)");
        edad = Consola.leerEntero(teclado.nextInt(), teclado.nextInt());
        System.out.println("Edad: " + edad);

    }//fin main

}// Fin clase
