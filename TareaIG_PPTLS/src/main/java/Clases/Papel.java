
package Clases;

/**
 *
 * @author fernando.pargafernan
 */

public class Papel extends Respuesta {
    public Papel() {
        super("Papel");
    }

    @Override
    public boolean ganaA(Respuesta otra) {
        return otra instanceof Piedra || otra instanceof Spock;
    }
}