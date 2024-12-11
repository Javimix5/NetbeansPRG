
package examenevaluacion;

import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */
public class Ejercicio2 {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        String cadena1 = "531";
        String cadena2 = "894";
        
        int distanciaTotal =0;
        
        System.out.println("Cadena 1= " + cadena1);
        System.out.println("Cadena 2= " + cadena2);
        System.out.println("-----------");
        
        
        char menorCadena1 = encontrarMin(cadena1);
        char menorCadena2 = encontrarMin(cadena2);
        
while (!cadena1.isEmpty() && !cadena2.isEmpty()) {            
            menorCadena1 = encontrarMin(cadena1);
            menorCadena2 = encontrarMin(cadena2);        

        int distancia = Math.abs(Character.getNumericValue(menorCadena1) - Character.getNumericValue(menorCadena2));
        
        distanciaTotal += distancia;
                
        
        
        System.out.println("Menor en cadena 1: " + menorCadena1);
        System.out.println("Menor en cadena 2: " + menorCadena2);
        
        System.out.println("La distancia acumulada es: " + distancia);
            System.out.println("---------------------");
        
        cadena1 = eliminarCaracter(cadena1,menorCadena1);
        cadena2 = eliminarCaracter(cadena2, menorCadena2);
        }
        
       
       
    System.out.println("La distancia total acumulada es: " + distanciaTotal);
}

    private static char encontrarMin (String cadena){
        char minimo = cadena.charAt(0);
        for (int i = 1; i < cadena.length(); i++) {
            if(cadena.charAt(i)<minimo){
                minimo = cadena.charAt(i);
            }
        }
        return minimo;

}
 
    
    private static String eliminarCaracter (String cadena, char caracter){
        int indice = cadena.indexOf(caracter); //Devolve el índice de la primera o de la última aparición de el elemento introducido. Se no está, devolve -1.

        if (indice == -1) {
            return cadena;
        }
        return cadena.substring(0, indice) + cadena.substring(indice +1);
    }
}

