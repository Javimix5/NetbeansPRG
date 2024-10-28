/*
* Precio Venta Coche
* Autor: Javier González Prados
* Fecha 13-SEP-2024
 */
package tema1;

import java.util.Scanner;

public class JGPt01e06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double cliente,fabrica,precio;
        final double GANANCIA = 1.1;
        final double BENEFICIO = 1.2;

        System.out.println("Buenos dias, este es el calculador del valor de un coche incluyendo los gastos de gestion");
        System.out.println("Introduce el precio del coche: ");
        fabrica = teclado.nextDouble();
        precio = fabrica * GANANCIA;
        cliente = precio * BENEFICIO;
        System.out.println("\nEl precio del coche para el cliente es: " + String.format("%.2f", cliente) + "\n");

    }
}
