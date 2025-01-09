

package examen;


/**
 *
 * @author Javier González Prados
 */

public class Usuario {
//Atributos
private String nombre;
private Password pwd;
private boolean usuarioCreado;
        
//Constructores
public Usuario(String nombre, Password pwd) {
        this.nombre = nombre;
        this.pwd = pwd;
    }

//Getter y setter
public String getNombre() {
        return nombre;
    }

    public Password getPwd() {
        return pwd;
    }

//toString

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", pwd=" + pwd + '}';
    }

    
}//Fin clase
