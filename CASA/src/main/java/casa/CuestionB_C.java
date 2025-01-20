package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CuestionB_C {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();       //ArrayList Integer
        int lon = (int) (Math.random() * 6) + 5;        //variable int que obtiene valor random (máximo hasta el 6) y se le suma 5
        for (int i = 0; i < lon; i++) {                 //Se recorre el ArrayList hasta la longitud del valor anterior
            a.add((int) (Math.random() * 100) + 1);     //A las salidas del bucle, se le multiplica un valor random (hasta 100) y sumando 1; se añaden al ArrayList
        }
        Collections.sort(a);                            //Se ordenan los valores obtenidos 
        for (int i = 0; i < a.size(); i++) {            //Se recorre el arrayList para ordenador los numeros de menor a mayor
            System.out.println(a.get(i));
        }

    }// Fin main

}// Fin clase
