

package tema9;


/**
 *
 * @author Javier González Prados
 */

public class Rectangulo extends Figura {
       
        public Rectangulo(int altura, int base) {
        super(base, altura);
    }
    
    
    public boolean esCuadrada() {
        return (base==altura);
    }

    public double dameArea() {
        return altura * base;
    }
    
}//Fin clase
