package tema8;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT8CuestionesC {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Bicho bi = new Bicho();
        BichoDormilon bd = new BichoDormilon();
        
        //BichoDormilon2
        BichoDormilon bd2 = new BichoDormilon(5);
        /*Daria error ya que deberia de estar vacio, debido a que es una función a la que no hay que añadir valores
        bd2.come(10);
        */
        System.out.println("bd2 -> hambre: " + bd2.hambre);

        bi.come();
        bd.come();
        System.out.println("bi -> hambre: " + bi.hambre);
        System.out.println("bd -> hambre: " + bd.hambre);
        bd.aDormir();
        System.out.println("bd -> hambre: " + bd.hambre);
        System.out.println("bd -> sueño: " + bd.sueño);
        
        
        /*Esto es lo que se muestra en pantalla
          bd2 -> hambre: 5
          bi -> hambre: 45
          bd -> hambre: 40
          bd -> hambre: 35
          bd -> sue�o: 0
        
        Si eliminamos el valor de bd2.come(); se mostraría lo siguiente:
          bd2 -> hambre: -5
          bi -> hambre: 45
          bd -> hambre: 40
          bd -> hambre: 35
          bd -> sue�o: 0      
        */
        
        
    }// Fin main

}// Fin clase
