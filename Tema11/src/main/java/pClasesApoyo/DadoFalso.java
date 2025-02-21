package pClasesApoyo;

import java.util.Random;

/**
 *
 * @author Javier González Prados
 */
public class DadoFalso {        //si ponemos en default la clase, no se podria 
                                //ejecutar ningún método que se incluya

    public static int lanzar(int n) {
        Random random = new Random();
        int resultado = random.nextInt(1,8);
        return (resultado == 7) ? n : resultado;
    }

}//Fin clase
