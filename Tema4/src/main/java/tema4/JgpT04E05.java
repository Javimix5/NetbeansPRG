/*
 * 4.4. Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las 
siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre la ‘a’ y la ‘j’.
¡¡Pero sin letras repetidas!!
 */
package tema4;

import java.util.Random;
import java.util.Scanner;

public class JgpT04E05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Random random = new Random();

        String letraDisp = "abcdefghij";
        int largo = random.nextInt(6) + 5;
        char letra;
        int indice;

        StringBuilder password = new StringBuilder(largo);

        boolean[] letrasUsadas = new boolean[10];

        for (int i = 0; i < largo; i++) {

            do {
                indice = random.nextInt(10);
                letra = letraDisp.charAt(indice);
            } while (letrasUsadas[indice]);

            password.append(letra);
            letrasUsadas[indice] = true;
        }
        System.out.println("Password generada: " + password);

    }
}
