package tema10;

/**
 *
 * @author Javier González Prados
 */
class Hexagono extends PoligonoRegular {

    Hexagono(double t) {
        super(t);
    }

    @Override
    int getCantidadLados() {
        return 6;
    }

    @Override
    double area() {
        double lado = this.tamañoLado;
        double apotema = Math.sqrt((lado * lado) - ((lado / 2) * (lado / 2)));
        return lado * apotema * 3;
    }
}
