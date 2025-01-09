/*
Ejercicio 2 - Dado un array de enteros, encuentra el valor máximo dentro del array.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT7e02 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
      
    int max =0;    
    
        System.out.println("Introduce la cantidad de valores deseados");
        int tamaño = teclado.nextInt();
            
    int [] lista = new int [tamaño];
    
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el valor para: " + i);
            lista[i] = teclado.nextInt();
            
        }  
        System.out.println("El valor maximo es: " + Maximo(lista));
        
    }// Fin main
    
    //Funcion encontrar máximo
    
    public static int Maximo(int [] array){
    
    int max = Integer.MIN_VALUE;
    
        for (int i : array) {
            if (i > max);
            max =i;
        }
        return max;
    }
    

}// Fin clase
