/*
Ejercicio 16- Realizar un programa al que se le vayan introduciendo por teclado números enteros. El 
programa dispone de dos ArrayList, uno llamado positivos y otro negativos. Se trata de meter 
los números introducidos en uno u otro según su signo hasta que finalice el programa (esto ocurrirá 
cuando se introduzca cero). Al finalizar, mostrará la media aritmética de cada ArrayList
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class JgpT07Ej16MediaArrayList {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        ArrayList <Integer> positivos = new ArrayList<Integer>();
        ArrayList <Integer> negativos = new ArrayList<Integer>();
        
        System.out.println("Introduce un numero (0 para salir)");
        int num = teclado.nextInt();
        
        while (num!=0) {
            if (num>0) {    //si es mayor a 0 lo añade a positivos
                positivos.add(num);
            } else {        //si es menor lo añade a negativos
                negativos.add(num);
            }
            System.out.println("Introduce un numero (0 para salir)");
            num=teclado.nextInt();
        }
        System.out.println(positivos);      
        System.out.println(negativos);
        int sumaPositivos=0;
        int sumaNegativos=0;
        
        if (!positivos.isEmpty()) {
            double mediaPositivos =mediaArray(positivos);
            System.out.println("La media del ArrayList de Positivos es: " + mediaPositivos);
        }else{
            System.out.println("No existen numeros Positivos");
        }
        
        if (!negativos.isEmpty()) {
            double mediaNegativos =mediaArray(negativos);
            System.out.println("La media del ArrayList de Negativos es: " + mediaNegativos);
        }else{
            System.out.println("No existen numeros Negativos");
        }
                
        
    }//fin main
   
    public static double mediaArray (ArrayList<Integer> array){
    int suma =0;
        for (int num : array) {
            suma+=num;
        }
        return (double) suma/array.size();
    }
    
}// Fin clase
