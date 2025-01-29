

package tema8ampliado;


/**
 *
 * @author Javier González Prados
 */

public class Punto3D extends Punto2D {
    private float z;

    // Constructor con tres parámetros
    public Punto3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    // Métodos get
    public float getZ() {
        return z;
    }

    // Método set
    public void setZ(float z) {
        this.z = z;
    }

    // Método SetXYZ
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
}