package examenevaluacion;

import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */
public class Ejercicio3Exam {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        PasswordExam contraseña = new PasswordExam();
        UsuarioExam usuario = new UsuarioExam();
        menu(usuario, contraseña);

    }

    static void menu(UsuarioExam usuario, PasswordExam contraseña) {

        boolean salir = false;
        int opcion;

        do {
            opcion = pintarMenu();
            switch (opcion) {

                case 1:
                    System.out.println("Elegiste Crear usuario");
                    if (UsuarioExam.isUsuarioCreado() == true) {
                        System.out.println("Ya existe un usuario. Eliminalo antes de crear otro.");
                        break;

                    } else {
                        System.out.println("Introduce el nombre de usuario: ");
                        String nombre = teclado.nextLine();
                        System.out.println("Quieres introducir la contraseña? (s/n): ");
                        char eleccion = teclado.nextLine().charAt(0);
                        PasswordExam password = null;

                        if (eleccion == 's' || eleccion == 'S') {
                            System.out.println("Introduce la contraseña: ");
                            contraseña.setContraseña(teclado.next());
                            System.out.println("Contraseña fuerte = " + contraseña.esFuerte());

                        } else {
                            System.out.println("Se genera automaticamente");
                            contraseña.setContraseña(contraseña.generarPassword(10));
                            String contraseñaUsuario = password.getContraseña();
                            System.out.println("Su contraseña es: " + contraseñaUsuario);
                        }
                        usuario.crearUsuario();
                        usuario.setNombreUsuario(nombre);
                    }
                    break;

                case 2:
                    System.out.println("Elegiste eliminar usuario");
                    if (!UsuarioExam.isUsuarioCreado()) {
                        System.out.println("No hay ningún usuario");
                    } else {
                        System.out.println("Introduce el nombre de usuario: ");
                        String nombre = teclado.nextLine();
                        System.out.println("Introduce la contraseña: ");
                        String contraseñaEliminar = teclado.next();

                        if (usuario.getNombreUsuario().equals(nombre) && contraseña.getContraseña().equals(contraseñaEliminar)) {
                            usuario.eliminarUsuario();
                            System.out.println("Usuario eliminado con exito");
                        } else {
                            System.out.println("Nombre o contraseña incorrectos");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Elegiste mostrar usuario");
                    if (!usuario.isUsuarioCreado()) {
                        System.out.println("No hay ningun usuario.");
                    } else {
                        System.out.println(usuario.toString());
                        System.out.println(contraseña.toString());

                    }
                    break;

                case 0:
                    System.out.println("Elegiste salir");
                    salir = true;

                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);

    }//fin main

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Crear usuario");
        System.out.println("2 eliminar usuario");
        System.out.println("3 mostrar usuario");
        System.out.println("0 Salir");
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (Exception e) {
        }
        return 999;
    }
}//fin clase
