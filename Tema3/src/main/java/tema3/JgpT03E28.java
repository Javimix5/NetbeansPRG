/*
 * Sacar por pantalla la suma, la media y el producto de los números pares comprendidos entre 
dos números enteros tecleados previamente. No sabemos si el que introduce primero es menor que 
el segundo. No incluir en los cálculos los números introducidos, solo los intermedios.
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E28 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double suma = 0,media, producto = 1;
        int num1, num2;
        int pares = 0;

        System.out.println("Introduce el primero numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = teclado.nextInt();

        if (num1 < num2) {
            for (int i = (num1 + 1); i < num2; i++) {
                if (i % 2 == 0) {
                    suma += i;
                    producto *= i;
                    pares++;
                }
            }
        } else 
            for (int i = (num2 + 1); i < num1; i++) {
                if (i % 2 == 0) {
                    suma += i;
                    producto *= i;
                    pares++;
                
            }
        }
        media = (suma / pares);
        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);
        System.out.println("La media es: " + media);
    }
}
