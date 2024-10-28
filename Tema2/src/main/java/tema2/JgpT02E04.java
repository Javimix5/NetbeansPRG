/*
 * Programa al que se le introduzcan las coordenadas X e Y de dos puntos del plano, nos diga si 
 * lo que forman es un cuadrado o un rectángulo y calcule el área del mismo.
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cordX1,cordY1,cordX2,cordY2,area;
        
        System.out.println("Introduce las coordenadas de los dos primeros puntos");
        System.out.println("Introduce la coordenada X1: ");
        cordX1 = teclado.nextInt();
        System.out.println("Introduce la coordenada Y1: ");
        cordY1 = teclado.nextInt();
        System.out.println("Introduce las coordenadas de los otros dos puntos");
        System.out.println("Introduce la coordenada X2: ");
        cordX2 = teclado.nextInt();
        System.out.println("Introduce la coordenada Y2: ");
        cordY2 = teclado.nextInt();
        
        area = Math.abs((cordX1 + cordX2) * (cordY1 + cordY2));

        if ((cordX1 == cordY1) && (cordX2 == cordY2)){
         
        System.out.println("Es un cuadrado, y esta es su area: " + area);
        }else System.out.println("Es un rectangulo, y esta es su area: " + area);

        }
}