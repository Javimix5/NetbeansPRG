

package Examen2_2025;


/**
 *
 * @author Javier González Prados
 */

public class AlarmaLuminosa extends Alarma {

    private Luz luz;
    
    public AlarmaLuminosa (double umbral){
    super (umbral);
    this.luz = new Luz ();
    }
 
    @Override
    public void comprobarEstado(){
    super.comprobarEstado();
        if (super.obtenerUltimaActivacion() !=null) {
            luz.encender();
        } else {
            luz.apagar();
        }
    }
    
    
}
