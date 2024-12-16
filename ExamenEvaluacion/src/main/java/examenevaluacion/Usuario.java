package examenevaluacion;

/**
 *
 * @author Javier González Prados
 */
public class Usuario {
    private String nombre;
    private Password password;
    private static boolean usuarioCreado = false;

    // Constructor
    public Usuario(String nombre, Password password) {
        if (usuarioCreado) {
            throw new IllegalStateException("Ya existe un usuario creado.");
        }
        this.nombre = nombre;
        this.password = password;
        usuarioCreado = true;
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public Password getPassword() {
        return password;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" + password.toString();
    }

    // Método para eliminar usuario
    public static void eliminarUsuario() {
        usuarioCreado = false;
    }
}
