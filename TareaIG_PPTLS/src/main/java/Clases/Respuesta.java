package Clases;

/**
 *
 * @author fernando.pargafernan
 */
public abstract class Respuesta {
    private String nombre;

    public Respuesta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Devuelve true si esta respuesta gana contra la otra
    public abstract boolean ganaA(Respuesta otra);
}
