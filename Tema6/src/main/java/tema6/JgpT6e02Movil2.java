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

public class JgpT6e02Movil2 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MovilPrepago movil2 = new MovilPrepago(900900900L, 0.1f, 0.5f, 10f);

        System.out.println("Indique su numero de telefono: ");
        movil2.setNumeroMovil(teclado.nextLong());

        movil2.toString();
        menu(movil2);

    }

    static void menu(MovilPrepago movil) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Elegiste opción 1 (Consultar el saldo)");
                    System.out.println("Su saldo es: " + movil.getSaldo());
                    break;
                case 2:
                    System.out.println("Elegiste opción 2 (Recargar)");
                    System.out.println("Introduce cantidad a recargar: (solo se aceptan multiplos de 5)");
                    boolean importe = movil.recargar(teclado.nextInt());
                    System.out.println("Nuevo saldo: " + movil.getSaldo());
                    break;
                case 3:
                    System.out.println("Elegiste opción 3 (Realizar una llamada)");
                    System.out.println("Se realizara una llamada. Establece duracion en segundos: ");
                    movil.efectuarLlamada(teclado.nextInt());
                    break;
                case 4:
                    System.out.println("Elegiste opción 4 (Navegar por internet");
                    System.out.println("Cuantos megas ha consumido? ");
                    movil.navegar(teclado.nextInt());
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Consultar Saldo");
        System.out.println("2 Recargar");
        System.out.println("3 Realizar una llamada");
        System.out.println("4 Navegar por internet");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }
}
