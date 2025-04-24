package Clases;

/**
 *
 * @author fernando.pargafernan
 */
public class Piedra extends Respuesta {
    public Piedra() {
        super("Piedra");
    }

    @Override
    public boolean ganaA(Respuesta otra) {
        return otra instanceof Tijera || otra instanceof Lagarto;
    }
}


