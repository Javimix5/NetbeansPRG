

package examenevaluacion;


/**
 *
 * @author Javier González Prados
 */

public class Usuario {
    
    private String nombre;
    private String password;
    private static boolean usuarioCreado = false;

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", password=" + password + '}';
    }
    
    public static boolean isUsuarioCreado(){
    
    return usuarioCreado = true;
    }
    
    public static void eliminarUsario(){
    usuarioCreado = false;
    }

}//Fin clase
