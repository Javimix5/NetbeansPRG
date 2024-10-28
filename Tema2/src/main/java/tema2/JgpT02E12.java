/*
 * Realizar un programa al que se le introduzcan DIA, MES, AÑO, 
 * que calcule el día siguiente. Suponemos que los valores son correctos, 
 * sin emplear las clases de fechas de Java. 
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int dia1, mes1, ano1, ndias1;
        int dia2, mes2, ano2, ndias2;

        System.out.println("Introduzca la primera FECHA");
        System.out.println("Introduzca dia en formato numerico: ");
        dia1 = teclado.nextInt();
        System.out.println("Introduzca mes en formato numerico: ");
        mes1 = teclado.nextInt();
        System.out.println("Introduzca ano en formato numerico: ");
        ano1 = teclado.nextInt();

        System.out.println("Introduzca la segunda FECHA");
        System.out.println("Introduzca dia en formato numerico: ");
        dia2 = teclado.nextInt();
        System.out.println("Introduzca mes en formato numerico: ");
        mes2 = teclado.nextInt();
        System.out.println("Introduzca ano en formato numerico: ");
        ano2 = teclado.nextInt();

        ndias1 = switch (mes1) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 2 -> {
                if ((ano1 % 4 == 0) && (ano1 % 100 != 0) || (ano1 % 400 == 0)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default ->
                30;
        };

        ndias2 = switch (mes2) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 2 -> {
                if ((ano2 % 4 == 0) && (ano2 % 100 != 0) || (ano2 % 400 == 0)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default ->
                30;
        };
        if ((dia1 <= ndias1) && (mes1 <= 12) && (dia1 >= 0) && (mes1 >= 0) && (dia2 <= ndias2) && (mes2 <= 12) && (dia2 >= 0) && (mes2 >= 0) && ((ano1 > ano2) || ((mes1 > mes2) && (ano1 == ano2)) || ((dia1 > dia2) && (mes1 == mes2) && (ano1 == ano2)))) {
            System.out.println("El primer ano es mayor que el segundo ");
        } else {
        if ((dia1 <= ndias1) && (mes1 <= 12) && (dia1 >= 0) && (mes1 >= 0) && (dia2 <= ndias2) && (mes2 <= 12) && (dia2 >= 0) && (mes2 >= 0)) {
            System.out.println("El primer ano es menor que el segundo ");
        } else {
            System.out.println("Por favor, introduzca una fecha correcta");
            }
        }
    }
}
