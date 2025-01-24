package tema8;

/**
 *
 * @author Javier González Prados
 */
public class Figura2D_V7 {

    private double ancho, alto;

    public Figura2D_V7(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    //Figura2D_v7 tendrá un nuevo constructor, que recibe como parámetro otro objeto de tipo Figura2D_v7 y que copiará todos sus datos.
    public Figura2D_V7(Figura2D_V7 datos){
    super();
    }
    
    
    public Figura2D_V7() {
        this.ancho = 0;
        this.alto = 0;
    }    
        
    public Figura2D_V7(double dimension) {
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
