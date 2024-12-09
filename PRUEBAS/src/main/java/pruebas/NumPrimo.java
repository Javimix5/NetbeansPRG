/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class NumPrimo {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int num = leerEnteroEntre("Introduce un numero natural", 1, Integer.MAX_VALUE); //MAX_VALUE es el máximo valor que se puede representar como INT en java

        System.out.println("Seguimos con el numero " + num);
        esPrimo(num);

    }

/**
 * FUNCION PARA LEER ENTEROS (Puede ser reutilizada en cualquier programa)
 * @param mensaje Tomará el mensaje que se introducirá antes del número
 * @param min Será el número desde el que se inicia el ejercicio
 * @param max Será el número máximo de clase INT en este caso
 * @return Devolverá el numero si cumple los requisitos
 */
    static int leerEnteroEntre(String mensaje, int min, int max) {

        System.out.print(mensaje + ": ");
        int num = Integer.parseInt(teclado.nextLine());

        //Para repetir la petición de numero en caso de error
        while (num < min || num > max) {
            System.out.println("Error. " + mensaje + ": ");
            num = Integer.parseInt(teclado.nextLine());
        }
        return num;
    }

    /**
     * FUNCION NUMEROS PRIMOS (Puede ser reutilizada en cualquier programa)
     * Copiar los dos static
     * @param num 
     */
    static void esPrimo(int num) {
        if (PruebaEsPrimo(num)) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " NO es primo");
        }
    }

    static boolean PruebaEsPrimo(int num) {
        int cont = 2;
        int mitad = num / 2;
        while (cont <= mitad && !esMultiplo(num, cont)) {
            cont++;
        }
        return cont > mitad;
    }

    /**
     * FUNCION PARA NUMEROS MULTIPLOS (Puede ser reutilizada en cualquier programa)
     * Copiar ambos static
     * @param a Un número entero que será dividido por <code>b</code>
     * @param b Un número entero que dividirá <code>a</code>
     * @return true si <code>a</code> es múltiplo de <code>b</code>
     */
        static boolean esMultiplo(int a, int b) {
        return obtenerResto(a, b) == 0;
    }

    static int obtenerResto(int num1, int num2) {
        return num1 - num2 * (num1 / num2);
    }

    
    
}
