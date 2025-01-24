

package tema8;


/**
 *
 * @author Javier González Prados
 */

public class TrianColor_V8 extends TrianguloV6 {
        
    public String color;
    
    //Modificar las clase hija (Triangulo_v8) y nieta (Triancolor_v8) para incluir el nombre en constructores
    
    public TrianColor_V8(String color, double ancho, double alto, String estilo) {
        super(ancho, alto, estilo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    

}//Fin clase
