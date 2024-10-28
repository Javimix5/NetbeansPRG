/*
 * Realizar un programa que permita introducir el sexo (‘H’,’M’) y la edad de los 30 trabajadores 
de una fábrica. El programa debe obligar a que las edades que se introduzcan estén comprendidas 
entre 16 y 70 años. El programa nos mostrará la edad y el sexo del más joven y también mostrará la 
media de edad de las mujeres. Finalmente nos informará si hay alguno con más de 60 años. Si se 
introduce cero como edad el programa terminará en ese momento sin esperar a que introduzcan 
los 30 trabajadores.
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E24 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int edad;
        char sexo;
        int empleados = 0;
        int sumaMujer = 0;
        int mujeres = 0;
        int edadMasJoven = Integer.MAX_VALUE;
        char sexoMasJoven = ' ';
        boolean mayor = false;

        while (empleados < 30) {
            System.out.print("Introduce la edad del trabajador (0 para terminar): ");
            edad = teclado.nextInt();

            // Terminar si se introduce un 0
            if (edad == 0) {
                break;
            }

            // Validar que la edad esté entre 16 y 70
            if (edad < 16 || edad > 70) {
                System.out.println("La edad debe estar entre 16 y 70 aNos.");
                continue; // Pedir la edad nuevamente
            }

            // Pedir el sexo del trabajador
            System.out.print("Introduce el sexo del trabajador en mayusculas (H para hombre, M para mujer): ");
            sexo = teclado.next().toUpperCase().charAt(0);

            // Validar el sexo
            if (sexo != 'H' && sexo != 'M') {
                System.out.println("Error. Debe ser 'H' o 'M'.");
                continue; // Pedir el sexo nuevamente
            }

            // Verificar si es el más joven
            if (edad < edadMasJoven) {
                edadMasJoven = edad;
                sexoMasJoven = sexo;
            }

            // Sumar la edad de las mujeres para el cálculo de la media
            if (sexo == 'M') {
                sumaMujer += edad;
                mujeres++;
            }

            // Verificar si hay algún trabajador mayor de 60 años
            if (edad > 60) {
                mayor = true;
            }

            empleados++;
        }

        // Mostrar los resultados
        if (empleados > 0) {
            System.out.println("\nEl trabajador mas joven tiene " + edadMasJoven + " anos y es de sexo " + sexoMasJoven);

            if (mujeres > 0) {
                double mediaEdadMujeres = (double) sumaMujer / mujeres;
                System.out.printf("La media de edad de las mujeres es: %.2f anos\n", mediaEdadMujeres);
            } else {
                System.out.println("No se ingresaron mujeres.");
            }

            if (mayor) {
                System.out.println("Hay trabajadores con mas de 60 años.");
            } else {
                System.out.println("No hay trabajadores con mas de 60 años.");
            }
        } else {
            System.out.println("No se ingresaron datos.");
        }

    }
}