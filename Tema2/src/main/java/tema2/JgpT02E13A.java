/*
 * Realizar un programa que se le introduzca una nota (un valor entero 
 * entre 0 y 10) y nos muestre por pantalla la nota final en texto, 
 * con la siguiente equivalencia: Muy deficiente (0,1,2), Insuficiente (3,4),
 * Aprobado (5,6), Notable (7,8) y Sobresaliente (9,10). 
 * Version IF Anidados
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E13A {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nota;
        
        System.out.println("Introduzca la nota del examen en formato numerico: ");
        nota = teclado.nextInt();
        
        if ((nota >=0) && (nota <=2)){
            System.out.println("La nota es Muy deficiente");
        }else if ((nota >2) && (nota <5)){
            System.out.println("La nota es Insuficiente");
        }else if ((nota >4) && (nota<7)){
            System.out.println("La nota es Aprobado");
        }else if ((nota >6) && (nota <9)){
            System.out.println("La nota es Notable");
        }else if ((nota >8) && (nota <=10)){
            System.out.println("La nota es Sobresaliente");
        } else{
            System.out.println("La nota introducida no es valida");
        }
        }
         
    }

