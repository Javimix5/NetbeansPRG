package tema9;

import java.time.LocalDate;
import java.time.Period;
import java.util.logging.Logger;

/**
 *
 * @author Javier González Prados
 */
public class Revision extends Pacientes {

    public LocalDate ultimaVisita;
    

    public Revision(LocalDate ultimaVisita, String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.ultimaVisita = ultimaVisita;
    }

    public double facturar() {
        int edad = calcularEdad();
        return (edad > 65) ? 30 : 50; //Para que devuel true 30 false 50
    }

    private int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(getFechaNacimiento(), fechaActual);
        int edad = periodo.getYears();
        return edad;
    }

}//Fin clase
