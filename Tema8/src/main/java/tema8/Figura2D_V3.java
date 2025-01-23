package tema8;

/**
 *
 * @author Javier González Prados
 */
public class Figura2D_V3 {

    private double ancho, alto;

    public Figura2D_V3(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Figura2D_V3(){}
    
    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void verDimension() {
        System.out.printf("Altura: %.2f", alto);
        System.out.println("");
        System.out.printf("Ancho: %.2f", ancho);
        System.out.println("");
    }

}//Fin clase
