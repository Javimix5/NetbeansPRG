package tema10;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT10Ej05Ajedrez_v1 {

    static Scanner teclado = new Scanner(System.in);
    static final String BLANCO = "\u001B[40m";
    static final String NEGRO = "\u001B[47m";
    static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        PiezaAjedrez pieza;

        System.out.println("Elige una pieza para jugar: (1) Alfil (2) Torre");
        int eleccion = teclado.nextInt();

        if (eleccion == 1) {
            pieza = new AlfilAjedrez(0, 0);
        } else {
            pieza = new TorreAjedrez(0, 0);
        }

        while (true) {
            mostrarTablero(pieza);
            System.out.println();
            System.out.println("Introduce nueva fila (-1 para salir):");
            int nuevaFila = teclado.nextInt();
            if (nuevaFila == -1) {
                break;
            }

            System.out.println("Introduce nueva columna:");
            int nuevaColumna = teclado.nextInt();

            if (pieza.mover(nuevaFila, nuevaColumna)) {
                pieza.setPosicion(nuevaFila, nuevaColumna);
            } else {
                System.out.println("Movimiento no válido.");
            }
        }

        System.out.println("Juego terminado.");
    }

    private static void mostrarTablero(PiezaAjedrez pieza) {
        System.out.println("   a  b  c  d  e  f  g  h ");

        for (int i = 0; i < 8; i++) {
            System.out.print((i) + " ");

            for (int j = 0; j < 8; j++) {

                if ((i + j) % 2 == 0) {
                    if (i == pieza.fila && j == pieza.columna) {
                        System.out.print(BLANCO + " P " + RESET);
                    } else {
                        System.out.print(BLANCO + " . " + RESET);
                    }
                } else {
                    if (i == pieza.fila && j == pieza.columna) {
                        System.out.print(NEGRO + " P " + RESET);
                    } else {
                        System.out.print(NEGRO + " . " + RESET);
                    }
                }
            }
            System.out.println(" " + (i));
        }

        System.out.println("   a  b  c  d  e  f  g  h ");
    }

}// Fin clase

