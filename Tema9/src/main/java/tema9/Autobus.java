

package tema9;

import java.time.Duration;
import java.time.LocalDateTime;


/**
 *
 * @author Javier González Prados
 */

class Autobus extends Vehiculos {

    public int numAsientos;

    public Autobus(int numAsientos, String matricula, String tipo) {
        super(matricula, tipo);
        this.numAsientos = numAsientos;
    }

    @Override
    public double coste() {  //Calculador de coste de aparcado
        LocalDateTime horaActual = LocalDateTime.now();
        long tiempo = Duration.between(horaEntrada, horaActual).getSeconds();
        double asiento = this.numAsientos*0.25;
        return ((tiempo * 0.04)+asiento);
    }
    
}//Fin clase Autobus