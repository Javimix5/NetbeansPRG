

package tema10;

import java.time.LocalDate;


/**
 *
 * @author Javier González Prados
 */

class HabitacionSuite extends Habitacion {
    private static final double TARIFA = 200.0;
    private static final double DESCUENTO = 0.8;

    public HabitacionSuite(int numHabitacion, boolean ocupada, LocalDate fechaCheckIn) {
        super(numHabitacion, ocupada, fechaCheckIn);
    }

    @Override
    public double calcularPrecio(int dias, LocalDate fechaSalida) {
        double tarifaFinal = TARIFA;
        if (dias >= 10) {
            tarifaFinal *= DESCUENTO;
        }
        return dias * tarifaFinal;
    }

    @Override
    public String toString() {
        return super.toString() + " (Suite)";
    }
}
