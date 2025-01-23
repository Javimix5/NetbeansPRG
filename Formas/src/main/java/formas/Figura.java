package formas;

/**
 *
 * @author Javier González Prados
 */
public class Figura {

    String color;

    public Figura(String c) {
        color = c;
    }

    public String dameColor() {
        return color;
    }

    public String toString() {
        return "Color: " + this.color;
    }

    public void imprimir() {
        System.out.println(this);
    }

    public double dameArea() {
        return 0;
    }
}//Fin clase
