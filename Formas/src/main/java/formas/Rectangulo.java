package formas;

/**
 *
 * @author Javier González Prados
 */
public class Rectangulo extends Figura {

    double ancho, alto;

    Rectangulo(String c, double alto, double ancho) {
        super(c);
        this.alto = alto;
        this.ancho = ancho;
    }

    public double dameArea() {
        return alto * ancho;
    }

    public String toString() {
        return super.toString()
                + "Alto: " + alto
                + "Ancho: " + ancho;
    }

}//Fin clase
