package pClasesApoyo;

import java.util.Random;

/**
 *
 * @author Javier González Prados
 */
public class DadoFalso {

    public static int lanzar(int n) {
        Random random = new Random();
        int resultado = random.nextInt(7) + 1;
        return (resultado == 7) ? n : resultado;
    }

}//Fin clase
