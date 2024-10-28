/*
* Conversor Euros a Dolares
* Autor: Javier González Prados
* Fecha 13-SEP-2024
 */
package tema1;

import java.util.Scanner;

public class JGPt01e02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        float euros, dolares;
        final float TASACAMBIO = 1.14F;

        System.out.println("Hola, este es su conversor de Dolares a Euros!");
        System.out.println("La tasa de cambio actual es de 1 Euro = 1,14 Dolares");
        System.out.println("Por favor,introduzca el valor de Dolares que desea convertir, separado por una coma:");
        dolares = teclado.nextFloat();
    
        euros  = dolares / TASACAMBIO;

        System.out.printf("El cambio de: " + String.format("%.2f", dolares) +" dolares" + String.format(" es: %.2f ", euros) + "euros");
                 
    }
}
