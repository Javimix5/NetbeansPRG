/*
 * Diseñar un algoritmo al que se le introduzcan las notas de un alumno en 
 * los nueve módulos de un ciclo y nos informe si puede ir a la FCT 
 * (todos aprobados). ¿Habría que solicitarle al usuario siempre las notas 
 * de los nueve módulos? 
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E17 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nota = 5;
        int totalNota = 1;
        boolean fct = true;

        System.out.println("Introduce las nota: ");

        for (int i = 1; i <= 9; i++){

        nota = teclado.nextInt();
        
        while ((nota < 0) || (nota > 10)) {
            
            System.out.println("Nota erronea, introduce una nota entre 0 y 10");
            nota = teclado.nextInt();
        }
        if (nota < 5) {
            fct = false;
            break;
        } else {
            System.out.println("Introduzca la siguiente nota: ");
        }
    }
        if (fct) {
            System.out.println("Enhorabuena, accede a FCT");
        } else {
            System.out.println("No accede a FCT");
        }
    }
}
