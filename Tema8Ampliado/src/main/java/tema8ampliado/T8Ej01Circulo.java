
package tema8ampliado;

import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 */

public class T8Ej01Circulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo (solo valores positivos):");
        double radio = scanner.nextDouble();

        while (radio <= 0) {
            System.out.println("Error: el radio debe ser un valor positivo. Inténtelo de nuevo:");
            radio = scanner.nextDouble();
        }

        Circulo circulo = new Circulo(radio);

        System.out.println("Radio del círculo: " + circulo.getRadio());
        System.out.println("Área del círculo: " + circulo.getArea());
    }
}
