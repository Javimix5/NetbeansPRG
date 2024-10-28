/*
 * Diseñar un algoritmo al que se le introduzcan las notas de los exámenes de 
 * una clase con decimales. Se introducirá –1 para indicar que no hay más notas. 
 * El algoritmo informará del total de notas introducidas, calculará la nota 
 * mínima, máxima , la media, si hay algún 5.0 exacto, y el porcentaje de 
 * aprobados. Hay que validar que estén entre 0 y 10.
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double nota;
        double sumaNotas = 0;
        double min = 10;
        double max = 0;
        int totalNotas = 0;
        int aprobado = 0;
        boolean exacto = false;

        System.out.println("Introduce las notas (introduce -1 para terminar):");
        while (true) {
            nota = teclado.nextDouble();
            if (nota == -1) {
                break;
            }
            if (nota >= 0 && nota <= 10) {
                totalNotas++;
                sumaNotas += nota;
                if (nota == 5.0) {
                    exacto = true;
                }
                if (nota >= 5.0) {
                    aprobado++;
                }
                if (nota < min) {
                    min = nota;
                }
                if (nota > max) {
                    max = nota;
                }
            } else {
                System.out.println("Nota no valida. Introduce un valor entre 0 y 10.");
            }
        }
        if (totalNotas > 0) {
            double media = sumaNotas / totalNotas;
            double porcentajeAprobados = (aprobado / (double) totalNotas) * 100;

            System.out.println("Total de notas introducidas: " + totalNotas);
            System.out.println("Nota minima: " + min);
            System.out.println("Nota maxima: " + max);
            System.out.println("Nota media: " + media);
            System.out.println("Alguna nota es 5.0: " + (exacto ? "Si" : "No"));
            System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        } else {
            System.out.println("No se introdujeron notas validas.");
        }

    }
}
