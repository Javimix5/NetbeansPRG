/*A partir de las clases Nim y Consola, crea un programa que juegue al NIM contra la máquina.
Se trata de un tablero con 3 filas de palillos, con 3, 5 y 7 palillos respectivamente. Dos jugadores por
turnos alternos (el usuario y la máquina) han de retirar palillos del tablero perdiendo el que se quede
el último palillo. En cada turno se pueden retirar uno o más palillos, pero solo de una misma fila.
Por lo tanto, la estructura del programa será la siguiente: primero se crea el juego. Luego habrá un
bucle mientras no gane ninguno de los dos y, dentro del bucle, primero piensa la máquina, luego
hace su jugada, y se comprueba si ha ganado. Si no ha ganado, introduces los valores de tu jugada
(fila y cantidad de palillos) y juegas. Se comprueba si has ganado y así sucesivamente hasta que gane
uno de los dos.
Desconocemos los atributos de la clase Nim ya que son privados, pero sus métodos públicos son:
- Constructor () por defecto. Se crea una instancia del juego.
- boolean juega (int fila, int cant). Valida los datos y retira la cantidad de palillos indicada de la
fila indicada devolviendo true. Devuelve false si los parámetros no son válidos. Las filas van
de 0 a 2.
- boolean fin() devuelve true si se alcanzó el final del juego (un solo palillo en el tablero).
- int piensa (). Se invoca para que la máquina piensa su jugada y devuelve un entero cuyas
decenas son la fila (0,1,2) y las unidades son los palillos que retira (entre 1 y 7), pero no implica
que haga dicha jugada. Lo normal será llamar luego al método juega con los parámetros
obtenidos con piensa().
*/

package casa;


public class Nim {
    private int[] filas; // Representa las filas de palillos: 3, 5, y 7 inicialmente.

    public Nim() {
        // Constructor: Inicializa las filas con 3, 5 y 7 palillos respectivamente.HE AÑADIDO 1 palillo en la fila 1, quedando 4 filas en total
        this.filas = new int[]{1, 3, 5, 7};
    }

    public boolean juega(int fila, int cant) {
        // Valida y realiza la jugada.
        if (fila < 0 || fila >= filas.length) {
            return false; // Fila inválida.
        }
        if (cant <= 0 || cant > filas[fila]) {
            return false; // Cantidad inválida.
        }

        filas[fila] -= cant; // Realiza la jugada.
        return true;
    }

    public boolean fin() {
        // Devuelve true si queda solo un palillo en el tablero.
        int totalPalillos = 0;
        for (int palillos : filas) {
            totalPalillos += palillos;
        }
        return totalPalillos == 1;
    }

    public int piensa() {
        // Genera el movimiento óptimo para la máquina.
        // Estrategia básica: si el tablero es impar (en términos de XOR), busca igualarlo.
        int xorTotal = 0;
        for (int palillos : filas) {
            xorTotal ^= palillos;
        }

        // Si no hay jugada ganadora evidente, retira el primer palillo válido.
        if (xorTotal == 0) {
            for (int i = 0; i < filas.length; i++) {
                if (filas[i] > 0) {
                    return i * 10 + 1; // Retira 1 palillo de la primera fila no vacía.
                }
            }
        }

        // Si hay jugada ganadora, realiza la jugada para igualar XOR a 0.
        for (int i = 0; i < filas.length; i++) {
            int deseado = filas[i] ^ xorTotal;
            if (deseado < filas[i]) {
                int cantidadARetirar = filas[i] - deseado;
                return i * 10 + cantidadARetirar;
            }
        }

        return 0; // Esto no debería ocurrir nunca si el tablero está bien definido.
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < filas.length; i++) {
        sb.append("Fila ").append(i + 1).append(": ");
        for (int j = 0; j < filas[i]; j++) {
            sb.append("| "); // Representa un palillo como "|".
        }
        sb.append("(").append(filas[i]).append(" palillos restantes)\n"); // Muestra el conteo.
    }
    return sb.toString();
}
}