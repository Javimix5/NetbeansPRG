/*
 * 4.4. Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las 
siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre la ‘a’ y la ‘j’.  
 */
package tema4;

import java.util.Random;
import java.util.Scanner;

public class JgpT04E04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Random random = new Random();

        int largo = random.nextInt(6) + 5;

        StringBuilder password = new StringBuilder(largo);

        for (int i = 0; i < largo; i++) {
            char letra = (char) (random.nextInt(10) + 'a');
            password.append(letra);
        }
        System.out.println("Password generada: " + password);

    }
}
