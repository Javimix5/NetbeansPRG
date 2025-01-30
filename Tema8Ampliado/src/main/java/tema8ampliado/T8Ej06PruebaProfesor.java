package tema8ampliado;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class T8Ej06PruebaProfesor {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese el nombre del profesor: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese la dirección del profesor: ");
        String direccion = teclado.nextLine();

        Profesor profesor = new Profesor(nombre, direccion);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar curso");
            System.out.println("2. Eliminar curso");
            System.out.println("3. Terminar");
            System.out.print("Ingrese su opción: ");
            int opcion = teclado.nextInt();
            teclado.nextLine(); // Consume newline left-over

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del curso: ");
                    String curso = teclado.nextLine();
                    profesor.imparteCurso(curso);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del curso a eliminar: ");
                    curso = teclado.nextLine();
                    profesor.eliminaCurso(curso);
                    break;
                case 3:
                    System.out.println("Terminando...");
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println(profesor.toString());
        }
    }
}
