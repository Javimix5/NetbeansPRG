package examenevaluacion;

import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */
public class Ejercicio3 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;
        int opcion;

        Usuario usuario = null;

        do {
            opcion = pintarMenu();
            switch (opcion) {

                case 1:
                    if (Usuario.isUsuarioCreado()) {
                        System.out.println("Ya existe un usuario. Eliminalo antes de crear otro.");
                    } else {
                        System.out.println("Introduce el nombre de usuario: ");
                        String nombre = teclado.nextLine();
                        System.out.println("Quieres introducir la contraseña? (s/n): ");
                        char eleccion = teclado.nextLine().charAt(0);
                        Password password = null;

                        if (eleccion == 's' || eleccion == 'S') {
                            System.out.println("Introduce la contraseña: ");
                            String contraseña = teclado.nextLine();
                            password = new Password(contraseña);

                            if (password.esFuerte()) {
                                break;
                            } else {
                                System.out.println("La constraseña no es fuerte. Debe tener más de 2 mayúsculas y minúsculas y 3 números");
                            }

                        } else {
                            System.out.println("Introduce la longitud de la contraseña: ");
                            int longitud = teclado.nextInt();
                            password = new Password(longitud);

                        }/*

                        usuario = new Usuario(nombre, password);
                        System.out.println("Usuario creado");           Tengo un error en esta línea que hace referencia a password */ 
                    }
                    break;

                case 2:
                    if (!Usuario.isUsuarioCreado()) {
                        System.out.println("No hay ningún usuario");
                    } else {
                        System.out.println("Introduce el nombre de usuario: ");
                        String nombre = teclado.nextLine();
                        System.out.println("Introduce la contraseña: ");
                        String contraseña = teclado.nextLine();

                        if (usuario.getNombre().equals(nombre) && usuario.getPassword().equals(contraseña)) {
                            Usuario.eliminarUsario();
                            usuario = null;
                            System.out.println("Usuario eliminado con exito");
                        } else {
                            System.out.println("Nombre o contraseña incorrectos");
                        }
                    }
                    break;

                case 3:
                    if (!Usuario.isUsuarioCreado()) {
                        System.out.println("No hay ningun usuario.");
                    } else {
                        System.out.println(usuario.toString());
                    }
                    break;

                case 0:
                    salir = true;

                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);

    }//fin main

    static int pintarMenu() {
        System.out.println("\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Crear usuario");
        System.out.println("2 eliminar usuario");
        System.out.println("3 mostrar usuario");
        System.out.println("0 Salir");
        return Integer.parseInt(teclado.nextLine());
    }

    static void tarea1() {
        System.out.println("Elegiste Crear usuario");
    }

    static void tarea2() {
        System.out.println("Elegiste eliminar usuario");
    }

    static void tarea3() {
        System.out.println("Elegiste mostrar usuario");
    }

    static void tarea0() {
        System.out.println("Elegiste salir");
    }

}//fin clase
