package tema5;

import java.util.Scanner;

public class JgpT05E04 {

    /*
* Fernando Parga Fernandez
* Ejercicio 4: Partiendo de la función del programa anterior, hacer un programa al que se le introduzcan 
* dos fechas del mismo año y nos informe de los días comprendidos entre ellas (no usar clases Java 
* de fechas).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes1 = 0;
        int mes2 = 0;
        int año;
        int dia1, dia2;
        int ndias1 = 0;
        int ndias2 = 0;

        System.out.println("Introduce un año: ");
        año = teclado.nextInt();
        do {
            System.out.println("Introduce un mes: ");
            mes1 = teclado.nextInt();
            if (mes1 < 1 || mes1 > 12) {
                System.out.println("Mes no valido");
            }
        } while (mes1 < 1 || mes1 > 12);
        do {
            System.out.println("Introduce un dia: ");
            dia1 = teclado.nextInt();
            ndias1 = CalcularDiasMes(año, mes1);
            if (dia1 < 1 || dia1 > ndias1) {
                System.out.println("Dia no valido");
            }
        } while (dia1 < 1 || dia1 >= ndias1);

        do {
            System.out.println("Introduce un segundo mes: ");
            mes2 = teclado.nextInt();
            if (mes2 < 1 || mes2 > 12) {
                System.out.println("Mes no valido");
            }
        } while (mes2 < 1 || mes2 > 12);
        do {
            System.out.println("Introduce un segundo dia: ");
            dia2 = teclado.nextInt();
            ndias2 = CalcularDiasMes(año, mes2);
            if (dia2 < 1 || dia2 > ndias2) {
                System.out.println("Dia no valido");
            }
        } while (dia2 < 1 || dia2 >= ndias2);

        int diferencia = Math.abs(CalculoDiasTotales(año, mes1, dia1) - CalculoDiasTotales(año, mes2, dia2));
        
        System.out.println("De una fecha a otra hay una diferencia de " + diferencia + " dias.");
    }

    public static int CalcularDiasMes(int año, int mes) {

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2: {
                if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            }
            default:
                return 30;
        }

    }

    public static int CalculoDiasTotales(int año, int mes, int dia) {
        int diasTotales = 0;
        for (int i = 1; i < mes; i++) {
            diasTotales += CalcularDiasMes(año, mes);
        }
        return (diasTotales+dia);
        
    }
}
