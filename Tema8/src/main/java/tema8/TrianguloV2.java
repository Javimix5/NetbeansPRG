package tema8;

/**
 *
 * @author Javier González Prados
 */
public class TrianguloV2 extends Figura2D_V2 {

    public String estilo;

    public TrianguloV2(double ancho, double alto, String estilo) {

        super(ancho, alto);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void verEstilo() {
        System.out.println("Estilo: " + estilo);
    }

    public double dameArea() {
        return (getAncho() * getAlto()) / 2;
    }

}//Fin clase
