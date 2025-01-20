package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CuestionB_J {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            x.add((int) (Math.random() * 100));     //Añade 5 numeros aleatorios entre el 0 y el 99
        }
        Collections.sort(x);                        //Se ordena y se hacen varias funciones
        fun(x, 20);                                 //Añade 20 en la posicion x
        fun(x, 200);                                //Añade 200 al final de la lista ya que los valores obtenido en x son todos menores
        fun(x, -1);                                 //Añade -1 al inicio de la lista ya que todos los valores agregados son mayores a 0
        
        System.out.println(x);
    
    }// Fin main

    static void fun(ArrayList<Integer> a, int n) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > n) {
                a.add(i, n);
                return;
            }
        }
        a.add(n);
    }

}// Fin clase
