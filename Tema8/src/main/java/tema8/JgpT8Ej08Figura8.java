package tema8;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;
import javax.xml.crypto.Data;

public class JgpT8Ej08Figura8 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        TrianguloV7 triangulo = new TrianguloV7(6,6,"equilatero"); 

        triangulo.verDimension();

        triangulo.verEstilo();               

        System.out.println("Area del triangulo con 3 parametros: " + triangulo.dameArea());              
          
        TrianguloV7 triangulo2 = new TrianguloV7(triangulo);
        
        System.out.println("Area del triangulo del nuevo constructor: " + triangulo2.dameArea());

    }// Fin main

}// Fin clase
