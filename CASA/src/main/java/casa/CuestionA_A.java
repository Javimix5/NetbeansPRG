package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class CuestionA_A {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = new int[]{10, 21, 37, 40, 51};
        int p = 0, i = 0;

        for (int x = 0; x < a.length; x++) //Recorre la longitud del array a de forma ascendete
        {
            if (x % 2 == 0) {
                p += a[x];
            } else {
                i += a[x];  //si el numero es par se añade a la variable p incrementando; si no se añade a la variable i incrementando
            }
        }
        System.out.println(Arrays.toString(a)); // muestra de nuevo las variables que forman el array
        
        System.out.printf("%d-%d\n", p, i); //se muestra un mensaje haciendo una restan entre los valores resultantes de p-i pero sin resultado de operación

        int resultado = p - i;  //he añadido la variable para saber el resultado de la ooperación y que lo muestre por pantalla

        System.out.println("El resultado de la operación es: " + resultado);
        
        

        

    }// Fin main

}// Fin clase
