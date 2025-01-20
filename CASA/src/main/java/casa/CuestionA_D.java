package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class CuestionA_D {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(fun(arr)));  //el codigo sin corregir muestra el resultado=[10, 20, 20, 30, 30, 40, 40, 50, 50, 60]
    }

    static int[] fun(int[] x) {
        int[] y = new int[x.length * 2];
        int cont = 0;
        for (int z : x) {
            y[cont++] = z;
            y[cont++] = z + 10;
        }
        return y;

    }// Fin main

}// Fin clase
