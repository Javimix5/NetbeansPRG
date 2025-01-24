package tema8;

/**
 *
 * @author Javier González Prados
 */
public class Figura2D_V8 {

    private double ancho, alto;

    //Añadir a la clase Figura2D_v8 un atributo privado llamado nombre de tipo String   
    private String nombre;

    //Añadir getter y setter de Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //modificar los constructores de dicha clase para incorporar como parámetro el nombre de la figura (en el constructor por defecto se le asignará valor null)
    public Figura2D_V8(double ancho, double alto, String nombre) {
        this.ancho = ancho;
        this.alto = alto;
        this.nombre = null;
    }

    public Figura2D_V8(Figura2D_V8 datos) {
        super();
    }

    public Figura2D_V8() {
        this.ancho = 0;
        this.alto = 0;
    }

    public Figura2D_V8(double dimension) {
        this.ancho = dimension;
        this.alto = dimension;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void verDimension() {
        System.out.printf("Altura: %.2f", alto);
        System.out.println("");
        System.out.printf("Ancho: %.2f", ancho);
        System.out.println("");
    }

}//Fin clase
