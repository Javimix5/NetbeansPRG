package examenevaluacion;

/**
 *
 * @author Javier González Prados
 */
public class Usuario {

    private String nombreUsuario;

    public static boolean usuarioCreado = false;

    public Usuario() {
    }

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        usuarioCreado=true;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public static boolean isUsuarioCreado() {
        return usuarioCreado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre= " + getNombreUsuario() + '}';
    }

    public void eliminarUsuario() {
        usuarioCreado = false;
    }

    public boolean crearUsuario() {
        return usuarioCreado = true;
    }

}//Fin clase
