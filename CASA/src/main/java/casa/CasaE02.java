/*
 * Condicional Multiple de la misma variable (usando SWITCH en 
 * lugar de varios IF)
 * Autor: Javier González Prados
 */

package casa;
import java.util.Scanner;

public class CasaE02 {
       
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int mes;
        
        System.out.println("Introduce un mes");
        mes = teclado.nextInt();
        
        switch (mes){
            case 1: System.out.println("31"); break;            
            case 2: System.out.println("28"); break;
            case 3: System.out.println("31"); break;
            case 4: System.out.println("30"); break;
            case 5: System.out.println("31"); break;
            case 6: System.out.println("30"); break;
            case 7: System.out.println("31"); break;
            case 8: System.out.println("31"); break;
            case 9: System.out.println("30"); break;
            case 10: System.out.println("31"); break;
            case 11: System.out.println("30"); break;
            case 12: System.out.println("31"); break;
            default: System.out.println("Mes incorrecto");
            
            /* Esta estructura también funcionaría ya que el break lo haría 
             * despues de hayar el número correspondiente y el break más cercano
            case 1:            
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12: System.out.println("31"); break;
            case 2: System.out.println("28"); break;
            case 4: 
            case 6: 
            case 8: 
            case 11: System.out.println("30"); break;
            default: System.out.println("Mes incorrecto");
            */          
        }
    }
}
