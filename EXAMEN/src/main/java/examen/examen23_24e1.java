/*
 * Realiza un programa que pida al usuario un nº menor que 50 y que haga lo siguiente:
a) Busque los multiplos de 7 que hay entre el cero y ese numero.
b) Sume los multiplos anteriores
c) Calcule la raiz cuadrada de la suma anterior
d) Divida la raiz cuadrada anterior entre el numero total de multiplos de 7 encontrados en el primer paso
e) Devuelva el resultado anterior redondeado a 3 decimales

1.El programa pide un numero repetidamente hasta que el valor sea menor a 50
2.El programa encuentra todos los multiplos de 7 y los acumula en una variable
3.El programa calcula correctamente la raiz cuadrada
4.El programa calcula correctamente el numero total de multiplos de 7
5.El programa devuelve el resultado redondeado a 3 decimales
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author javier.gonzalezprado
 */
public class examen23_24e1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double num = 0;
        int sumaMultiplo = 0;
        double multiplos = 0;

        do {
            System.out.println("Introduce un numero menor a 50");
            num = teclado.nextDouble();
        } while (num > 50 || num < 0);

//No saldra del bucle hasta que se cumpla        
        for (int i = 0; i <= num; i++) {
            if (i % 7 == 0) {
                sumaMultiplo += i;
                multiplos++;
            }
        }
        System.out.println("La suma de los multiplos del numero " + num + " es " + sumaMultiplo);

        double raiz = Math.sqrt(sumaMultiplo);

        System.out.println("Su raiz cuadrada es: " + raiz);

        double division = (raiz / multiplos);

        System.out.println("El resultado de la division es: " + division);

        System.out.printf("El resultado de la disivion redondeado a 3 decimales es: %.3f ", division);
    }

}
