

package tema10;

import java.time.LocalDate;


/**
 *
 * @author Javier González Prados
 */

class HabitacionLowCost extends Habitacion {
    private static final double TARIFA = 50.0;

    public HabitacionLowCost(int numHabitacion, boolean ocupada) {
        super(numHabitacion, ocupada);
    }

    @Override
    public double calcularPrecio(long dias, LocalDate fechaSalida) {
        return dias * TARIFA;
    }

    @Override
    public String toString() {
        return super.toString() + " (LowCost)";
    }
}
