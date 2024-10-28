/*
 * Programa que permita introducir números y nos muestre el resultado de sumarlos, hasta 
que introduzca un número mayor que 1000. Si no se introduce un número mayor que 1000 el 
programa finalizará después de introducidos 15 números. (Ojo: es fácil equivocarse y hacer que 
solicite un numero de más o bien que no sume correctamente)
  
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E23 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, suma = 0, operacion = 0;

        System.out.println("Introduce un numero: ");

        do {
            n = teclado.nextInt();
            suma += n;
            if (n >= 1000) { System.out.println("La suma es: " + suma);break;
            } else {
                operacion += 1;
                System.out.println("La suma es: " + suma);
                System.out.println("Quedan " + (15 - operacion) + " operaciones");
                System.out.println("Introduce otro numero: ");}

            }  while ((n < 1000) || (operacion == 0));
        
    }
}
