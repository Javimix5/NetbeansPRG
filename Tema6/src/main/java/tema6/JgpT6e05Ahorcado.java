/*
 * 6.5. A partir de la clase Ahorcado que te proporcionará el profesor, crea un programa que permita 
al usuario jugar al ahorcado. Desconocemos los atributos de la clase Ahorcado ya que son privados, 
pero sus métodos públicos son: 
- Constructor(String txtAdivinar, String txtPista). Crea el juego con la frase a adivinar y con un texto de 
pista para el jugador. 
- Constructor(String txtAdivinar). Crea el juego con la frase a adivinar, sin pistas. 
- boolean probarLetra (char x). Comprueba si la letra pasada como parámetro está en la frase a adivinar, 
en caso afirmativo, devuelve true¸ sino false.
- boolean adivinada(). Devuelve true si se ha adivinado la frase, false en caso contrario. 
- boolean perdio(). Devuelve true si se ha llegado al número máximo de intentos sin adivinar la frase, 
false en caso contrario. 
- char leerLetra (). Pide al usuario por consola una letra y devuelve dicha letra. 
- void pintar (). Dibuja un “tablero” en la consola, con el estado del juego. 
Como en ejercicios anteriores empezaremos creando una instancia de Ahorcado con 
uno de los constructores que tiene. Luego habrá un bucle para jugar mientras no 
adivine la palabra secreta y no pierda. Dentro del bucle leeremos la letra por 
teclado, probará si es correcta o no y pintará el tablero.

 */
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
import java.util.Scanner;

public class JgpT6e05Ahorcado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al juego del Ahorcado!");
        System.out.print("Introduce la palabra o frase a adivinar: ");
        String txtAdivinar = teclado.nextLine();

        System.out.print("¿Deseas proporcionar una pista? (sí/no): ");
        String deseaPista = teclado.nextLine().trim().toLowerCase();

        Ahorcado juego; // Declaración de la instancia del juego

        if (deseaPista.equals("sí")) {
            System.out.print("Introduce la pista: ");
            String txtPista = teclado.nextLine();
            juego = new Ahorcado(txtAdivinar, txtPista); // Usar constructor con pista
        } else {
            juego = new Ahorcado(txtAdivinar); // Usar constructor sin pista
        }

        // Bucle principal del juego
        while (!juego.adivinada() && !juego.perdio()) {
            System.out.println("\nEstado del juego:");
            juego.pintar(); // Mostrar el tablero
            char letra = juego.leerLetra(); // Leer una letra del jugador

            if (juego.probarLetra(letra)) {
                System.out.println("¡Correcto! La letra está en la frase.");
            } else {
                System.out.println("Incorrecto. La letra no está en la frase.");
            }
        }

        // Mostrar el resultado final
        System.out.println("\nEstado final del juego:");
        juego.pintar();

        if (juego.adivinada()) {
            System.out.println("¡Felicidades! Has adivinado la frase.");
        } else if (juego.perdio()) {
            System.out.println("Lo siento, has perdido. Mejor suerte la próxima vez.");
        }
    }
}
