package formas;

/**
 *
 * @author Javier González Prados
 */
public class Triangulo extends Figura {

    double base;
    double altura;

    public Triangulo(String c, double b, double a) {
        super(c);
        this.base = b;
        this.altura = a;
    }

    public String toString() {
        return super.toString()
                + "\nBase: " + base
                + "\nAltura: " + altura
                + "\nArea: " + this.dameArea();
    }

    public double dameArea() {
        return base * altura / 2;
    }

}//Fin clase
