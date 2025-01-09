package examen;

/**
 *
 * @author Javier González Prados
 */
public class Password {
    //Atributos
    private int longitud;
    private String contrasena;

    //Constructores
    public Password(int longitud) {  //longitud
        this.longitud = longitud;
    }

    public Password() {  //Vacio
    }

    public Password(String contrasena) {  //contraseña por parámetro
        this.contrasena = contrasena;
    }
  
    //Getter y setter
    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }
    
    //toString
    @Override
    public String toString() {
        return "Password{" + "longitud=" + longitud + ", contrasena=" + contrasena + '}';
    }
    
    //Metodo boolean para contraseña Fuerte
    public static boolean esFuerte(String contrasena){
    return true;
    }
    
    //Metodo generar Password recibe longitud
    public static String generaPassword(int longitud){
    return "";
    }
    
    
    
}//Fin clase
