/*
 * Realizar un programa al que se le introduzcan DIA, MES, AÑO, 
 * que calcule el día siguiente. Suponemos que los valores son correctos, 
 * sin emplear las clases de fechas de Java. 
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int dia,mes,ano,ndias;
        int newDia,newMes,newAno;

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
        if ((dia < ndias) && (mes <=12) && (dia > 0) && (mes > 0)) {
            newDia = dia + 1;
            newMes = mes;
            newAno = ano;
            System.out.println("Manana sera dia " + newDia + " del mes " + newMes + " del ano " + newAno);
        } else {
               }
        if ((dia == ndias) && (mes < 12) && (dia > 0) && (mes > 0)) {
            newDia = 1;
            newMes = mes + 1;
            newAno = ano;
            System.out.println("Manana sera dia " + newDia + " del mes " + newMes + " del ano " + newAno);
        } else {
               }
        if ((dia == ndias) && (mes == 12) && (dia > 0) && (mes > 0)) {
            newDia =  1;
            newMes = 1;
            newAno = ano + 1;        
            System.out.println("Manana sera dia " + newDia + " del mes " + newMes + " del ano " + newAno);
        } else {
            System.out.println("Introduzca la fecha correcta");
        }
    }
}
