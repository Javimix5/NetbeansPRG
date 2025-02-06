package tema9;

import java.time.LocalDate;

/**
 *
 * @author Javier González Prados
 */
public class Consulta extends Pacientes {

    public String motivo;
    static final double TARIFA = 100d;

    public Consulta(String motivo, String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.motivo = motivo;
    }
    
    public double facturar() { //para que tome el valor de la tarifa en 100
        return TARIFA;
    }
}//Fin clase
