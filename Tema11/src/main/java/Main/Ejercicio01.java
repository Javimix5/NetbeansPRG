
package Main;


/**
 *
 * @author Javier González Prados
 * 
 */
import java.util.Scanner;
import pMates.Calculadora;

public class Ejercicio01 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
       
        Calculadora calc= new Calculadora();
      
        /* calc.numeros.add(5);
        calc.numeros.add(10);
        calc.numeros.add(15);

        int suma = calc.sumar();
        int menor = calc.menor();*/
       
        double calcMadia = calc.media();
        
        System.out.println("Media: " + calcMadia);

    }// Fin main

}// Fin clase
