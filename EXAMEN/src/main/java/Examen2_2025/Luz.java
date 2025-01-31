

package Examen2_2025;


/**
 *
 * @author Javier González Prados
 */

public class Luz {

    private boolean encendida;

    public Luz(){
    this.encendida=false;
    }
    
    public void encender(){
    encendida = true;
        System.out.println("Luz encedendida");
    }
    
    public void apagar(){
    encendida = false;
        System.out.println("Luz apagada");
    }
    
    public boolean estaEncendida(){
    return encendida;
    }
}
