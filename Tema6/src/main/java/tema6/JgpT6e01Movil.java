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

        MovilPrepago movil1 = new MovilPrepago(900900900L, 0.1f, 0.5f, 10f);
        System.out.println("Indique su numero de telefono: ");
        movil1.setNumeroMovil(teclado.nextLong());
        System.out.println(movil1.toString());
        System.out.println("Quiere hacer alguna recarga? (S/N)");
        char respuesta = teclado.next().charAt(0);
        if (respuesta == 's' || respuesta == 'S') {
            System.out.println("Introduce cantidad a recargar: (solo se aceptan multiplos de 5)");
            boolean importe = movil1.recargar(teclado.nextInt());
        }
        System.out.println("Saldo actual: " + movil1.consultarSaldo());
        System.out.println("Se realizara una llamada de 30 segundos");
        movil1.efectuarLlamada(30);
        System.out.println("Saldo actual: " + movil1.consultarSaldo());
    }

}
