package tema8;

/**
 *
 * @author Javier González Prados
 */
public class TrianguloV4 extends Figura2D_V4 {

    public String estilo;

    public TrianguloV4(double ancho, double alto, String estilo) {
        this();
        setAlto(alto);
        setAncho(ancho);
        this.estilo = estilo;
    }
//AÑADIDA ESTA LINEA
    public TrianguloV4 (double ancho, double alto){
        super(ancho,alto);
    }
    
    public TrianguloV4() {
        super();
    }
  

    public void verEstilo() {
        System.out.println("Estilo: " + estilo);
    }

    public TrianguloV4(String estilo, double ancho, double alto) {
        super(ancho, alto);
        this.estilo = estilo;
    }

    public double dameArea() {
        return (getAncho() * getAlto()) / 2;
    }

}//Fin clase
