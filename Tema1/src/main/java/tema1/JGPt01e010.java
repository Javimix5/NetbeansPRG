/*
* Calcular Área de un rectángulo
* Autor: Javier González Prados
* Fecha 13-SEP-2024
 */
package tema1;

import java.util.Scanner;

public class JGPt01e010 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double cordX,cordY,area;
        
        System.out.println("Vamos a calcular el area de un rectangulo");
        System.out.println("Introduce el valor de X: ");
        cordX = teclado.nextDouble();
        System.out.println("Introduce el valor de Y: ");
        cordY = teclado.nextDouble();
        
        area = Math.abs(cordX * cordY);
        
        System.out.println("El area del rectangulo es: " + String.format("%.2f ", area));
    }
}
