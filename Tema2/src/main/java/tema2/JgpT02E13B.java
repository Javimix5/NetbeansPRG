/*
 * Realizar un programa que se le introduzca una nota (un valor entero 
 * entre 0 y 10) y nos muestre por pantalla la nota final en texto, 
 * con la siguiente equivalencia: Muy deficiente (0,1,2), Insuficiente (3,4),
 * Aprobado (5,6), Notable (7,8) y Sobresaliente (9,10). 
 * Version SWITCH + CASE ->
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E13B {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nota;
        
        System.out.println("Introduzca la nota del examen en formato numerico: ");
        nota = teclado.nextInt();
        
        switch (nota){
            case 0,1,2 -> System.out.println("La nota es Muy deficiente");
            case 3,4 -> System.out.println("La nota es Insuficiente");
            case 5,6 -> System.out.println("La nota es Aprobado");
            case 7,8 -> System.out.println("La nota es Notable");
            case 9,10 -> System.out.println("La nota es Sobresaliente");
            default ->  System.out.println("La nota introducida no es valida");
        }
        }
         
    }

