package tema8ampliado;

/**
 *
 * @author Javier González Prados
 */
import java.util.ArrayList;

public class Garaje {

    private ArrayList<Vehiculo> vehiculos;

    public Garaje() {
        vehiculos = new ArrayList<>();
    }

    public void aparcarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void desaparcarVehiculo(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculos.remove(vehiculo);
                System.out.println("Vehiculo desaparcado con éxito");
                return;
            }
        }
        System.out.println("No se encuentra el vehiculo en el garaje");
    }

    public double getPrecioTotal() {
        double precioTotal = 0;
        for (Vehiculo vehiculo : vehiculos) {
            precioTotal += vehiculo.getPrecio();
        }
        return precioTotal;
    }

    public Vehiculo getVehiculoMasRapido() {
        Vehiculo vehiculoMasRapido = null;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculoMasRapido == null || vehiculo.getVelocidadMaxima() > vehiculoMasRapido.getVelocidadMaxima()) {
                vehiculoMasRapido = vehiculo;
            }
        }
        return vehiculoMasRapido;
    }
}
