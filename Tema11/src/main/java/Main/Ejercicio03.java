
package Main;


/**
 *
 * @author Javier González Prados
 * 
 */
import java.util.Scanner;
import pClasesApoyo.Dado;
import pClasesApoyo.DadoFalso;

public class Ejercicio03 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
      
        
        System.out.println("Juguemos a los dados");
        System.out.println("Lanzamiento");
        System.out.println(Dado.lanzar());
        
        System.out.println("Elige un numero");
        int n =teclado.nextInt();
        
        System.out.println(DadoFalso.lanzar(n));       
       
    }// Fin main

}// Fin clase
