/*
* Calculos diversos
* Autor: Javier González Prados
* Fecha 13-SEP-2024
 */
package tema1;

import java.util.Scanner;

public class JGPt01e05 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double celsius,fahre,pulgada,centi;
               
        System.out.println("Introduce la temperatura en Celsius: ");
        celsius = teclado.nextDouble();
        
        fahre = (Math.round((9f / 5 * celsius + 32)*100)/100f);
        
        System.out.printf("Equivalencia en Fahrenheit: %.2f ºF", fahre);
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("Introduce la cantidad de agua en pulgadas: ");
        pulgada = teclado.nextDouble();
        
        centi = (double) pulgada * 2.55d;
        System.out.printf("La equivalencia de agua en centimetros es: %.1f cm", centi);
        
        
                
        
        
                

      
    }
}
