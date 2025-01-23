package tema8;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT8Ej03Figura3 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        TrianguloV3 triangulo = new TrianguloV3();

        triangulo.verDimension();

        triangulo.verEstilo();

        System.out.println("Area: " + triangulo.dameArea());

    }// Fin main

}// Fin clase
