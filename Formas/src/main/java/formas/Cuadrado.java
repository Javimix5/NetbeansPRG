package formas;

import javax.swing.JTree;

/**
 *
 * @author Javier González Prados
 */
public class Cuadrado extends Rectangulo {

    public Cuadrado(String c, double lado) {
        super(c, lado, lado);
    }

    public String toString() {
        return "Color: " + this.color + " Lado: " + JTree.ANCHOR_SELECTION_PATH_PROPERTY;
    }

}//Fin clase
