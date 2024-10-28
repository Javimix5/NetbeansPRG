/*
 * Diseña un algoritmo al que se le introduzca el día (1-7) y la hora (9-14), 
 * verifique la entrada y nos informe si hay bus o no
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numDia, numHora;

        System.out.println("Buenos dias, introduzca primero el dia de la semana con un numero (siendo del 1 Lunes al 7 Domingo ");
        numDia = teclado.nextInt();
        System.out.println("Introduzca la hora entre las 9 y las 14 horas: ");
        numHora = teclado.nextInt();

        switch (numDia) {
            case 1 -> {
                if((numHora == 10) || (numHora == 14)){
                System.out.println("El lunes hay bus a esa hora");
                } else {
                System.out.println("El lunes a esa hora no hay bus");
                    }
            }
            case 2 -> {
                if((numHora == 10) || (numHora == 14)){
                System.out.println("El martes hay bus a esa hora");
                } else {
                System.out.println("El martes a esa hora no hay bus");
                    }
            }
            case 3 -> {
                if((numHora == 10) || (numHora == 14)){
                System.out.println("El miercoles hay bus a esa hora");
                } else {
                System.out.println("El miercoles a esa hora no hay bus");
                    }
            }
            case 4 -> {
                if((numHora == 10) || (numHora == 12) || (numHora == 14)){
                System.out.println("El jueves hay bus a esa hora");
                } else {
                System.out.println("El jueves a esa hora no hay bus");
                    }
            }
            case 5 -> {
                if((numHora == 10) || (numHora == 14)){
                System.out.println("El viernes hay bus a esa hora");
            } else {
                System.out.println("El viernes a esa hora no hay bus");
                    }
            }
            case 6 -> {
                if((numHora == 10) || (numHora == 14)){
                System.out.println("El sabadoes hay bus a esa hora");
            } else {
                System.out.println("El sabadoes a esa hora no hay bus");
                    }
            }
            default -> System.out.println("El domingo hay bus a esa hora");
        }
    }
}
