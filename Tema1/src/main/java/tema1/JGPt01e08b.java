/*
* Calculador Media con 2 Variables
* Autor: Javier González Prados
* Fecha 13-SEP-2024
*/
package tema1;
import java.util.Scanner;
public class JGPt01e08b {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float edad,media;
        
        System.out.println("Vamos a calcular la media introduciendo solo dos variables");
        System.out.println("Introduce la edad de la primer persona: ");
        edad = teclado.nextInt();
        media = edad;
        System.out.println("Introduce la edad de la segunda persona: ");
        edad = teclado.nextInt();
        media += edad;
        System.out.println("Introduce la edad de la tercera persona: ");
        edad = teclado.nextInt();
        media += edad;
        System.out.println("Introduce la edad de la cuarta persona: ");
        edad = teclado.nextInt();
        media += edad;
        
        media /= 4;
        
        System.out.println("La media de edad es: " + String.format("%.2f", media));    
    }
}
