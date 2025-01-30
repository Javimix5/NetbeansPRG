package tema8ampliado;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class T8Ej08Movil {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Movil m1 = new Movil("678 11 22 33", "alfa");
        Movil m2 = new Movil("644 74 44 69", "beta");
        Movil m3 = new Movil("622 32 89 09", "gamma");

        System.out.println(m1);
        System.out.println(m2);

        m1.llama(m2, 320);
        m1.llama(m3, 200);
        m2.llama(m3, 550);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
