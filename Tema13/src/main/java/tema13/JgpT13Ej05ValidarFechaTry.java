package tema13;

/**
 *
 * @author Javier González Prados
 *
 */
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class JgpT13Ej05ValidarFechaTry {

    static Scanner teclado = new Scanner(System.in);
    static int dia, mes, anio;
    static LocalDate fecha;

    public static void main(String[] args) {

        try {
            System.out.println("Introduce el dia");
            dia = teclado.nextInt();
            System.out.println("Introduce el mes");
            mes = teclado.nextInt();
            System.out.println("Introduce el anio");
            anio = teclado.nextInt();
            if (validarFecha(dia, mes, anio)) {
                System.out.println("La fecha es valida");
            } else {
                System.out.println("La fecha NO es valida");
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada no valida. Debes introducir numeros enteros");
        }

    }// Fin main

    public static boolean validarFecha(int anio, int mes, int dia) {
        try {
            LocalDate.of(anio, mes, dia);
            return true;
        } catch (DateTimeException e) {
            return false;
        }

    }

}// Fin clase
