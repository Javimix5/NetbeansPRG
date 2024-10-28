/*
 * Para aprobar el curso se valorará la nota del examen, la valoración del trabajo en clase y la 
 * nota de un trabajo práctico. Aprobarán los alumnos que estén en alguna de las siguientes 
 * situaciones: 
 * • Nota examen mayor o igual a 5 
 * • Nota examen entre 4 y 5, trabajo en clase mayor que cinco y trab. práctico mayor que 5. 
 * • Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo práctico o en la valoración 
 * del trabajo en clase.
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double examen, clase, practico;
        
        System.out.println("Introduce la nota del examen: ");
        examen = teclado.nextDouble();
        System.out.println("Introduce la nota de clase: ");
        clase = teclado.nextDouble();
        System.out.println("Introduce la nota del trabajo practico: ");
        practico = teclado.nextDouble();

        if ((examen >= 5) || (((4 <= examen && examen < 5)) && (clase > 5) && (practico > 5)) || (((4 <= examen && examen < 5)) && ((practico > 8) || (clase > 8)))){
        System.out.println("Aprobados");
        }else System.out.println("Suspenso");

        }
}