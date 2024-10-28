/*
 * Diseñar un algoritmo al que se le introduzca la cantidad de horas, minutos y segundo 
 * mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total de 
 * segundos transcurridos desde el comienzo del día. No emplear las clases de fecha de Java
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int hora,min,seg, tiempo;
        
        System.out.println("Introduce la hora actual en formato digital");
        System.out.println("Introduce la hora: ");
        hora = teclado.nextInt();
        System.out.println("Introduce los minutos: ");
        min = teclado.nextInt();
        System.out.println("Introduce los segundos: ");
        seg = teclado.nextInt();
        
        tiempo = ((hora * 3600) + (min * 60) + seg);
        
        if ((hora <= 23) && (min <=59) && (seg <=59)){
            System.out.println("Los segundos transcurridos desde el inicio del dia son: " + tiempo + " segundos");
        }else System.out.println("La hora no es correcta");

        }
}