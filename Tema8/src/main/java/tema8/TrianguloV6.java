package tema8;

/**
 *
 * @author Javier González Prados
 */
public class TrianguloV6 extends Figura2D_V5 {

    public String estilo;

    public TrianguloV6(double ancho, double alto, String estilo) {
        this();
        setAlto(alto);
        setAncho(ancho);
        this.estilo = estilo;
    }
//AÑADIDA ESTA LINEA

    public TrianguloV6(double ancho, double alto) {
        super(ancho, alto);
    }

    //Añade a la clase Triangulo también un constructor sin parámetros, que invoque alconstructor sin parámetros de la clase base (aunque se hace por defecto) y que ponga el estilo a null
    public TrianguloV6() {
        super();
        this.estilo = null;
    }

    //Añade otro constructor a la clase Triangulo, con un solo parámetro, para aquellos que tienen igual alto que ancho (en este caso el estilo será ‘igualBaseAltura’)
    public TrianguloV6(double dimension) {
        super(dimension);
    }

    public void verEstilo() {
        System.out.println("Estilo: " + estilo);
    }

    public TrianguloV6(String estilo, double ancho, double alto) {
        super(ancho, alto);
        this.estilo = estilo;
    }

    public double dameArea() {
        return (getAncho() * getAlto()) / 2;
    }

}//Fin clase
