package clasesobjetos;

/**
 *
 * @author Javier.gonzalezprado
 */
import java.util.Random;

public class Persona {
    
//Atributos
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

//Constantes
    public static final char hombre = 'H';
    public static final char mujer = 'M';
    public static final int pesoBajo = -1;
    public static final int sobrepeso = 1;
    public static final int pesoIdeal = 0;

//Datos introducidos por teclado    
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = hombre;
        this.peso = peso;
        this.altura = altura;
    }
//Datos para la tercer persona
    public Persona() {
        this.nombre = "Javier";
        this.edad = 39;
        this.DNI = generarDNI();
        this.sexo = hombre;
        this.peso = 80;
        this.altura = 1.68;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
//Formula para calculo IMC
    public int calculaIMC() {
        if (altura <= 0) {
            return pesoBajo;
        }
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return pesoBajo;

        } else if (imc <= 25 && imc >= 20) {
            return pesoIdeal;
        } else {
            return sobrepeso;
        }
    }
//Boolean para Mayor de edad
    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }

    }
//Comprueba peso si es H o M
    private char comprobarSexo(char sexo) {
        return (sexo == hombre || sexo == mujer) ? sexo : hombre;
    }
//Generador DNI
    private String numDNI() {
        StringBuilder numeros = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int numero = random.nextInt(10);
            numeros.append(numero);
        }
        return numeros.toString();
    }

    private String generarDNI() {
        String DNIletras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = Integer.parseInt(numDNI()) % 23;
        char DNILetra = DNIletras.charAt(indice);
        return numDNI() + "-" + DNILetra;
    }
//SETs
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
//Mensaje final
    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", edad= " + edad + ", DNI= " + DNI + ", sexo= " + sexo + ", peso= " + peso + ", altura= " + altura + '}';
    }

}
