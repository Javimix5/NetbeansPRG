/*
 * 4.8. Realizar un programa que solicite una cadena, un número que indica una posición de la 
 * cadena y una letra. El programa reemplazará sobre la misma cadena, el carácter que hubiera en la 
 * posición indicada por la letra introducida. Hacer dos versiones, la primera con String y otra con 
 * StringBuilder   
 */
package tema4;

import java.util.Scanner;

public class JgpT04E08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();
        
        System.out.print("Introduce un numero para indicar una posicion de la cadena: ");
        int posicion = teclado.nextInt();
        
        System.out.print("Introduce un caracter: ");
        char letra = teclado.next().charAt(0);
        
        String cadena2 = cadena.substring(posicion);
        
        if (posicion < 0 || posicion >= cadena.length()) {
            System.out.println("La posicion ingresada no es valida.");
        } else {
            String nuevaCadena = cadena.substring(0,posicion -1) + letra + cadena.substring(posicion);
            System.out.println("Cadena resultante: " + nuevaCadena);
        }
    }
}
