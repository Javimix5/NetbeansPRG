package tema10;

/**
 *
 * @author Javier González Prados
 */
public abstract class PoligonoRegular {

    double tamañoLado;

    abstract double area();

    abstract int getCantidadLados();

    double perimetro() {
        return getCantidadLados() * this.tamañoLado;
    }

    PoligonoRegular(double tl) {
        this.tamañoLado = tl;
    }
}
