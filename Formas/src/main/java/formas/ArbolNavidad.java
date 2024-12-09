/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package formas;

import java.util.Scanner;

/**
 *
 * @author javier.gonzalezprado
 */
public class ArbolNavidad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
    
        int n;

         System.out.println("Árbol de Navidad:");
         
         System.out.println("Dime el tamaño de altura del arbol: ");
         n = teclado.nextInt();
        
         
        //copa
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) System.out.print(" ");
            for (int j = 0; j <= i * 2; j++) System.out.print("*");
            System.out.println();
        }
        //tronco
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
        }
            System.out.println("| |");
        }
    }
}