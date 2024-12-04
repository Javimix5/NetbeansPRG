/*
 * 6.17 Haz el juego del “MasterMind” de la siguiente forma: la máquina genera al azar 4 
dígitos entre 0 y 10 sin repetidos que es lo que se tendrá que adivinar. El jugador introducirá 
combinaciones de 4 dígitos también sin repetidos hasta que lo adivine. Cada vez que introduce una 
combinación el sistema le dirá cuántos dígitos de los introducidos están en la combinación a 
descubrir distinguiendo si están en la misma posición o si están en la combinación, pero en otra 
posición. Tiene 10 intentos para averiguarlo. 
Ejemplo: combinación a adivinar: 9871 intento: 8471: 2 dígitos bien colocados, 1 dígito mal colocado 
El sistema validará que las combinaciones introducidas sean de 4 posiciones y sin repetidos. Haz una 
clase con la lógica del juego y un programa que la utilice pero solo como intermediario entre la clase
y el jugador. Trata también de hacer el ejercicio lo suficientemente flexible para que a futuro se 
pudiese fácilmente cambiar a combinaciones de 5 dígitos (ó 6 ó 7 etc.) y también cambiar el número 
de intentos. 
*/
package tema6;

import java.util.Scanner;

/**
 *
 * @author javier.gonzalezprado
 */
public class JgpT6e17MasterMind {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Configuración del juego
        int combinationSize = 4;
        int maxAttempts = 10;
        MasterMind game = new MasterMind(combinationSize, maxAttempts);
        System.out.println("Bienvenido a MasterMind!");
        System.out.println("Debes adivinar una combinacion de " + combinationSize + " digitos unicos entre 0 y 9.");
        System.out.println("Tienes " + maxAttempts + " intentos. Buena suerte!");
        int adivinado = 0;
        boolean guessed = false;
        while (adivinado < maxAttempts && !guessed) {
            System.out.print("Intento " + (adivinado + 1) + ": ");
            String input = teclado.nextLine();
            // Validar entrada
            if (!game.isValidInput(input)) {
                System.out.println("Entrada inválida. Debe tener " + combinationSize + " digitos unicos.");
                continue;
            }
            // Comprobar combinación
            String result = game.checkCombinacion(input);
            System.out.println(result);
            if (input.equals(game.getCombinacionSecreta())) {
                guessed = true;
                System.out.println("Felicidades! Adivinaste la combinacion.");
            }
            adivinado++;
        }
        if (!guessed) {
            System.out.println("Se acabaron los intentos! La combinacion era: " + game.getCombinacionSecreta());

        }
    }
}
