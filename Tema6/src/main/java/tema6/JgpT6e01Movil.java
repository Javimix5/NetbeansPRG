/*
 * 6.1- A partir de la clase MovilPrepago que te proporcionará el profesor, haz un programa en el que 
se cree un teléfono con unas características determinadas y luego ejecute una serie de actividades 
como recargar 10 euros, llamar 30 segundos, navegar 10MB, etc. Viendo cómo se va modificando el 
saldo. 
Las propiedades de un móvil prepago son: 
- int numeroMovil (9 dígitos) 
- float costeMinutoLlamada (euros, con dos decimales)
- float costeConsumoMB (euros, con dos decimales) 
- float saldo (euros, con dos decimales) 
Tiene un único constructor con la siguiente firma: 
MovilPrepago(long nM, float cML, float cMB, float s) 
Los métodos son: 
- void efectuarLlamada (int segundos): reduce el saldo. Si el saldo no es suficiente, se corta la llamada 
- void navegar(int MB) análogo a efectuar una llamada 
- boolean recargar (int importe): aumenta el saldo, debe ser múltiplo de 5 euros, sino devuelve false
- float consultarSaldo () 
 */
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
import java.util.Scanner;

public class JgpT6e01Movil {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        MovilPrepago miMovil = new MovilPrepago(600123456L, 0.15f, 0.02f, 10.0f, 0.10f);

        //En caso de que se quiera visualizar el por defecto seria + miMovil.getNumeroMovil()
        System.out.println("Introduce tu numero de telefono: ");
        miMovil.setNumeroMovil(teclado.nextLong());
        System.out.println(miMovil.toString());

        System.out.print("Introduce el coste por minuto de llamada (euros con dos decimales): ");
        float costeMinutoLlamada = teclado.nextFloat();

        System.out.print("Introduce el coste de establecimiento de llamada (euros con dos decimales): ");
        float costeEstablecLlamada = teclado.nextFloat();

        System.out.print("Introduce el coste por MB de navegación (euros con dos decimales): ");
        float costeConsumoMB = teclado.nextFloat();

        System.out.print("Introduce el saldo inicial (euros con dos decimales): ");
        float saldoInicial = teclado.nextFloat();

        // Crear el objeto móvil prepago
        System.out.println(miMovil.toString());

        System.out.println("\n--- Movil creado con exito ---");
        System.out.println("Saldo inicial: " + miMovil.consultarSaldo() + " euros");

        int opcion;
        do {
            System.out.println("\nElige una operacion:");
            System.out.println("1. Recargar saldo");
            System.out.println("2. Realizar una llamada");
            System.out.println("3. Navegar por Internet");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");

            System.out.print("Opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: // Recargar saldo
                    System.out.print("Introduce el importe de la recarga (múltiplo de 5): ");
                    int importe = teclado.nextInt();
                    miMovil.recargar(importe);
                    break;

                case 2: // Realizar una llamada
                    System.out.print("Introduce la duracion de la llamada (en segundos): ");
                    int segundos = teclado.nextInt();
                    miMovil.efectuarLlamada(segundos);
                    break;

                case 3: // Navegar por Internet
                    System.out.print("Introduce la cantidad de datos consumidos (en MB): ");
                    int MB = teclado.nextInt();
                    miMovil.navegar(MB);
                    break;

                case 4: // Consultar saldo
                    System.out.println("Saldo actual: " + miMovil.consultarSaldo() + "€");
                    break;

                case 5: // Salir
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        } while (opcion != 5);
    }

}
