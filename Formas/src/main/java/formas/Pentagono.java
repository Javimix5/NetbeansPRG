/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package formas;

import java.util.Scanner;

/**
 *
 * @author javier.gonzalezprado
 */
public class Pentagono {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n;
        
            
        System.out.println("Pentágono:");
        
        System.out.println("Dime el lado del pentagono:");
        n = teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
        
            for (int j = n - i; j > 1; j--) System.out.print(" ");
            for (int j = 0; j <= i * 2; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) System.out.print(" ");
            System.out.println("*".repeat(n * 2 - 1));
        }
    }
}