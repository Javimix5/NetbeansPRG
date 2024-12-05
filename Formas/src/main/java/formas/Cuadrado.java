/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package formas;

import java.util.Scanner;

/**
 *
 * @author javier.gonzalezprado
 */
public class Cuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n;
        
            
        System.out.println("Cuadrado:");
        
        System.out.println("Introduce el lado del cuadrado:");
        n = teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                System.out.println("*".repeat(n));
            } else {
                System.out.print("*");
                System.out.print(" ".repeat(n - 2));
                System.out.println("*");
            }
        }
    }
}
