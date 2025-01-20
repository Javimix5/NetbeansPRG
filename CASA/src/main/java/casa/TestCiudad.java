/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author CASA
 */
import java.util.Scanner;

public class TestCiudad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos de la ciudad
        System.out.print("Introduce el nombre de la ciudad: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el nombre del país: ");
        String pais = scanner.nextLine();

        // Crear la ciudad
        Ciudad ciudad = new Ciudad(nombre, pais);

        // Pedir las temperaturas
        for (int i = 1; i <= 12; i++) {
            System.out.print("Introduce la temperatura del mes " + i + " en grados centígrados: ");
            double temperatura = scanner.nextDouble();
            ciudad.asignarTemperatura(i, temperatura);
        }

        // Mostrar temperaturas en centígrados
        ciudad.mostrarCentigrados();

        // Mostrar temperaturas en Farenheit
        ciudad.mostrarFarenheit();

        // Calcular y mostrar la media
        System.out.println("La temperatura media en grados centígrados es: " + ciudad.calcularMedia() + "°C");
    }
}
