/*
 * Mostrar por pantalla alternativamente “hola” y “adiós” hasta completar x líneas, siendo x un 
número entero positivo tecleado previamente (ojo: el número x puede ser par o impar)
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E25 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;
        
        System.out.println("Se va a generar un bucle con Hola y Adios segun el numero introducido");
        System.out.println("Introduce un numero:");
        num = teclado.nextInt();
        
        for (int i= 1; i <= num; i++) {
            if (i % 2 == 0){
                System.out.println("\'Adios\'");
               
            }else {System.out.println("\'Hola\'");}
        }

    }
}