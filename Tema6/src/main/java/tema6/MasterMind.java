/*
 * Clase Mater Mind
 */
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
import java.util.Random;

public class MasterMind {
    
private final String combinacionSecreta;
    private final int maximoIntentos;
    private final int tamañoCombinacion;

    public MasterMind(int combinationSize, int maxAttempts) {
        this.tamañoCombinacion = combinationSize;
        this.maximoIntentos = maxAttempts;
        this.combinacionSecreta = generarCombinacion();
    }

    // Genera una combinación secreta de números únicos como cadena
    private String generarCombinacion() {
        StringBuilder combinacion = new StringBuilder();
        Random random = new Random();

        while (combinacion.length() < tamañoCombinacion) {
            int digit = random.nextInt(10);
            if (combinacion.indexOf(String.valueOf(digit)) == -1) { // Asegurar que el dígito no se repita
                combinacion.append(digit);
            }
        }
        return combinacion.toString();
    }

    // Verifica si la entrada es válida (tamaño correcto y sin repetidos)
    public boolean isValidInput(String input) {
        if (input.length() != tamañoCombinacion) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)) || input.indexOf(input.charAt(i)) != input.lastIndexOf(input.charAt(i))) {
                return false; // Detección de dígitos repetidos o no numéricos
            }
        }
        return true;
    }

    // Compara la combinación del jugador con la secreta
    public String checkCombinacion(String input) {
        int correctPosition = 0;
        int wrongPosition = 0;

        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            if (combinacionSecreta.charAt(i) == digit) {
                correctPosition++;
            } else if (combinacionSecreta.indexOf(digit) != -1) {
                wrongPosition++;
            }
        }

        return correctPosition + " dígitos bien colocados, " + wrongPosition + " dígitos mal colocados.";
    }

    // Devuelve la combinación secreta (para mostrar al final del juego)
    public String getCombinacionSecreta() {
        return combinacionSecreta;
    }

    // Devuelve el número máximo de intentos
    public int getMaximoIntentos() {
        return maximoIntentos;
    }

    // Devuelve el tamaño de la combinación
    public int getTamañoCombinacion() {
        return tamañoCombinacion;
    }
}
