package tema8ampliado;

/**
 *
 * @author Javier González Prados
 */
public class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche(String marca, double precio, String matricula, int velocidadMaxima, int numeroPuertas) {
        super(marca, precio, matricula, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
