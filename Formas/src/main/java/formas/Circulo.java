package formas;

/**
 *
 * @author Javier González Prados
 */
public class Circulo extends Figura {

    double radio;

    public Circulo(String c, double radio) {
        super(c);
        this.radio = radio;
    }

    public double dameArea() {
        return Math.PI * radio * radio;
    }

    public String toString() {
        return super.toString() + "\nRadio: " + radio;
    }
}//Fin clase
