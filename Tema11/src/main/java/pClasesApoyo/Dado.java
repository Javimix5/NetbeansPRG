package pClasesApoyo;

import java.util.Random;

/**
 *
 * @author Javier González Prados
 */
public class Dado {

    public static int lanzar() {

        Random random = new Random();
        return random.nextInt(6) + 1;

    }

}//Fin clase
