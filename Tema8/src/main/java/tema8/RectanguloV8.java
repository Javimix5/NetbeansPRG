package tema8;

/**
 *
 * @author Javier González Prados
 */
public class RectanguloV8 extends Figura2D_V8 {

        /*Crear una nueva clase hija de Figura2D_v8 llamada Rectangulo_v8 con constructor con tres
        parámetros (alto, ancho, nombre), constructor con un dos parámetros (alto igual a ancho y
        nombre) y un método que devuelve boolean llamado esCuadrado()*/
    
    private boolean esCuadrado = false;
    
    public RectanguloV8(double alto, double ancho, String nombre) {
        super(alto, ancho, nombre);
    }

    
    
}//Fin clase
