package tema8ampliado;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class T8Ej09Parking {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Garaje garaje = new Garaje();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Aparcar Coche");
            System.out.println("2. Aparcar Moto");
            System.out.println("3. Desaparcar Vehículo");
            System.out.println("4. Calcular precio total de los vehículos en el garaje");
            System.out.println("5. Vehículo más rápido");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Marca: ");
                    String marcaC = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precioC = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matriculaC = scanner.nextLine();
                    System.out.print("Velocidad máxima: ");
                    int velocidadC = scanner.nextInt();
                    System.out.print("Número de puertas: ");
                    int puertas = scanner.nextInt();
                    garaje.aparcarVehiculo(new Coche(marcaC, precioC, matriculaC, velocidadC, puertas));
                    break;
                case 2:
                    System.out.print("Marca: ");
                    String marcaM = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precioM = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matriculaM = scanner.nextLine();
                    System.out.print("Velocidad máxima: ");
                    int velocidadM = scanner.nextInt();
                    System.out.print("¿Tiene sidecar? (true/false): ");
                    boolean sidecar = scanner.nextBoolean();
                    garaje.aparcarVehiculo(new Moto(marcaM, precioM, matriculaM, velocidadM, sidecar));
                    break;
                case 3:
                    System.out.print("Ingrese la matrícula del vehículo a desaparcar: ");
                    String mat = scanner.nextLine();
                    garaje.desaparcarVehiculo(mat);
                    break;
                case 4:
                    garaje.getPrecioTotal();
                    break;
                case 5:
                    garaje.getVehiculoMasRapido();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 6);
        scanner.close();
    }
}
