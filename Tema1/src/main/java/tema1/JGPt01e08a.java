/*
* Calculador Media con 4 Variables
* Autor: Javier González Prados
* Fecha 13-SEP-2024
*/
package tema1;
import java.util.Scanner;
public class JGPt01e08a {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int edad1,edad2,edad3,edad4;
        float media;
         
        System.out.println("Introduce la edad de la primer persona: ");
        edad1 = teclado.nextInt();
        System.out.println("Introduce la edad de la segunda persona: ");
        edad2 = teclado.nextInt();
        System.out.println("Introduce la edad de la tercera persona: ");
        edad3 = teclado.nextInt();
        System.out.println("Introduce la edad de la cuarta persona: ");
        edad4 = teclado.nextInt();
        
        media = (edad1 + edad2 + edad3 + edad4) / 4;
        
        System.out.println("\nLa media de edad es: " + String.format("%.2f", media) + "\n");    
    }
}
