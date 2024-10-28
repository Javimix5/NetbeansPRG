/*
* Asignar Valor de una Variable a otra
* Autor: Javier González Prados
* Fecha 13-SEP-2024
 */
package tema1;

import java.util.Scanner;

public class JGPt01e09 {

    public static void main(String[] args) {
        /*Falta la línea que indica el nombre del teclado por el cual 
        *se introducen los datos
        */
        Scanner teclado = new Scanner(System.in);

        int var1, var2;

        System.out.println("Introduce el primer valor: ");
        var1 = teclado.nextInt();
        System.out.println("Introduce el segundo valor: ");
        var2 = teclado.nextInt();
        
        /*El siguiente código no cumple la función de intercambio de variables,
        *sino que solo intercambia el segundo valor
        *var1 = var2;
        *var2= var1;
        *Se le atribuye un valor temporal a la variable 1 para que la asigne 
        *a la variable 2 y al introducir la variable 2 se convierete en la primera
        */
        int temp = var1;
        
        var1 = var2;
        var2 = temp;

        /*Estas lineas de código que siguen, deberían ser var1 es igual a var2 
        *y viceversa y no como estaban planteadas: 
        *System.out.println("Ahora var1 es igual a var1"); 
        *System.out.println("Ahora var2 es igual a var2");
         */
        System.out.println("Ahora var1 es igual a var2: " +var1);
        System.out.println("Y la var2 es igual a var1: " +var2);
    }
}
