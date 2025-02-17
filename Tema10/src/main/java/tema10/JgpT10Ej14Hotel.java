package tema10;

/**
 *
 * @author Javier González Prados
 *
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class JgpT10Ej14Hotel {

    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Habitacion> habitacion = new ArrayList<>();

    public static void main(String[] args) {

        habitacion.add(new HabitacionDoble(1, false));
        habitacion.add(new HabitacionDoble(2, false));
        habitacion.add(new HabitacionDoble(3, false));
        habitacion.add(new HabitacionLowCost(4, false));
        habitacion.add(new HabitacionLowCost(5, false));
        habitacion.add(new HabitacionLowCost(6, false));
        habitacion.add(new HabitacionLowCost(7, false));
        habitacion.add(new HabitacionLowCost(8, false));
        habitacion.add(new HabitacionLowCost(9, false));
        habitacion.add(new HabitacionLowCost(10, false));
        habitacion.add(new HabitacionLowCost(11, false));
        habitacion.add(new HabitacionLowCost(12, false));
        habitacion.add(new HabitacionLowCost(13, false));
        habitacion.add(new HabitacionSuite(14, false));
        habitacion.add(new HabitacionSuite(15, false));
        habitacion.add(new HabitacionSuite(16, false));
        habitacion.add(new HabitacionSuite(17, false));
        habitacion.add(new HabitacionSuite(18, false));

        boolean salir = false;

        do {
            System.out.println("\n");
            System.out.println("Elija una opcion:");
            System.out.println("1 - CheckIn");
            System.out.println("2 - Check-Out");
            System.out.println("3 - Estado habitaciones");
            System.out.println("0 - Salir");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Check-In");
                    System.out.println("Diga el numero de habitacion");
                    int numHabitacion = teclado.nextInt();
                    Habitacion habitaciones = buscarHabitacion(habitacion, numHabitacion);
                    if (habitaciones != null) {
                        System.out.println("Fecha de entrada");
                        habitaciones.checkIn(LocalDate.now());
                    } else {
                        System.out.println("La habitacion " + numHabitacion + " no existe");
                    }
                    break;
                case 2:
                    System.out.println("Check-Out");
                    System.out.println("Diga el numero de habitacion");
                    numHabitacion = teclado.nextInt();
                    habitaciones = buscarHabitacion(habitacion, numHabitacion);
                    if (habitaciones != null) {
                        System.out.println("Dias estancia");
                        int ndias = teclado.nextInt();
                        habitaciones.checkOut(LocalDate.now().plusDays(ndias));
                    } else {
                        System.out.println("La habitacion " + numHabitacion + " no existe");
                    }
                    break;
                case 3:
                    System.out.println("Estado habitaciones");
                    for (Habitacion x : habitacion) {
                        System.out.println(x);
                    }
                    break;
                case 0:
                    salir = true;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (!salir);

    }//fin main

    public static Habitacion buscarHabitacion(ArrayList<Habitacion> habitaciones, int numHabitaciones) {
        for (Habitacion h : habitaciones) {
            if (h.getNumHabitacion() == numHabitaciones) {
                return h;
            }

        }
        return null;
    }

}// Fin clase
