

package tema8;


/**
 *
 * @author Javier González Prados
 */

public class Figura2D {

    public double ancho, alto;
    
    public Figura2D(double ancho, double alto){
    this.ancho=ancho;
    this.alto=alto;    
    }
    
   public void verDimension(){
       System.out.printf("Altura: %.2f",alto);
       System.out.println("");
       System.out.printf("Ancho: %.2f",ancho);
       System.out.println("");
   }
    
}//Fin clase
