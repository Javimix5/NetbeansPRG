/*
 * Diseña un algoritmo capaz de obtener la letra del DNI a partir del 
 * número de DNI. Consiste en dividir dicho número entre 23 y tomar el 
 * resto de la división asignándole la letra correspondiente.
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int dni,letra;
        
        System.out.println("Introduzca su numero de DNI para calcular la letra: ");
        dni = teclado.nextInt();
        
        letra = (dni % 23);
        
        switch (letra){
            case 0: System.out.println("La letra correspondiente es \"T\" ");break;
            case 1: System.out.println("La letra correspondiente es \"R\" ");break;
            case 2: System.out.println("La letra correspondiente es \"w\" ");break;
            case 3: System.out.println("La letra correspondiente es \"A\" ");break;
            case 4: System.out.println("La letra correspondiente es \"G\" ");break;
            case 5: System.out.println("La letra correspondiente es \"M\" ");break;
            case 6: System.out.println("La letra correspondiente es \"Y\" ");break;
            case 7: System.out.println("La letra correspondiente es \"F\" ");break;
            case 8: System.out.println("La letra correspondiente es \"P\" ");break;
            case 9: System.out.println("La letra correspondiente es \"D\" ");break;
            case 10: System.out.println("La letra correspondiente es \"X\" ");break;
            case 11: System.out.println("La letra correspondiente es \"B\" ");break;
            case 12: System.out.println("La letra correspondiente es \"N\" ");break;
            case 13: System.out.println("La letra correspondiente es \"J\" ");break;
            case 14: System.out.println("La letra correspondiente es \"Z\" ");break;
            case 15: System.out.println("La letra correspondiente es \"S\" ");break;
            case 16: System.out.println("La letra correspondiente es \"Q\" ");break;
            case 17: System.out.println("La letra correspondiente es \"V\" ");break;
            case 18: System.out.println("La letra correspondiente es \"H\" ");break;
            case 19: System.out.println("La letra correspondiente es \"L");break;
            case 20: System.out.println("La letra correspondiente es \"C\" ");break;
            case 21: System.out.println("La letra correspondiente es \"K\" ");break;
            case 22: System.out.println("La letra correspondiente es \"E\" ");break;
            default: System.out.println("Numero introducido no es valido");
        }
    }
         
}

