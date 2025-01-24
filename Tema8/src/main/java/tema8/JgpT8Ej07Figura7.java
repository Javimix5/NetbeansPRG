package tema8;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;
import javax.xml.crypto.Data;

public class JgpT8Ej07Figura7 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        TrianguloV7 triangulo = new TrianguloV7(6,6,"equilatero"); //Asigna los datos del constructor con 3 parametros

        triangulo.verDimension();

        triangulo.verEstilo();               

        System.out.println("Area del triangulo con 3 parametros: " + triangulo.dameArea());                
        
        
        //Hay un programa que cree un Triangulo_v7 con el constructor de 3 parámetros creado previamente, y otro triángulo utilizando el nuevo constructor. Mostrar el área de ambos
        
        TrianguloV7 triangulo2 = new TrianguloV7(triangulo);
        
        System.out.println("Area del triangulo del nuevo constructor: " + triangulo2.dameArea());

    }// Fin main

}// Fin clase
