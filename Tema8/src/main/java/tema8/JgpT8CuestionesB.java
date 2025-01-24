package tema8;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT8CuestionesB {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Bicho bi = new Bicho();
        BichoDormilon bd = new BichoDormilon();

        bi.come();
        bd.come();
        System.out.println("bi -> hambre: " + bi.hambre);
        System.out.println("bd -> hambre: " + bd.hambre);
        bd.aDormir();
        System.out.println("bd -> hambre: " + bd.hambre);
        System.out.println("bd -> sueño: " + bd.sueño);

        /*Esto es lo que se muestra en pantalla
          bi -> hambre: 45
          bd -> hambre: 40
          bd -> hambre: 35
          bd -> sue�o: 0*/
        
    }// Fin main

}// Fin clase
