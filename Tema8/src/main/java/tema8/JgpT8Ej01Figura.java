package tema8;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT8Ej01Figura {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(10.5, 20.8, "rectangulo");

        triangulo.verDimension();

        triangulo.verEstilo();

        System.out.println("Area: " + triangulo.dameArea());

    }// Fin main

}// Fin clase
