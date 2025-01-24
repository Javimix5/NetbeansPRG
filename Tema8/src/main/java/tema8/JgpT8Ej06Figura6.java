package tema8;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT8Ej06Figura6 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        TrianColor_V6 triangulo = new TrianColor_V6("Equilatero",6,6,"naranja"); //Asignamos solo un parametro ya que alto=ancho

        triangulo.verDimension();

        triangulo.verEstilo();               

        System.out.println("Area: " + triangulo.dameArea());
        
        //Ver color
        
        System.out.println("Color: "+triangulo.color);

    }// Fin main

}// Fin clase
