package tema8ampliado;

/**
 *
 * @author Javier González Prados
 */
public class Punto2D {

    private float x;
    private float y;

    // Constructor por defecto
    public Punto2D() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con parámetros
    public Punto2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Métodos get
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Métodos set
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Método SetXY
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
