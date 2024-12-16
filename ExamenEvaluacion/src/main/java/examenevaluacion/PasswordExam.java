package examenevaluacion;

import java.util.Random;

/**
 *
 * @author Javier González Prados
 */
public class PasswordExam {

    private int longitud;
    private String contraseña;

    public PasswordExam() {
    }

    public PasswordExam(int longitud) {
        this.longitud = longitud;
        contraseña = generarPassword(longitud);
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public PasswordExam(String contraseña) {
        this.contraseña = contraseña;

    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    @Override
    public String toString() {
        return "Password{" + "contraseña= " + contraseña + '}';
    }

    public boolean esFuerte() { //Verifica si es Fuerte la contraseña
        boolean segura = true;

        int mayusculas = 0, minusculas = 0, numeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }
        if (mayusculas <=2 && minusculas <=2 && numeros <=3) {
            segura = true;
        }
        return segura;
    }

    public String generarPassword(int longitud) {
        Random random = new Random();
        String nuevaContraseña = "";

        for (int i = 0; i < longitud; i++) {
            int tipo = random.nextInt(3);

            if (tipo == 0) {
                int numAleatorio = random.nextInt(26);
                char letraMayus = (char)('A' + numAleatorio); //Indica todo el abecedario en Mayúsculas
            } else if (tipo == 1) {
                int numAleatorio = random.nextInt(26);
                char letraMinus = (char)('a' + numAleatorio); //Indica todo el abecedario en Minúsculas
            } else {
                nuevaContraseña += random.nextInt(10); //Indica los 10 primero números 0-9
            }
        }
        return nuevaContraseña;
    }

}//Fin clase
