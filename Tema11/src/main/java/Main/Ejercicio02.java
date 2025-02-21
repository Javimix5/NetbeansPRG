
package Main;


/**
 *
 * @author Javier González Prados
 * 
 */
import java.util.Scanner;
import pMates.Calculadora;
import pMates.CalculadoraPro;

public class Ejercicio02 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
       
        CalculadoraPro calc= new CalculadoraPro();
      
     /*  calc.numeros.add(5);
        calc.numeros.add(10);
        calc.numeros.add(15);*/

        String suma = calc.sumarHexa();
        int menor = calc.menor();
       
        double calcMadia = calc.media();
        
        System.out.println("Media: " + calcMadia);

    }// Fin main

}// Fin clase
