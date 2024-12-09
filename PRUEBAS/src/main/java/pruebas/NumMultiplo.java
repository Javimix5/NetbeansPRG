/*
 * NUMEROS MULTIPLOS
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class NumMultiplo {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = leerEnteroEntre("Introduce el primer numero entero", 1, Integer.MAX_VALUE); //MAX_VALUE es el máximo valor que se puede representar como INT en java
        int num2 = leerEnteroEntre("Introduce el segundo numero entero", 1, Integer.MAX_VALUE);

        int resto = obtenerResto(num1, num2);
        System.out.println("El resto entre " + num1 + " y " + num2 + " es " + resto);

        if (esMultiplo(num1, num2)) {
            System.out.println(num1 + " es multiplo de " + num2);
        }

    }
    
//FUNCION PARA LEER ENTEROS (Puede ser reutilizada en cualquier programa)

    static int leerEnteroEntre(String mensaje, int min, int max) {
        System.out.print(mensaje + ": ");
        int x = Integer.parseInt(teclado.nextLine());
        //Para repetir la petición de numero en caso de error
        while (x < min || x > max) {
            System.out.println("Error. " + mensaje + ": ");
            x = Integer.parseInt(teclado.nextLine());
        }
        return x;
    }

//FUNCION PARA NUMEROS MULTIPLOS (Puede ser reutilizada en cualquier programa)
//Copiar los dos static    
    
    static boolean esMultiplo(int a, int b) {
        return obtenerResto(a, b) == 0;
    }
    static int obtenerResto(int num1, int num2) {
        return num1 - num2 * (num1 / num2);
    }

    
}
