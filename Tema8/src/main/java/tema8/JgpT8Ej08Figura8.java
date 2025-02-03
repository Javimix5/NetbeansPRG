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

        TrianguloV8 triangulo = new TrianguloV8(6,6,"equilatero"); //Asigna los datos del constructor con 3 parametros

        triangulo.verDimension();

        triangulo.verEstilo();               

        System.out.println("Area del triangulo con 3 parametros: " + triangulo.dameArea());                
                        
        
        TrianguloV8 triangulo2 = new TrianguloV8(triangulo);
        
        System.out.println("Area del triangulo del nuevo constructor: " + triangulo2.dameArea());

    }// Fin main

}// Fin clase
