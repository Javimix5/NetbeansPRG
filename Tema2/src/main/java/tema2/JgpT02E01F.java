/*
 * Programa que lea un número entero y decir si está comprendido 
 * entre 10 y 20 (ambos incluidos)
 * Autor: Javier González Prados
 */

package tema2;

import java.util.Scanner;

public class JgpT02E01F {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        System.out.println("Introduce un numero entero: ");
        num = teclado.nextInt();
        
        if (num >=10 && num <=20) System.out.println("El numero esta entre 10 y 20, ambos incluidos");
        else if (num <10 || num >20) System.out.println("El numero es menor a 10 o mayor a 20");
    }
}
