/*
 * Imprime los números del 100 al 120 sumando 2, 4, 6… al anterior: 100, 102, 106, 112…
 */
package jgp.bucles2;


import java.util.Scanner;

public class Bucles13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 100, num2=2;

        System.out.println("Bucle WHILE");

        while (num <= 120) {
            System.out.println(num);
            num+=num2;
            num2+=2;
        }
        System.out.println("\n");
        System.out.println("Bucle FOR");
        int num3 =0;
        for (int i = 100; i <= 120; i +=(num3+=2)) {
            
            
            System.out.println(i);
        }
    }
}
