/*
 * 6.13. Realiza un juego de la ruleta rusa para dos jugadores. La pistola tiene 6 huecos en la recámara 
pero solo una bala. Al empezar la partida se genera una posición al azar de la recámara para la bala 
de forma que puede salir en el primer disparo, en el segundo, etc. hasta el sexto. Los jugadores irán 
disparando sucesivamente hasta que uno de los dos se muera. Crea una clase Pistola con los 
atributos y métodos que la definen. 
*/
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */

import java.util.Scanner;

public class JgpT6e13RuletaRusa {

static Scanner teclado = new Scanner(System.in, "ISO-8859-1"); 


    public static void main(String[] args) {
        System.out.println("Imos xogar a Ruleta Rusa!");
        System.out.println("Introduce o nome do primeiro xogador:");
        String xogador1 = teclado.nextLine();
        System.out.println("Introduce o nome do segundo xogador:");
        String xogador2 = teclado.nextLine();
        RuletaRusa Pistola = new RuletaRusa(xogador1, xogador2);
        Pistola.xerarBala();
        boolean finDoXogo = Pistola.pegarTiro();
        while (!finDoXogo) {
            finDoXogo = Pistola.pegarTiro();
        }
    }
}
