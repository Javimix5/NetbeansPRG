package tema7;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Javier González Prados
 */
public class Primitiva {

        private int[] resultado;
    public static final int numero_Max = 49;
    public static final int bolas_Bombo = 6;

    public Primitiva() {
        resultado = generarCombinacionAleatoria();
    }

    // 1. Genera una combinación aleatoria de 6 números únicos entre 1 y 49
    private int[] generarCombinacionAleatoria() {
        Random random = new Random();
        int[] combinacion = new int[bolas_Bombo];
        for (int i = 0; i < bolas_Bombo; i++) {
            int numero;
            do {
                numero = random.nextInt(numero_Max) + 1;
            } while (contiene(combinacion, numero, i));
            combinacion[i] = numero;
        }
        Arrays.sort(combinacion);
        return combinacion;
    }

    // 2. Verifica si un número ya está en la combinación
    private boolean contiene(int[] arreglo, int numero, int limite) {
        for (int i = 0; i < limite; i++) {
            if (arreglo[i] == numero) {
                return true;
            }
        }
        return false;
    }

    // 3. Devuelve el número de aciertos entre la combinación ganadora y la jugada
    public int comprobarAciertos(int[] jugada) {
        int aciertos = 0;
        for (int numero : jugada) {
            for (int ganador : resultado) {
                if (numero == ganador) {
                    aciertos++;
                }
            }
        }
        return aciertos;
    }

    // 4. Método para imprimir la combinación ganadora
    public void mostrarResultado() {
        System.out.println("Combinacion ganadora: " + Arrays.toString(resultado));
    }

    // 5. Método auxiliar para generar un boleto aleatorio
    public static int[] generarBoletoAleatorio() {
        Random random = new Random();
        int[] boleto = new int[bolas_Bombo];
        for (int i = 0; i < bolas_Bombo; i++) {
            int numero;
            do {
                numero = random.nextInt(numero_Max) + 1;
            } while (estaEnBoleto(boleto, numero, i));
            boleto[i] = numero;
        }
        Arrays.sort(boleto);
        return boleto;
    }

    // 6. Verifica si un número ya está en el boleto
    private static boolean estaEnBoleto(int[] array, int numero, int limite) {
        for (int i = 0; i < limite; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
    }

}