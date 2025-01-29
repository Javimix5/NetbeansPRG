package tema8ampliado;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class T8Ej05Animales {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Gato gato = new Gato("Felix");
        Perro perro = new Perro("Rex");

        System.out.println(gato.getNombre());
        System.out.println("Sonido del gato:");
        gato.sonido(); // imprime "Miau"
        
        System.out.println(perro.getNombre());
        System.out.println("Sonido del perro sin parametros");
        perro.sonido(); // imprime "Guau"
        
        System.out.println("Sonido del perro con parametros");
        perro.sonido(perro); // imprime "Guau guau guauuuuuuu"
    }

}
