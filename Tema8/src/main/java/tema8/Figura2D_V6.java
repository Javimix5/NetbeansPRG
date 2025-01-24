package tema8;

/**
 *
 * @author Javier González Prados
 */
public class Figura2D_V6 {

    private double ancho, alto;

    public Figura2D_V6(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    //Hacer el constructor sin parámetros (ya no se crea por defecto) en este caso tanto alto como ancho igual a cero
    public Figura2D_V6() {
        this.ancho = 0;
        this.alto = 0;
    }

    //Añade un constructor más a la clase Figura2D, a este se le pasa solo un parámetro que se le asigna tanto al alto como al ancho (figura igual alto que ancho)
    public Figura2D_V6(double dimension) {
        this.ancho = dimension;
        this.alto = dimension;
    }

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
