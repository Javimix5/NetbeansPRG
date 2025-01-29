package tema8ampliado;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class T8Ej02Cilindro {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        double radio, altura;

        do {
            System.out.print("Ingrese el radio del cilindro: ");
            radio = teclado.nextDouble();

            if (radio <= 0) {
                System.out.println("Error introduce un numero positivo");
            } else {
                salir = true;
            }

        } while (!salir);

        salir = false;

        do {
            System.out.print("Ingrese la altura del cilindro: ");
            altura = teclado.nextDouble();

            if (altura <= 0) {
                System.out.println("Error introduce un numero positivo");
            } else {
                salir = true;
            }

        } while (!salir);

        Cilindro cilindro = new Cilindro(radio, altura);

        System.out.printf("El área de la base del cilindro es: %.2f%n", cilindro.area(radio));
        System.out.printf("El volumen del cilindro es: %.2f%n", cilindro.volumen(radio, altura));
    }

}
