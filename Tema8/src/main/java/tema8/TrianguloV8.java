package tema8;

/**
 *
 * @author Javier González Prados
 */
public class TrianguloV8 extends Figura2D_V7 {

    public String estilo;

    public TrianguloV8(double ancho, double alto, String estilo) {
        this();
        setAlto(alto);
        setAncho(ancho);
        this.estilo = estilo;
    }

    public TrianguloV8(TrianguloV8 data){
    super(data.getAncho(), data.getAlto());
    this.estilo =data.estilo;
    }    
    
    public TrianguloV8(double ancho, double alto) {
        super(ancho, alto);
    }
   
    public TrianguloV8() {
        super();
        this.estilo = null;
    }
   
    public TrianguloV8(double dimension) {
        super(dimension);
    }

    public void verEstilo() {
        System.out.println("Estilo: " + estilo);
    }

    public TrianguloV8(String estilo, double ancho, double alto) {
        super(ancho, alto);
        this.estilo = estilo;
    }

    public double dameArea() {
        return (getAncho() * getAlto()) / 2;
    }

}//Fin clase
