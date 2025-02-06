package tema9;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Javier González Prados
 */
public class Receta extends Pacientes {

    public List<String> medicamentos;
    static final double TARIFARECETA = 5d;

    public Receta(List<String> medicamentos, String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.medicamentos = medicamentos;
    }

    public double facturar() {
        return this.medicamentos.size() * TARIFARECETA;
    }

}//Fin clase
