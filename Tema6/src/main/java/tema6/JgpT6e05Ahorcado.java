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

        System.out.println("Vamos a jugar al Ahorcado");
        
    }

}
