/*
 * Programa al que se le introduzcan las edades de los alumnos 
 * (-1 para finalizar) y nos informe si hay alguno menor de edad.
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int edad = 0;
        boolean menorEdad = false;
        
        while (edad != -1) {
            System.out.println("Introduce la edad (el programa finalizara cuando se introduzca -1)");
            edad = teclado.nextInt();
            
            if (edad <18){
                menorEdad = true;
                        }{
            if (menorEdad){
                System.out.println("Si, hay algun menor de edad");
            } else System.out.println("No hay menor de edad");
                
            }
            }
    }
}
