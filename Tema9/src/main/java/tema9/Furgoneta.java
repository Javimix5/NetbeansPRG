

package tema9;

import java.time.Duration;
import java.time.LocalDateTime;


/**
 *
 * @author Javier González Prados
 */

class Furgoneta extends Vehiculos {

    public double longitud;

    public Furgoneta(double longitud, String matricula, String tipo) {
        super(matricula, tipo);
        this.longitud = longitud;
    }
    
    @Override
    public double coste() {  //Calculador de coste de aparcado
        LocalDateTime horaActual = LocalDateTime.now();
        long tiempo = Duration.between(horaEntrada, horaActual).getSeconds();
        double largo = this.longitud*0.2;
        return ((tiempo * 0.04)+largo);
    }

}//Fin clase Furgoneta