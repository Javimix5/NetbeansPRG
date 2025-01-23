package tema8;

/**
 *
 * @author Javier González Prados
 */
public class TrianguloV3 extends Figura2D_V3 {

    public String estilo;

    public TrianguloV3(double ancho, double alto, String estilo) {
        this();
        setAlto(alto);
        setAncho(ancho);
        this.estilo = estilo;
    }

    public TrianguloV3() {
        super();
    }
  

    public void verEstilo() {
        System.out.println("Estilo: " + estilo);
    }

    public TrianguloV3(String estilo, double ancho, double alto) {
        super(ancho, alto);
        this.estilo = estilo;
    }

    public double dameArea() {
        return (getAncho() * getAlto()) / 2;
    }

}//Fin clase
