package tema8;

/**
 *
 * @author Javier González Prados
 */
public class TrianguloV8 extends Figura2D_V8 {

    public String estilo;

    //Modificar las clase hija (Triangulo_v8) y nieta (Triancolor_v8) para incluir el nombre en constructores
    
    
    public TrianguloV8(double ancho, double alto,String nombre, String estilo) {
        this();
        setAlto(alto);
        setAncho(ancho);
        setNombre(nombre);
        this.estilo = estilo;
    }

    
    public TrianguloV8(TrianguloV8 data){
    super(data.getAncho(), data.getAlto(), data.getNombre());
    this.estilo =data.estilo;
    }
    
    
    public TrianguloV8(double ancho, double alto, String nombre) {
        super(ancho, alto, nombre);
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

    public TrianguloV8(String estilo, double ancho, double alto, String nombre) {
        super(ancho, alto, nombre);
        this.estilo = estilo;
    }

    public double dameArea() {
        return (getAncho() * getAlto()) / 2;
    }

}//Fin clase
