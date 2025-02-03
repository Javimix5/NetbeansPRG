package tema9;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class CuestionesB {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Bicho bi = new Bicho();
        BichoDormilon bd = new BichoDormilon();

        //BichoDormilon2
        BichoDormilon bd2 = new BichoDormilon(5);
        bd2.come();
        System.out.println("bd2 -> hambre: " + bd2.hambre);
        System.out.println("bd2 -> sueño: " + bd2.sueño);

        bi.come();
        bd.come();
        System.out.println("bi -> hambre: " + bi.hambre);
        System.out.println("bd -> hambre: " + bd.hambre);
        bd.aDormir();
        System.out.println("bd -> hambre: " + bd.hambre);
        System.out.println("bd -> sueño: " + bd.sueño);

        
        Bicho bi2 = new BichoDormilon(10);
        System.out.println("bi2 -> hambre: " + bi2.hambre);
        System.out.println("bi2 -> sueño: " + ((BichoDormilon) bi2).sueño);

        /*Esto es lo que se muestra en pantalla
            bd2 -> hambre: -5
            bd2 -> sue�o: 30
            bi -> hambre: 45
            bd -> hambre: 40
            bd -> hambre: 35
            bd -> sue�o: 0
            bi2 -> hambre: 10
            bi2 -> sue�o: 30
        */
        
        
    }// Fin main

}// Fin clase
