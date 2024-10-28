/*
 * Indica la funcionalidad del siguiente programa. ¿Tiene algún error?¿Falta 
 * alguna llave? ¿Podrías reducir el recorrido del for para que el programa sea 
 * más rápido, manteniendo su funcionalidad?
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E07 {

    public static void main(String[] args) {

        int num;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero natural entre 1 y 1000: ");
        num = teclado.nextInt();

        if ((num < 0) || (num > 1000)) {
            System.out.println("Numero incorrecto.");
        } else {
            for (int i = num; i >= 1; i--) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
/* Los errores son: 
-Faltan las llaves para el funcionamiento
-El && no permite la ejecución correcta, deberá ser un ||
-Faltan ()
-En la parte del for, no podria ser num >= 1 sino sería i >= 1
*/