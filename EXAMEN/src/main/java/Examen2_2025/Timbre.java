

package Examen2_2025;


/**
 *
 * @author Javier González Prados
 */

public class Timbre {
    
   private boolean encendida=true;
    
public Timbre(){
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


