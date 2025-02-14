package Examen3_2025;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Juguete> juguetes = new ArrayList<>();

        juguetes.add(new Muneca("Muneca Barbie", 25.99));
        juguetes.add(new Muneca("Muneca Cindy", 19.50));
        juguetes.add(new Coche("Coche carreras", 50.0, true));
        juguetes.add(new Coche("Coche de policia", 45.75, false));

        System.out.println("Detalles de los juguetes antes del descuento:");
        for (Juguete juguete : juguetes) {
            juguete.mostrar();
                
            if (juguete instanceof Muneca) {
                ((Muneca) juguete).peinar();

            } if (juguete instanceof Coche) {
                ((Coche) juguete).acelerar();
            }
        }

        System.out.println("\n Aplicando un descuento del 15% a todos los juguetes...");
        for (Juguete juguete : juguetes) {
            juguete.aplicarDescuento(15);
        }
       
        System.out.println("\n Lista de juguetes con el precio actualizado: ");

        for (Juguete juguete : juguetes) {
            juguete.mostrar();
        }

    }

}
