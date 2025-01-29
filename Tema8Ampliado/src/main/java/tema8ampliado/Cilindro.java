

package tema8ampliado;

import javax.swing.plaf.basic.BasicBorders;


/**
 *
 * @author Javier González Prados
 */

// Subclase Cilindro
class Cilindro extends Circulo {
    private double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double area(double radio){
        double area=(radio*2);
        return area;
    }
    
    public double volumen(double radio, double altura) {        
         double volumen = (radio*2)*altura;
         return volumen;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}       