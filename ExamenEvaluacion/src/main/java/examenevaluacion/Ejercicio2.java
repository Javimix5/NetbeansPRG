
package examenevaluacion;

import java.util.Scanner;

/**Cálculo de la distancia total entre los mínimos de dos cadenas numéricas:
A partir de dos cadenas de caracteres numéricos con la misma longitud, donde cada carácter representa un dígito del 0 al 9. Se requiere construir un programa que realice el siguiente proceso iterativo hasta que ambas cadenas están vacías:

    1. Encuentra el número más pequeño en la primera cadena.
    2. Encuentra el número más pequeño en la segunda cadena.
    3. Calcula la distancia absoluta entre ambos números.
    4. Suma esta distancia a una variable acumuladora.
    5. Elimina los números seleccionados de sus respectivas cadenas.
    6. Repite los pasos anteriores con los números restantes de las cadenas.
       
El programa debe imprimir los siguientes resultados para cada iteración:
    • El menor número seleccionado de la primera cadena.
    • El menor número seleccionado de la segunda cadena.
    • La distancia calculada entre ambos números.
      
Al finalizar, debe mostrar la distancia total acumulada.
Requisitos:
    • Las cadenas a procesar estarán almacenada en una variable del programa y no se pedirán al usuario.
    • Debes construir una función que calcule y devuelva el mínimo de una cadena recibida por parámetro y usar la función eliminarCaracter, que elimina la primera ocurrencia de un carácter en una cadena.

	private static String eliminarCaracter(String cadena, char caracter) {
    		int indice = cadena.indexOf(caracter);
    		if (indice == -1) {
        		return cadena;     		}
    			return cadena.substring(0, indice) + cadena.substring(indice + 1);
	}
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

