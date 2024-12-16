package examenevaluacion;

/**Programa una clase llamada Password que cumpla los siguientes requisitos:
    • Debe tener dos atributos, longitud y contraseña.
    • Debe implementar los siguientes constructores:
        ◦ Un constructor vacío.
        ◦ Un constructor con la longitud por parámetro. Generará una contraseña aleatoria con esa longitud.
        ◦ Un constructor que recibe la contraseña por parámetro.
          
    • Los métodos que implementa serán:
        ◦ Método get  para contraseña, longitud.
        ◦ Método toString para mostrar el atributo contraseña.
        ◦ esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 2 minúsculas y mas de 3 números.
        ◦ generarPassword(): genera la contraseña del objeto con la longitud que se le haya pasado como parámetro. 
          
      Programa otra clase llamada Usuario que cumpla las siguientes condiciones:
    • Debe tener los atributos nombre y password (de tipo Password).
    • Un atributo estático usuarioCreado de tipo boolean para determinar si hay un usuario creado.
    • Tendrá un constructor que reciba los atributos nombre y password por parámetro.
    • Método get para nombre y contraseña.
    • Método toString para imprimir el nombre y la contraseña.
      
      Clase ejecutable (En un fichero aparte):
    • Crea un menú con las opciones: crear usuario, eliminar usuario, mostrar usuario y salir.
    • Al elegir la opción crear usuario el programa debe pedir el nombre y a continuación debe permitir elegir entre introducir una contraseña o generarla de forma aleatoria. 
    • El programa debe validar si la contraseña introducida por el usuario es fuerte y volver a pedirla si no lo es.
    • El programa no debe permitir crear más de un usuario.
    • Si el usuario elige la opción de borrar usuario, el programa pedirá el nombre y la contraseña, si son válidos eliminará el usuario.
    • La opción mostrar usuario hará uso de los métodos toString.
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
