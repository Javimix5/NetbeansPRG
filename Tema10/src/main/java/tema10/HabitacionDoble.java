

package tema10;

import java.time.LocalDate;


/**
 *
 * @author Javier González Prados
 */

class HabitacionDoble extends Habitacion {
    private static final double TARIFA = 100.0;
    private static final double INCREMENTO_MESES = 1.2;

    public HabitacionDoble(int numHabitacion, boolean ocupada) {
        super(numHabitacion, ocupada);
    }

    @Override
    public double calcularPrecio(long dias, LocalDate fechaSalida) {
        double tarifaFinal = TARIFA;
        int mes = fechaSalida.getMonthValue();
        if (mes == 4 || mes == 7 || mes == 8) {
            tarifaFinal *= INCREMENTO_MESES;
        }
        return dias * tarifaFinal;
    }

    @Override
    public String toString() {
        return super.toString() + " (Doble)";
    }
}

