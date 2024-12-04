/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
