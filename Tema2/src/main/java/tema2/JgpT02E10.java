/*
 * Realizar un programa al que se le introduzcan DIA, MES, AÑO, 
 * que verifique que los valores introducidos sean correctos, 
 * sin emplear las clases de fechas de Java. 
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int dia, mes, ano, ndias;

        System.out.println("Introduzca dia en formato numerico: ");
        dia = teclado.nextInt();
        System.out.println("Introduzca mes en formato numerico: ");
        mes = teclado.nextInt();
        System.out.println("Introduzca ano en formato numerico: ");
        ano = teclado.nextInt();

        ndias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 2 -> {
                if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default ->
                30;
        };
        if ((dia <= ndias) && (mes <= 12) && (dia > 0) && (mes > 0)) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("Introduzca la fecha correcta");
        }
    }
}
