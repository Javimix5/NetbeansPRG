/*
 * Programa para informar si el año introducido es Bisiesto
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int year;
       
        
        System.out.println("Introduce el año que quieras saber si es bisiesto: ");
        year = teclado.nextInt();
            
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){ 
            System.out.println("El año " + year + " es bisiesto");
            
        } else System.out.println("El año " + year + " no es bisiesto");
                
                
        }
}