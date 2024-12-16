package examenevaluacion;

/**
 *
 * @author Javier González Prados
 */
import java.util.Random;

public class Password {
    private int longitud;
    private String contraseña;

    // Constructor vacío
    public Password() {
        this.longitud = 8; // Por defecto longitud 8
        this.contraseña = generarPassword(longitud);
    }

    // Constructor con longitud
    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword(longitud);
    }

    // Constructor con contraseña por parámetro
    public Password(String contraseña) {
        this.longitud = contraseña.length();
        this.contraseña = contraseña;
    }

    // Métodos get
    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    // Método toString
    @Override
    public String toString() {
        return "Contraseña: " + contraseña;
    }

    // Método para comprobar si la contraseña es fuerte
    public boolean esFuerte() {
        int mayusculas = 0, minusculas = 0, numeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) mayusculas++;
            else if (Character.isLowerCase(c)) minusculas++;
            else if (Character.isDigit(c)) numeros++;
        }

        return mayusculas > 2 && minusculas > 2 && numeros > 3;
    }

    // Método para generar una contraseña aleatoria
    public String generarPassword(int longitud) {
        Random rand = new Random();
        StringBuilder pass = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int option = rand.nextInt(3);
            if (option == 0) {
                // Caracter aleatorio mayúscula
                pass.append((char) (rand.nextInt(26) + 'A'));
            } else if (option == 1) {
                // Caracter aleatorio minúscula
                pass.append((char) (rand.nextInt(26) + 'a'));
            } else {
                // Caracter aleatorio número
                pass.append(rand.nextInt(10));
            }
        }
        return pass.toString();
    }
}
