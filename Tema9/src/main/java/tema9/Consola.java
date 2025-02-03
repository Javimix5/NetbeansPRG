package tema9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */
public class Consola {

    private static Scanner teclado = new Scanner(System.in);

    //Funcion lee Entero
    public static int leerEntero() {
        return teclado.nextInt();
    }

    //Funcion lee Entero y mensaje
    public static int leerEntero(String mensaje) {
        System.out.println(mensaje + " ");
        return teclado.nextInt();
    }

    //Funcion lee Enteros entre rango y mensaje
    public static int leerEntero(String mensaje, int min, int max) {
        while (true) {
            System.out.println(mensaje + " ");
            try {
                int valor = teclado.nextInt();
                if (valor >= min && valor <= max) {
                    return valor;
                } else {
                    System.out.println("Valor fuera de rango, introduce un rango entre: " + min + "&" + max);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, no es un numero entero");
                teclado.nextInt();
            }
        }
    }

    //Funcion lee Enteros entre rango
    public static int leerEntero(int min, int max) {
        while (true) {
            try {
                int valor = teclado.nextInt();
                if (valor >= min && valor <= max) {
                    return valor;
                } else {
                    System.out.println("Valor fuera de rango, introduce un rango entre: " + min + "&" + max);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, no es un numero entero");
                teclado.nextInt();
            }
        }
    }

}//Fin clase
