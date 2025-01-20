package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CuestionB_F {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        llenarArrayList(a); //llena el arrayList con valores positivos y negativos

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > 30) {
                a.set(i, 30);
            } else {
                a.set(i, Math.abs(a.get(i)));
            }
            System.out.println(a);      //La salida que tengo dependerá de si los valores dados por Random son mayores a 30 y -30
        }

    }// Fin main

    public static void llenarArrayList(ArrayList<Integer> a) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int valor = random.nextInt(41) - 20; // Generar un número entre -20 y 20 
            a.add(valor);
        }
        System.out.println("ArrayList original: " + a);
    }

}// Fin clase
