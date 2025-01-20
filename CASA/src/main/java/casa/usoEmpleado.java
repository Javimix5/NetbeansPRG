package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class usoEmpleado {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        /*   Empleado empleado1 = new Empleado("Paco Melenas", 85000, 1990, 12, 17);

        Empleado empleado2 = new Empleado("Manolo Cabeza", 95000, 1995, 06, 02);

        Empleado empleado3 = new Empleado("Benito Melon", 105000, 2002, 03, 15);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + " Fecha de Alta: " + empleado1.damefechaAlta());
        System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + " Fecha de Alta: " + empleado2.damefechaAlta());
        System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + " Fecha de Alta: " + empleado3.damefechaAlta()); */
        Empleado[] misEmpleados = new Empleado[3];
        String[] miarray = new String[3];

        misEmpleados[0] = new Empleado("Paco Melenas", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Manolo Cabeza", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado("Benito Melon", 105000, 2002, 03, 15);

        for (Empleado lista : misEmpleados) {
            lista.subeSueldo(5);
        }

        /*for (int i = 0; i < 3; i++) {
            misEmpleados[i].subeSueldo(5);
        }*/
        for (Empleado lista : misEmpleados) {
            System.out.println("Nombre: " + lista.dameNombre() + " Sueldo: " + lista.dameSueldo() + " Fecha de Alta: " + lista.damefechaAlta());
        }

        /*for (int i = 0; i < 3; i++) {
            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo() + " Fecha de Alta: " + misEmpleados[i].damefechaAlta());
        }*/
    }// Fin main
}

class Empleado { //Incluimos la Clase dentro del usoEmpleado

    public Empleado(String nom, double sue, int ano, int mes, int dia) {

        nombre = nom;
        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(ano, mes - 1, dia);
        fechaAlta = calendario.getTime();

    }

    public String dameNombre() { //Getter
        return nombre;
    }

    public double dameSueldo() { //Getter
        return sueldo;
    }

    public Date damefechaAlta() { //Getter
        return fechaAlta;
    }

    public void subeSueldo(double porcentaje) { //
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;

    }
    private String nombre;
    private double sueldo;
    private Date fechaAlta;

}// Fin clase
