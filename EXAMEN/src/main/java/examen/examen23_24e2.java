/*
 * Realiza un programa que pida al usuario una frase e imprima por pantalla la frase invertida, haciendo uso de una función. Evita el uso de arrays y del metodo reverse()

1.Se define la funcion invertirFrase que toma una cadena como entrada y utiliza un bucle para construir una nueva cadena con los caracterres invertidos
2.La función se llama correctamente
3.La salida es correcta
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author javier.gonzalezprado
 */
public class examen23_24e2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase para invertir:");
        String frase = teclado.next();

        System.out.println(invertirFrase(frase));

    }

    public static String invertirFrase(String frase) {
        String cadenaInvertida = "";

        for (int i = (frase.length()-1); i >= 0; i--) {
            cadenaInvertida += frase.charAt(i);
        }
        return cadenaInvertida;
    }

}
