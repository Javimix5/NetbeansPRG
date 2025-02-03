

package tema9;


/**
 *
 * @author Javier González Prados
 */

public class TrianColor extends Triangulo {
        
    public String color;        
    
    public TrianColor(String color, int altura, int base) {
        super(altura, base);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String mostrarColor(){
    return this.color;
    }
    
    public double dameArea() {
        return (altura * base) / 2;
    }

}//Fin clase
