/*A partir de las clases Nim y Consola, crea un programa que juegue al NIM contra la máquina.
Se trata de un tablero con 3 filas de palillos, con 3, 5 y 7 palillos respectivamente. Dos jugadores por
turnos alternos (el usuario y la máquina) han de retirar palillos del tablero perdiendo el que se quede
el último palillo. En cada turno se pueden retirar uno o más palillos, pero solo de una misma fila.
Por lo tanto, la estructura del programa será la siguiente: primero se crea el juego. Luego habrá un
bucle mientras no gane ninguno de los dos y, dentro del bucle, primero piensa la máquina, luego
hace su jugada, y se comprueba si ha ganado. Si no ha ganado, introduces los valores de tu jugada
(fila y cantidad de palillos) y juegas. Se comprueba si has ganado y así sucesivamente hasta que gane
uno de los dos.
La clase Consola, tiene los siguientes métodos públicos estáticos:
- pintarTablero (Nim tablero). Se le pasa un tablero de Nim y lo pinta por consola.
- Int leerEntero(texto). Pide un valor por consola y valida que sea un entero de forma que si
mete letras o valores incorrectos no “casca” y vuelve a pedir que se introduzcan
correctamente. El texto que se pasa como parámetro es el que le dice al usuario lo que tiene
que introducir, así no hace falta meter antes un System.out.println. Ejemplo:
x=leerEntero(“introduzca fila”); hará internamente ya System.out.println (“introduzca fila”)
Hay que tener en cuenta que los usuarios hablamos de filas 1,2 y 3 mientras que la clase Nim habla
de filas 0,1 y 2.
*/

package casa;

import java.util.Scanner;

public class Consola {
    private static final Scanner scanner = new Scanner(System.in);

    public static void pintarTablero(Nim tablero) {
        // Aquí asumimos que la clase Nim tiene un método interno para devolver
        // el estado del tablero en forma de cadenas o una representación que puedas implementar.
        System.out.println("Representación del tablero actual:");
        System.out.println(tablero.toString());
        // Implementa aquí cómo se debería pintar el tablero según tu lógica interna de Nim.
    }

    public static int leerEntero(String texto) {
        int numero;
        while (true) {
            try {
                System.out.println(texto);
                numero = Integer.parseInt(scanner.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
            }
        }
    }
}
