package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CuestionB_A {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            a.add((int) Math.pow(2, i + 1));
        }
        System.out.println(a); //Faltaria la linea de salida por pantalla
        
        //Resultado= [2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]
        
        for (int i=0;i<a.size();i+=2) //Se necesita modificar el arrayList a Integer y las variables de Long a Int
        a.set(i,999);
        
        System.out.println(a); //Resultado= [999, 4, 999, 16, 999, 64, 999, 256, 999, 1024]

    }// Fin main

}// Fin clase
