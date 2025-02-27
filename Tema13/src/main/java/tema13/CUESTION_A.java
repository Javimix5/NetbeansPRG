/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema13;

import java.util.Scanner;

/**
 *
 * @Javier González Prados
 */
public class CUESTION_A {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Num 1: ");
        int num1 = teclado.nextInt();
        System.out.print("Num 2: ");
        int num2 = teclado.nextInt();
        System.out.println("div=" + num1 / num2);

        /*Si se hace una división entre 0, mostrará la siguiente excepción:
Exception in thread "main" java.lang.ArithmeticException*/
    }
}
