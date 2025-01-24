package tema8;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT8Ej05Figura5 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        TrianguloV5 triangulo = new TrianguloV5(6); //Asignamos solo un parametro ya que alto=ancho

        triangulo.verDimension();

        triangulo.verEstilo();

        System.out.println("Area: " + triangulo.dameArea());

    }// Fin main

}// Fin clase
