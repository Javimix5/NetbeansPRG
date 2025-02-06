

package tema9;

import java.time.LocalDate;


/**
 *
 * @author Javier González Prados
 */

public class Pacientes {
    public String nombre;
    public LocalDate fechaNacimiento;

    public Pacientes(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public double facturar(){
   return 0;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}//Fin clase


