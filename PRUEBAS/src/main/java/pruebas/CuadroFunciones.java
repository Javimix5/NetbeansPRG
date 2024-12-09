package pruebas;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class CuadroFunciones {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int ancho = leerEnteroEntre("Introduce el ancho", 1, 30);
        int alto = leerEnteroEntre("Introduce el alto", 2, 10);
        System.out.print("Introduce el simbolo que quieras imprimir:");
        char simbolo = teclado.next().charAt(0);

        System.out.println("Se imprime el cuadro de " + ancho + " x " + alto);
        imprimirCuadro(ancho, alto,simbolo);

    }

    static int leerEnteroEntre(String mensaje, int min, int max) {
        System.out.print(mensaje + ": ");
        int x = Integer.parseInt(teclado.nextLine());
        //Para repetir la petición de numero en caso de error
        while (x < min || x > max) {
            System.out.println("Error. " + mensaje + ": ");
            x = Integer.parseInt(teclado.nextLine());
        }
        return x;
    }

    static void imprimirCuadro(int ancho, int alto, char simbolo) {
        for (int i = 0; i < alto; i++) {
            imprimirSimbolo(simbolo,ancho);
          }
    }

    /**
     * Funcion para imprimir un simbolo (char) x veces
     * @param simbolo a imprimir de tipo char
     * @param veces numero veces que se imprime
     */
    static void imprimirSimbolo(char simbolo, int veces) {
        System.out.println(sucesionSimbolos(simbolo, veces));
    }

    static String sucesionSimbolos(char simbolo, int veces) {
        String sucesion = "";
        for (int i = 0; i < veces; i++) {
            sucesion += simbolo;
        }
        return sucesion;
    }

}
