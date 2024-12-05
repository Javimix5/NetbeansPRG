/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package formas;

import java.util.Scanner;

/**
 *
 * @author javier.gonzalezprado
 */
public class Rombo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n;
        
            
        System.out.println("Rombo:");
        
        System.out.println("Dime el lado del rombo:");
        n = teclado.nextInt();
        
        
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) System.out.print(" ");
            for (int j = 0; j <= i * 2; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - i; j > 1; j--) System.out.print(" ");
            for (int j = 0; j <= i * 2; j++) System.out.print("*");
            System.out.println();
        }
    }
}