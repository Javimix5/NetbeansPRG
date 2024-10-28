/*
* Conversor Euros a Dolares
* Autor: Javier González Prados
* Fecha 13-SEP-2024
*/
package tema1;
import java.util.Scanner;
public class JGPt01e01 {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float euros,dolares;
        final float TASACAMBIO = 1.14f;
        
        System.out.println("Hola, este es su conversor de Euros a Dolares!");
        System.out.println("La tasa de cambio actual es de 1 Euro = 1,14 Dolares");
        System.out.println("Por favor,introduzca el valor de Euros que desea convertir, separado por una coma:");
        euros = teclado.nextFloat();
        
        dolares = euros * TASACAMBIO;
         
        System.out.printf("El cambio de: " + String.format("%.2f", euros) + " euros" + String.format(" es: %.2f ", dolares) + "dolares");
                 
    }
}
