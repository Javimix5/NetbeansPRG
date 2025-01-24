package tema8;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT8CuestionesA {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Bicho bi = new Bicho();
        BichoDormilon bd = new BichoDormilon();

        System.out.println("bi -> hambre: " + bi.hambre);
        System.out.println("bd -> hambre: " + bd.hambre);
        System.out.println("bd -> sueño: " + bd.sueño);
        //System.out.println("bd -> peso: " + bd.peso);
            
            /*Esto es lo que se muestra en pantalla
              bi -> hambre: 50
              bd -> hambre: 50
              bd -> sue�o: 100
              La linea de bd.peso es privada por lo que no obtiene datos
              salvo que generes el getPeso*/

    }// Fin main

}// Fin clase
