package tema9;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Javier González Prados
 */
public class Vehiculos {

    public String matricula;
    public String tipo;
    public LocalDateTime horaEntrada;

    public Vehiculos(String matricula, String tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.horaEntrada = LocalDateTime.now();
    }

    public double coste() {  //Calculador de coste de aparcado
        LocalDateTime horaActual = LocalDateTime.now();
        long tiempo = Duration.between(horaEntrada, horaActual).getSeconds();
        return tiempo * 0.04;
    }

}//Fin clase Vehiculos





