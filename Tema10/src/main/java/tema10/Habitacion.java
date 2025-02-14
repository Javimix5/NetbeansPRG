package tema10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Javier González Prados
 */
abstract class Habitacion {

    protected int numHabitacion;
    protected boolean ocupada;
    protected LocalDate fechaEntrada;

    public Habitacion(int numHabitacion, boolean ocupada, LocalDate fechaEntrada) {
        this.numHabitacion = numHabitacion;
        this.ocupada = false;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    //Funcion CheckIN
    public void checkIn() {
        if (!ocupada) {
            ocupada = true;
            fechaEntrada = LocalDate.now();
            System.out.println("La habitacion numero " + numHabitacion + " es suya");
        } else {
            System.out.println("La habitacion numero " + numHabitacion + " no esta disponible");
        }
    }

    //Funcion CheckOUT
    public double checkOut() {
        if (ocupada) {
            LocalDate fechaSalida = LocalDate.now();
            long dias = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
            System.out.println("");
            if (dias == 0) {
                dias = 1; // Mínimo un día
            }
            ocupada = false;
            double precio = calcularPrecio((int) dias, fechaSalida);
            fechaEntrada = null;
            return precio;
        } else {
            System.out.println("La habitacion " + numHabitacion + " ya esta libre.");
            return 0;
        }
    }

    //Funcion Calcular Precio
    public abstract double calcularPrecio(int dias, LocalDate fechaSalida);

    @Override
    public String toString() {
        return "Habitacion " + numHabitacion + " - " + (ocupada ? "Ocupada" : "Libre");
    }

}//Fin clase
