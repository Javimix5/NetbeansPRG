package examenevaluacion;

/**
 *
 * @author Javier González Prados
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = null;

        while (true) {
            // Menú
            System.out.println("\nMenu:");
            System.out.println("1. Crear usuario");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Mostrar usuario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    if (usuario != null) {
                        System.out.println("Ya existe un usuario creado.");
                        break;
                    }

                    System.out.print("Introduce el nombre de usuario: ");
                    String nombre = scanner.nextLine();

                    System.out.println("¿Cómo deseas establecer la contraseña?");
                    System.out.println("1. Introducir contraseña manualmente");
                    System.out.println("2. Generarla aleatoriamente");
                    System.out.print("Elige una opción: ");
                    int opcionContraseña = scanner.nextInt();
                    scanner.nextLine();  // Limpiar buffer

                    Password pass = null;

                    if (opcionContraseña == 1) {
                        boolean contraseñaFuerte = false;
                        while (!contraseñaFuerte) {
                            System.out.print("Introduce la contraseña: ");
                            String contraseña = scanner.nextLine();
                            pass = new Password(contraseña);
                            if (pass.esFuerte()) {
                                contraseñaFuerte = true;
                            } else {
                                System.out.println("La contraseña no es fuerte. Debe tener más de 2 mayúsculas, 2 minúsculas y 3 números.");
                            }
                        }
                    } else if (opcionContraseña == 2) {
                        System.out.print("Introduce la longitud de la contraseña: ");
                        int longitud = scanner.nextInt();
                        scanner.nextLine();  // Limpiar buffer
                        pass = new Password(longitud);
                        System.out.println("Contraseña generada: " + pass.getContraseña());
                    }

                    // Crear usuario
                    try {
                        usuario = new Usuario(nombre, pass);
                        System.out.println("Usuario creado con éxito.");
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    if (usuario == null) {
                        System.out.println("No hay un usuario creado.");
                    } else {
                        System.out.print("Introduce el nombre del usuario para eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        System.out.print("Introduce la contraseña del usuario para eliminar: ");
                        String contraseñaEliminar = scanner.nextLine();

                        if (usuario.getNombre().equals(nombreEliminar) && usuario.getPassword().getContraseña().equals(contraseñaEliminar)) {
                            usuario = null;
                            Usuario.eliminarUsuario();
                            System.out.println("Usuario eliminado.");
                        } else {
                            System.out.println("Datos incorrectos.");
                        }
                    }
                    break;

                case 3:
                    if (usuario != null) {
                        System.out.println(usuario.toString());
                    } else {
                        System.out.println("No hay un usuario creado.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}
