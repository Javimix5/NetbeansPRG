package tema8;

/**
 *
 * @author Javier González Prados
 */
public class TrianguloV7 extends Figura2D_V7 {

    public String estilo;

    public TrianguloV7(double ancho, double alto, String estilo) {
        this();
        setAlto(alto);
        setAncho(ancho);
        this.estilo = estilo;
    }

    //Hacer otro constructor análogo para la clase Triangulo_v7
    public TrianguloV7(TrianguloV7 data){
    super(data.getAncho(), data.getAlto());
    this.estilo =data.estilo;
    }
    
    
    public TrianguloV7(double ancho, double alto) {
        super(ancho, alto);
    }
   
    public TrianguloV7() {
        super();
        this.estilo = null;
    }
   
    public TrianguloV7(double dimension) {
        super(dimension);
    }

    public void verEstilo() {
        System.out.println("Estilo: " + estilo);
    }

    public TrianguloV7(String estilo, double ancho, double alto) {
        super(ancho, alto);
        this.estilo = estilo;
    }

    public double dameArea() {
        return (getAncho() * getAlto()) / 2;
    }

}//Fin clase
