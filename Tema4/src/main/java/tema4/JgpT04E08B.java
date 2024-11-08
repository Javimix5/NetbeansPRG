/*
 * 4.12.    
 */
package tema4;

import java.util.Scanner;

public class JgpT04E08B {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        
        String cadena = teclado.nextLine();
        
        StringBuilder cadena2 = new StringBuilder(cadena);
        
        System.out.println("Introduce la posicion para reemplazar: ");
        int posicion = teclado.nextInt();
        
        System.out.println("Introduce la nueva letra: ");
        char letra = teclado.next().charAt(0);
        
        if (posicion <0 || posicion >= cadena.length()) {
            System.out.println("Error de posicion");
        } else {
            cadena2.setCharAt(posicion, letra);
            System.out.println("Cadena resultante: " + cadena2);
        }
        }

    }

