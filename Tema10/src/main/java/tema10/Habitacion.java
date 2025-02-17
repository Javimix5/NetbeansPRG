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

    public Habitacion(int numHabitacion, boolean ocupada) {
        this.numHabitacion = numHabitacion;
        this.ocupada = false; // No hace falta recibir `ocupada` si siempre se inicializa a `false`
        this.fechaEntrada = null; // Asegurar que está inicializada
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    // Función CheckIN
    public void checkIn(LocalDate fechaEntrada) {
        if (!ocupada) {
            this.ocupada = true;
            this.fechaEntrada = fechaEntrada; // Asignación corregida
            System.out.println("La habitacion numero " + numHabitacion + " es suya.");
        } else {
            System.out.println("La habitacion numero " + numHabitacion + " no esta disponible.");
        }
    }

    // Función CheckOUT
    public void checkOut(LocalDate fechaSalida) {
        if (ocupada) {  
            if (fechaEntrada == null) { // Validación para evitar NullPointerException
                System.out.println("Error: No hay una fecha de entrada registrada.");
                return;
            }

            long dias = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
            ocupada = false;
            double precio = calcularPrecio(dias, fechaSalida);
            this.fechaEntrada = null; // Restablecer fechaEntrada a null

            System.out.println("La habitacion numero " + numHabitacion + " queda libre el dia " 
                                + fechaSalida + ". Total a pagar: " + precio + " euros.");
        } else {
            System.out.println("La habitacion " + numHabitacion + " ya esta libre.");
        }
    }

    // Función Calcular Precio
    public abstract double calcularPrecio(long dias, LocalDate fechaSalida);

    @Override
    public String toString() {
        return "Habitacion " + numHabitacion + " - " + (ocupada ? "Ocupada" : "Libre");
    }

} // Fin de la clase
