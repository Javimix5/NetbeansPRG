package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class CuestionA_E {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        boolean result = true;
        
        if (args.length != 2) {
            result = false; //si la longitud del array es distinta de 2, mostraría false
            
        } else if (!args[0].equals(args[1])) {  
            result = false; //si siendo distinta que la posicion 0 sea igual a la 1, mostraria false
            
        } else {
            int up = 0, low = 0; //siendo las variables up y low =0
            
            for (int i = 0; i < args[0].length(); i++) {    //recorremos el array desde 0 de forma ascendente
                
                if (Character.isUpperCase(args[0].charAt(i))) { //si el caracter es Mayuscula se incrementa up+1
                    up++;
                    
                } else if (Character.isLowerCase(args[0].charAt(i))) {  //si el caracter es minuscula se incrementa low+1
                    low++;
                }
            }
            if (low <= 1 || up <= 1) {
                result = false; //si low es menor o igual a 1 o up es menor o igual a 1, mostraria false
            }
        }
        System.out.println(result);  //muestra el resultado

    }// Fin main

}// Fin clase
