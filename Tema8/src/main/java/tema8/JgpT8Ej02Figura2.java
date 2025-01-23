package tema8;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT8Ej02Figura2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        TrianguloV2 triangulo = new TrianguloV2(10.5, 10.5, "equilatero");

        triangulo.verDimension();

        triangulo.verEstilo();

        System.out.println("Area: " + triangulo.dameArea());

    }// Fin main

}// Fin clase
