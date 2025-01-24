

package tema8;


/**
 *
 * @author Javier González Prados
 */

//Crea una nueva clase TrianColor_V6, hija de la clase Triángulo_v6 que incluye un nuevo atributo privado de tipo String llamado color

public class TrianColor_V6 extends TrianguloV6 {
        
    public String color;

    
    //Esta nueva clase tiene un constructor de 4 parámetros (alto, ancho, estilo, color), además del getter y setter de color
        
    public TrianColor_V6(String color, double ancho, double alto, String estilo) {
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
