/*
 * Sin ejecutarlo, explica que hae el siguiente código
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int hora=0; 
 for (int i=1;i<=7*24;i++) { 
 System.out.println (hora); 
 if (++hora > 23) hora=0; 
 } 
 } //fin main 
} //fin clase 

/* Muestra el paso del tiempo de Hora en Hora desde las 00 del día 1 
 * hasta el 23 del dia 7 */