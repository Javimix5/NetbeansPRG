package tema8ampliado;

/**
 *
 * @author Javier González Prados
 */
public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(String marca, double precio, String matricula, int velocidadMaxima, boolean tieneSidecar) {
        super(marca, precio, matricula, velocidadMaxima);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
}
