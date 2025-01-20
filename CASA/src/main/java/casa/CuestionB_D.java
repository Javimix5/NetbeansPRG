package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CuestionB_D {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        int n = 0;
        for (int i = 0; i < 6; i++) {                   //se obtienen valores hasta la posicion 5
            do {
                n = (int) (Math.random() * 49) + 1;     //variable int se multiplica por un valor random (máximo hasta el 49) y se le suma 1
            } while (a.contains(n));                    //mientras no pase de la posición ; se añaden los valores
            a.add(n);
        }
        Collections.sort(a);                            //se ordenan los valores ascendentemente
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));

        }   //APARTADO E

        for (int i = 0; i < a.size(); i++) {
            a.set(i, a.get(i) + 1);
            System.out.println(a);                      //Muestra los valores obtenido hasta un maximo del tamaño del ArrayList sumandole uno 
                                                        //a la primera posición la primera vez, luego a la segundo, tercera, etc
        }
        
        }// Fin main

    }// Fin clase
