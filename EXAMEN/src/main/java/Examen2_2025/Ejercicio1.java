
package Examen2_2025;


/**
 *
 * @author Javier González Prados
 * 
 */
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("===Prueba de Alarma===");
        
        Alarma alarma = new Alarma(50);
        alarma.comprobarEstado();
        alarma.medicionesConsecutivas(5);
        System.out.println("Ultima Activacion de la alarma: " + alarma.obtenerUltimaActivacion());
        System.out.println("Ultimas activaciones registradas: " + alarma.getActivaciones());
        
        
        System.out.println("===Prueba de AlarmaLuminosa===");
        AlarmaLuminosa luminosa = new AlarmaLuminosa(50);
        luminosa.comprobarEstado();
        luminosa.medicionesConsecutivas(5);
        System.out.println("Ultima Activacion de la Alarma Luminosa: " + luminosa.obtenerUltimaActivacion());
        System.out.println("Historial de activacion de alarma: " + luminosa.getActivaciones());
        
    }

}
