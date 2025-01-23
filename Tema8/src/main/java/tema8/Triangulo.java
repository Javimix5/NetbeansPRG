package tema8;

/**
 *
 * @author Javier González Prados
 */
public class Triangulo extends Figura2D {

    public String estilo;

    public Triangulo (double ancho, double alto, String estilo){ 
        
        super(ancho, alto);
        this.estilo = estilo;
    }

    public void verEstilo() {
        System.out.println("Estilo: "+estilo);
    }

    public double dameArea() {
        return (ancho * alto) / 2;
    }

}//Fin clase
