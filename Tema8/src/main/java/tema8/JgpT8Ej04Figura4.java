package tema8;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT8Ej04Figura4 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        TrianguloV4 triangulo = new TrianguloV4(10.5, 20.8);

        triangulo.verDimension();

        triangulo.verEstilo();

        System.out.println("Area: " + triangulo.dameArea());

    }// Fin main

}// Fin clase
