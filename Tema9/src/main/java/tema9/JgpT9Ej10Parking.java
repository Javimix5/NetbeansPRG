package tema9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JgpT9Ej10Parking {

    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Vehiculos> Vehiculos;
    static double facturado;
    static int plazas = 100;

    public static void main(String[] args) {

        boolean salir = false;
        int opcion;
        Vehiculos = new ArrayList<>();
        facturado = 0;

        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1 -> entrada();
                case 2 -> desaparcarVehiculo();
                case 3 -> estadoParking();
                case 0 -> salir = true;
                default -> System.out.println("Opcion incorrecta");
            }
        } while (!salir);

    }

    // Función para mostrar el menú
    static int pintarMenu() {
        System.out.println("\n");
        System.out.println("Elija una opcion:");
        System.out.println("1 - Entrada de Vehiculo");
        System.out.println("2 - Salida de Vehiculo");
        System.out.println("3 - Estado del Parking");
        System.out.println("0 - Salir");
        return Integer.parseInt(teclado.nextLine());
    }

    // Función para aparcar un vehículo
    static void entrada() {
        if (plazas > 0) {
            System.out.println("Entrada de Vehiculo");
            System.out.print("Indique la matricula: ");
            String matricula = teclado.nextLine();

            int option;
            String tipo = "";

            do {
                System.out.println("Tipo de vehiculo:");
                System.out.println("1 - Turismo");
                System.out.println("2 - Furgoneta");
                System.out.println("3 - Autobus");

                option = Integer.parseInt(teclado.nextLine());

                switch (option) {
                    case 1 -> {
                        tipo = "Turismo";
                        System.out.println("Esta aparcando un turismo.");
                        Vehiculos.add(new Vehiculos(matricula, tipo));
                    }
                    case 2 -> {
                        tipo = "Furgoneta";
                        System.out.println("Esta aparcando una Furgoneta.");
                        System.out.print("Indique la longitud: ");
                        double longitud = Double.parseDouble(teclado.nextLine());
                        Vehiculos.add(new Furgoneta(longitud, matricula, tipo));
                    }
                    case 3 -> {
                        tipo = "Autobus";
                        System.out.println("Esta aparcando un autobus.");
                        System.out.print("Introduzca el numero de asientos: ");
                        int asientos = Integer.parseInt(teclado.nextLine());
                        Vehiculos.add(new Autobus(asientos, matricula, tipo));
                    }
                    default -> System.out.println("Opcion incorrecta, intentelo de nuevo.");
                }
            } while (option < 1 || option > 3);

            System.out.println("Vehiculo aparcado.");
            plazas--;
        } else {
            System.out.println("Parking lleno.");
        }
    }

    // Función para desaparcar un vehículo
    static void desaparcarVehiculo() {
        System.out.print("Introduce la matricula para desaparcar: ");
        String matDesaparcar = teclado.nextLine();

        Iterator<Vehiculos> iter = Vehiculos.iterator();
        while (iter.hasNext()) {
            Vehiculos vehiculo = iter.next();
            if (vehiculo.matricula.equals(matDesaparcar)) {
                facturado += vehiculo.coste();
                iter.remove();
                plazas++;
                System.out.printf("Vehiculo desaparcado. Coste: %.2f euros", vehiculo.coste());
                return;
            }
        }
        System.out.println("No hay ningun vehiculo con esa matricula.");
    }

    // Función para mostrar el estado del parking
    static void estadoParking() {
        System.out.println("Plazas disponibles: " + plazas);
        System.out.println("Vehiculos aparcados:");
        for (Vehiculos vehiculo : Vehiculos) {
            System.out.println(vehiculo.tipo + ": " + vehiculo.matricula);
        }
        System.out.printf("Total recaudado: %.2f euros", facturado);
    }
}

