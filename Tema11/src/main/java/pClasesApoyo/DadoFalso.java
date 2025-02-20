package pClasesApoyo;

import java.util.Random;

/**
 *
 * @author Javier González Prados
 */
public class DadoFalso {

    public int lanzar(int n) {
        Random random = new Random();
        int resultado = random.nextInt(6) + 1;
        if (n == resultado) {
            if (random.nextBoolean()) {
                return n;
            }
        }
        return resultado;
    }

}//Fin clase
