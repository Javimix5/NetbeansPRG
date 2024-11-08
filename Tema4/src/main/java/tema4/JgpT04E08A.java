/*
 * 4.12.    
 */
package tema4;

import java.util.Scanner;

public class JgpT04E08A {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Iniciamos el Ejercicio en su Versión con String//
//Pedimos un Texto para Añadirlo a una Cadena//
        System.out.println("Escribe un texto para agregarlo en una cadena: ");

        String cad1 = teclado.nextLine();
//Ahora pedimos un numero que indique una posición de la cadena en cuestión//
        System.out.println("De acuerdo, ahora un numero que indique una posicion de esa cadena: ");
        int num = teclado.nextInt();
        int longitud = cad1.length();

//Comparamos si el numero es menor que la longitud maxima de la Cadena y Que no sea Negativo//
        if (num < longitud && num >= 0) {
            char posicion = cad1.charAt(num);
            System.out.println("La posicion numerada indica esta parte del texto: " + posicion);
        } else {
            System.out.println("Esa posicion supera el largo del texto o es negativa,el caso es que no es valida");
        }

//Una vez se cumple la condicion anterior y el usuario conoce la letra de la posicion seleccionada//
        System.out.println("Bien, ahora que tenemos la posicion, ingresa un caracter, una letra para que sustituya a la de esa posicion: ");
        String nuevaLetra = teclado.next();

//Comprobamos que la Longitud de esa Nueva Letra sea 1 nada mas, porque es un unico caracter//
        if (nuevaLetra.length() == 1) {
            String nuevoTexto = cad1.substring(0, num) + nuevaLetra + cad1.substring(num + 1);
            System.out.println("El nuevo texto es: " + nuevoTexto);
        } else {
            System.out.println("Por favor, ingrese un solo caracter");
        }

    }
}
