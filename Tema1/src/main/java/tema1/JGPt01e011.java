/*
* Teorema de Pitágoras
* Autor: Javier González Prados
* Fecha 13-SEP-2024
*/
package tema1;
import java.util.Scanner;
public class JGPt01e011 {
 
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        
        float cateto1,cateto2;
        double hipotenusa;
        
        System.out.println("Vamos a calcular la Hipotenusa");
        System.out.println("Introduzca el valor del primer cateto:");
        cateto1 = teclado.nextFloat();
        System.out.println("Introduzca el valor del segundo cateto:");
        cateto2 = teclado.nextFloat();
        
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        /*El código que se usaría para el cálculo de la Hipotenusa con la 
        *fórmula que usa java directamente sería el siguiente:
        *
        *    hipotenusa = Math.hypot(cateto1, cateto2);
        */
        System.out.println("La hipotenusa resultante es: " + String.format("%.2f", hipotenusa));
                 
    }
}
