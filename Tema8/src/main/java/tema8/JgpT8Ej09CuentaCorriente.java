
package tema8;


/**
 *
 * @author Javier González Prados
 * 
 */
import java.util.Scanner;

public class JgpT8Ej09CuentaCorriente {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
       
        CuentaPlazo cuenta = new CuentaPlazo();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");

            int opcion = Integer.parseInt(System.console().readLine("Ingrese una opción: "));

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a ingresar: ");
                    double cantidadIngresar = Double.parseDouble(System.console().readLine());
                    cuenta.ingresar((float) cantidadIngresar);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = Double.parseDouble(System.console().readLine());
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;
                case 4:
                    System.out.println("Adiós!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }
    }
} 
