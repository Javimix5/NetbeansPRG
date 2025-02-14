package tema10;

/**
 *
 * @author Javier González Prados
 */
class Pentagono extends PoligonoRegular {

    Pentagono(double t) {
        super(t);
    }

    @Override
    int getCantidadLados() {
        return 5;
    }

    @Override
    double area() {
        return 1.72048d * Math.pow(this.tamañoLado, 2);
    }
}
