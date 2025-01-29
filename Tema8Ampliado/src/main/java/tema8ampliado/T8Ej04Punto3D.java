package tema8ampliado;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class T8Ej04Punto3D {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Crear un objeto Punto3D con valores iniciales
        Punto3D punto = new Punto3D(1.0f, 2.0f, 3.0f);

        // Imprimir los valores iniciales
        System.out.println("Valores iniciales:");
        System.out.println("X: " + punto.getX());
        System.out.println("Y: " + punto.getY());
        System.out.println("Z: " + punto.getZ());

        // Modificar los valores utilizando los métodos set
        punto.setX(4.0f);
        punto.setY(5.0f);
        punto.setZ(6.0f);

        // Imprimir los valores modificados
        System.out.println("Valores modificados:");
        System.out.println("X: " + punto.getX());
        System.out.println("Y: " + punto.getY());
        System.out.println("Z: " + punto.getZ());

        // Utilizar el método setXYZ para modificar todos los valores de una vez
        punto.setXYZ(7.0f, 8.0f, 9.0f);

        // Imprimir los valores modificados
        System.out.println("Valores modificados con setXYZ:");
        System.out.println("X: " + punto.getX());
        System.out.println("Y: " + punto.getY());
        System.out.println("Z: " + punto.getZ());
    }

}
