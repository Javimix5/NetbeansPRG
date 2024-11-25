/*
 * Comprueba el funcionamiento del siguiente programa que simula el comportamiento de un
ordenador. Intenta entender el código. Responde a las preguntas del final.
 */

package tema6amplia;

/**
 *
 * @author javier.gonzalezprado
 */
public class TestOrdenador {

    public static void main(String[] args)
 {
 Ordenador miOrdenador = new Ordenador();
  
        // Establecer valores iniciales
        miOrdenador.establecerMarca("Toshiba");
        miOrdenador.setProcesador("Intel Core i7");
        miOrdenador.setPeso(2.5f);

        // Encender y comprobar el estado
        miOrdenador.encenderOrdenador();
        miOrdenador.comprobarEstado();

        // Desactivar y activar la pantalla
        miOrdenador.desactivarPantalla();
        miOrdenador.activarPantalla();
        miOrdenador.comprobarEstado();

        // Apagar el ordenador
        miOrdenador.apagarOrdenador();
        miOrdenador.comprobarEstado();
 }
}

