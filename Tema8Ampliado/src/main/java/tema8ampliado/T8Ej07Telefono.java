package tema8ampliado;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class T8Ej07Telefono {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Telefono t1 = new Telefono("678 11 22 33");
        Telefono t2 = new Telefono("644 74 44 69");
        Telefono t3 = new Telefono("622 32 89 09");
        Telefono t4 = new Telefono("664 73 98 18");

        System.out.println(t1);
        System.out.println(t2);

        t1.llama(t2, 320);
        t1.llama(t3, 200);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}
