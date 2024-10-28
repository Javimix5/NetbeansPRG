/*
* Calculos diversos
* Autor: Javier González Prados
* Fecha 13-SEP-2024
*/
package tema1;
import java.util.Scanner;
public class JGPt01e03 {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int a,b,c;
        double d;
                
        System.out.println("Introduce el valor 1: ");
        a = teclado.nextInt ();
        System.out.println("Introduce el valor 2: ");
        b = teclado.nextInt();
        c = a + b;
        System.out.println("Resultado de sumar: " + c );
        c = a - b;
        System.out.println("Resultado de restar: " + c );
        c = a * b;
        System.out.println("Resultado de multiplicar: " + c );
        d = (double) a / b;
        System.out.println("Resultado de dividir: " + d );
        
    }
}