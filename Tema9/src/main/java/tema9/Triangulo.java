package tema9;

/**
 *
 * @author Javier González Prados
 */
public class Triangulo extends Figura {

    public Triangulo(int altura, int base) {
        super(base, altura);
    }

    public double dameArea() {
        return (altura * base) / 2;
    }

}//Fin clase
