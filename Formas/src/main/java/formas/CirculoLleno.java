/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package formas;

/**
 *
 * @author javier.gonzalezprado
 */
public class CirculoLleno {
    public static void main(String[] args) {
        int radio = 5;

        for (int y = -radio; y <= radio; y++) {
            for (int x = -radio; x <= radio; x++) {
                if (x * x + y * y <= radio * radio) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}