package tema5;

import java.util.Scanner;

public class JgpT05E03 {

    /*
* Fernando Parga Fernandez
* Ejercicio 3: Hacer una función llamada CalcularDiasMes que se le pase como parámetro un año y un mes 
* y devuelva los días que tiene ese mes, teniendo en cuenta los años bisiestos. A continuación, realizar 
* un programa al que se le introduzca una fecha y nos informe de los días pasados desde el 1 de enero 
* de ese año (no usar clases Java de fechas). 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes = 0;
        int año;

        System.out.println("Introduce un año: ");
        año = teclado.nextInt();
        do {
            System.out.println("Introduce un mes: ");
            mes = teclado.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("Mes no valido");
            }
        } while (mes < 1 || mes > 12);

        int ndias = CalcularDiaMes(año, mes);
        System.out.println("La cantidad de dias del año " + año + " del mes " + mes + " es de: " + ndias);

    }

    public static int CalcularDiaMes(int año, int mes) {

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
}
