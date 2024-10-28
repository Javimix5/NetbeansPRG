/*
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números 
introducidos por teclado y validados como distintos, el programa debe empezar por el menor
de los enteros introducidos e ir incrementando de 7 en 7
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1,num2;

        System.out.println("Introduce el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = teclado.nextInt();

        if (num1 == num2) {
            System.out.println("Error, los numeros son iguales");
        } else { 
            if (num1 < num2){
                for (int i = num1; i <= num2; i+=7) {
                    System.out.println(i);
                }
            }else{
                for (int i = num2; i <= num1; i+=7) {
                    System.out.println(i);
                }
            }
        }
    }
}
/*
do {
            System.out.print("Introduce el primer número: ");
            num1 = teclado.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = teclado.nextInt();

            if (num1 == num2) {
                System.out.println("Error, los numeros son iguales");
            }
        } while (num1 == num2);

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);
        
        System.out.println("Números entre " + menor + " y " + mayor + " incrementando de 7 en 7:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }
*/
