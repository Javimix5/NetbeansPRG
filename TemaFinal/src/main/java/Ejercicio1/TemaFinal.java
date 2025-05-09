package Ejercicio1;

/**
 * Clase Main para ejecutar el ejercicio
 *
 * @author Javier González Prados
 */
public class TemaFinal {

    public static void main(String[] args) {

        // Crear un coche eléctrico
        CocheElectrico coche = new CocheElectrico("Bumblebee", 800);
        coche.mostrarInfo();
        coche.conducir();
        coche.cargar();
        coche.estadoCarga();
        System.out.println("-----------------------------------------------");
        System.out.println(" ");
        
        // Crear un camión a motor
        CamionAMotor camion = new CamionAMotor("Optimus Prime", 5000);
        camion.mostrarInfo();
        camion.descargar();
        camion.repostar();
        System.out.println("-----------------------------------------------");
        System.out.println(" ");

        // Listado de vehiculos creados
        System.out.println("Total vehiculos: " + Vehiculo.getContadorVehiculos());
        CocheElectrico.getContadorVehiculos(); // lista los coches eléctricos
        CamionAMotor.getContadorVehiculos(); // lista los camiones a motor
        System.out.println("-----------------------------------------------");
        System.out.println(" ");

        // Polimorfismo
        Vehiculo[] flota = {coche, camion};
        for (Vehiculo transformers : flota) {
            transformers.mostrarInfo();
        }
        System.out.println(" ");

    }
}
