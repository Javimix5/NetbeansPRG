/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema13;

import java.util.Scanner;

/**
 *
 * @Javier González Prados
 */
public class CUESTION_B {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5};
        int p = -1;
        try {
            System.out.print(a[p]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("0");
        }

        /* No se cierra abruptamente; muestra 0 como de salida al compilar */
    }
}
