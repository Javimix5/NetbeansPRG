package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class CuestionA_C {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30, 40, 50};  //sobraria el 5 dentro de los []
        for (int i = arr.length - 1; i > 0; i--) { //sobran los () y i= +1 no serviría yq que quedaría fuera del indice
            arr[i] = arr[i - 1]; //el arr[i] = arr[i+1] no se llegaria a ejecutar, deberia de ser arr[i] = arr[i - 1]; porque el resultado quedaría fuera del indice
        }
        arr[0] = 0; //le asignamos el valor 0 a la primera posición
        System.out.println(Arrays.toString(arr)); //el resultado en este caso es desplazar todos los valores a la derecha una posición

    }// Fin main

}// Fin clase
