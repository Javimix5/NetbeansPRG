
package examen2025;


/**
 *
 * @author Javier González Prados
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class JGP_Ex1_Ej2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
// Crear fabrica
        Fabrica fabrica = new Fabrica();

// Sucursal 1:
        Sucursal sucursal1 = new Sucursal("Sucursal 1");
        sucursal1.añadirInstrumento(new Instrumento("P1", "Tambor", 200.4, "Percusion"));
        sucursal1.añadirInstrumento(new Instrumento("P2", "Bateria", 200.4, "Percusion"));
        sucursal1.añadirInstrumento(new Instrumento("C4", "Guitarra", 150.5, "Cuerda"));
        sucursal1.añadirInstrumento(new Instrumento("V1", "Flauta", 100.3, "Viento"));

// Sucursal 2:
        Sucursal sucursal2 = new Sucursal("Sucursal 2");
        sucursal2.añadirInstrumento(new Instrumento("V2", "Violin", 190, "Viento"));
        sucursal2.añadirInstrumento(new Instrumento("P5", "Bateria", 230.8, "Percusion"));
        sucursal2.añadirInstrumento(new Instrumento("C7", "Guitarra Electrica", 180.5, "Cuerda"));

// Añadir sucursalesa la fabrica
        fabrica.anhadirSucursal(sucursal1);
        fabrica.anhadirSucursal(sucursal2);

// Listar instrumentos de la fabrica        
        System.out.println("Instrumentos de la fabrica: ");
        fabrica.listarSucursales();
        System.out.println("------------------------------");

// Borrar instrumento de una sucursal
        sucursal1.borrarInstrumento("C4");
        sucursal2.borrarInstrumento("P5");
        System.out.println("Instrumentos tras el borrado: ");
        fabrica.listarSucursales();
        System.out.println("------------------------------");

// Listar instrumentos por tipo
        System.out.println("Intrumentos de percusion del la sucursal 1: ");
        ArrayList<Instrumento> percusion = sucursal1.instrumentosPorTipo("Percusion");
        for (Instrumento instrumento : percusion) {
            System.out.println(instrumento);
        }
        System.out.println("------------------------------");

// Borrar una sucursal (La 2)
        System.out.println("Se borrara la sucursal2");
        fabrica.borrarSucursal("Sucursal 2");
        fabrica.listarSucursales();
        System.out.println("------------------------------");

    }
}

