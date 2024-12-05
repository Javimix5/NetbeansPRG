
/*
 * 6.16. Realiza mediante objetos un juego de Gato y Ratón: sobre un tablero que por el 
momento es de 20 filas x 20 columnas (aunque podría cambiar el tamaño), el gato y ratón se sitúan 
inicialmente en una posición al azar. En cada turno el gato y el ratón se mueven alternativamente. El 
ratón es rápido pero ciego así que se mueve de 2 en 2 casillas pero en una dirección aleatoria (si el
movimiento provocase que saliese del tablero, vuelve a generarlo hasta que sea un movimiento 
válido). El gato se mueve de una en una casilla pero siempre en dirección hacia el ratón. El programa 
termina cuando se encuentren. El programa mostrará la situación del tablero después de cada 
movimiento (el usuario pulsará <ENTER> para que se produzca cada movimiento). Pistas: 
- Hacer una clase TableroGatoRaton, con un constructor en el que se crea las dimensiones cantidad de 
filas y cantidad de columnas. Esa clase tiene un método para pintar el tablero, por ejemplo, con un 
punto para casillas vacías, una “G” para la posición del gato y una “R” para la posición del Ratón.
- Hacer una clase Ratón y una clase Gato cuyas propiedades son su posición, con un constructor que 
sitúa al gato o ratón en una posición inicial, y un método mover que cambia de posición, según las 
reglas descritas.
- Hacer un main() que cree un tablero, un ratón y un gato y alterne los movimientos de los dos últimos.

 */
package tema6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author javier.gonzalezprado
 */
public class JgpT6e16GatoRaton {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = 20, columnas = 20;
        Tablero tablero = new Tablero(filas, columnas);
        Raton Pancracio = new Raton(filas, columnas);
        Gato Tom = new Gato(filas, columnas);

        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            tablero.dibujarTablero(Tom.getPosicionX(), Tom.getPosicionY(),
                    Pancracio.getPosicionX(), Pancracio.getPosicionY());
            System.out.println("Presiona <ENTER> para continuar...");
            scanner.nextLine();

            if (Pancracio.getPosicionX() == Tom.getPosicionX()
                    && Pancracio.getPosicionY() == Tom.getPosicionY()) {
                System.out.println("El gato atrapo al raton");
                juegoTerminado = true;
                break;
            }

            Pancracio.movimientoRaton(filas, columnas);

            tablero.dibujarTablero(Tom.getPosicionX(), Tom.getPosicionY(),
                    Pancracio.getPosicionX(), Pancracio.getPosicionY());
            System.out.println("Presiona <ENTER> para continuar...");
            scanner.nextLine();

            if (Pancracio.getPosicionX() == Tom.getPosicionX()
                    && Pancracio.getPosicionY() == Tom.getPosicionY()) {
                System.out.println("El gato atrapó al raton");
                juegoTerminado = true;
                break;
            }

            Tom.movimientoGato(Pancracio.getPosicionX(), Pancracio.getPosicionY());
        }

        scanner.close();
    }

    // Clase Gato
    public static class Gato {

        private int posXgato, posYgato;
        private Random random = new Random();

        public Gato(int filas, int columnas) {
            this.posXgato = random.nextInt(filas);
            this.posYgato = random.nextInt(columnas);
        }

        public int getPosicionX() {
            return posXgato;
        }

        public int getPosicionY() {
            return posYgato;
        }

        public void movimientoGato(int filaRaton, int columnaRaton) {
            if (posXgato < filaRaton) {
                posXgato++;
            } else if (posXgato > filaRaton) {
                posXgato--;
            }

            if (posYgato < columnaRaton) {
                posYgato++;
            } else if (posYgato > columnaRaton) {
                posYgato--;
            }
        }
    }

    // Clase Raton
    public static class Raton {

        private int posXraton, posYraton;
        private Random random = new Random();

        public Raton(int filas, int columnas) {
            this.posXraton = random.nextInt(filas);
            this.posYraton = random.nextInt(columnas);
        }

        public int getPosicionX() {
            return posXraton;
        }

        public int getPosicionY() {
            return posYraton;
        }

        public void movimientoRaton(int filas, int columnas) {
            boolean movimientoValido = false;
            while (!movimientoValido) {
                int direccion = random.nextInt(4); // 0: arriba, 1: abajo, 2: izquierda, 3: derecha
                int nuevaFila = posXraton, nuevaColumna = posYraton;

                switch (direccion) {
                    case 0 ->
                        nuevaFila -= 2; // Arriba
                    case 1 ->
                        nuevaFila += 2; // Abajo
                    case 2 ->
                        nuevaColumna -= 2; // Izquierda
                    case 3 ->
                        nuevaColumna += 2; // Derecha
                }

                if (nuevaFila >= 0 && nuevaFila < filas
                        && nuevaColumna >= 0 && nuevaColumna < columnas) {
                    posXraton = nuevaFila;
                    posYraton = nuevaColumna;
                    movimientoValido = true;
                }
            }
        }
    }

    // Clase Tablero
    public static class Tablero {

        private int cantFilas, cantColumnas;

        public Tablero(int cantFilas, int cantColumnas) {
            this.cantFilas = cantFilas;
            this.cantColumnas = cantColumnas;
        }

        public void dibujarTablero(int filaGato, int columnaGato, int filaRaton, int columnaRaton) {
            for (int i = 0; i < cantFilas; i++) {
                for (int j = 0; j < cantColumnas; j++) {
                    if (i == filaGato && j == columnaGato) {
                        System.out.print("G ");
                    } else if (i == filaRaton && j == columnaRaton) {
                        System.out.print("R ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }
        }
    }
}
