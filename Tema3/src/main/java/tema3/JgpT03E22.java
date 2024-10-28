/*
 * Hacer un programa que permita calcular el sueldo final de los vendedores de un 
concesionario de coches. Para cada uno se introducirá: sueldo base, cantidad de horas extras 
realizadas y cantidad de ventas. El sueldo final será el sueldo base más las horas extras (se pagan a 
100€ la hora) y un plus en función de las ventas: entre 10 y 20 ventas 500€, entre 21 y 30 ventas 
1000€ y si supera las 30 ventas  1300 €. Después de tratar cada vendedor se preguntará al usuario 
y hay más vendedores a tratar, finalizando el programa si contesta negativamente. Al final el 
programa mostrará el total de ventas y el salario final del que más ventas ha realizado (supón que al 
menos introducen los datos de un empleado).  
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E22 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int totalVentas = 0;
        double mayorSalario = 0;
        int maxVentas = 0;
        String nombreMayorVentas = "";

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el nombre del vendedor: ");
            String nombre = teclado.nextLine();

            System.out.print("Ingrese el sueldo base: ");
            double sueldo = teclado.nextDouble();

            System.out.print("Ingrese la cantidad de horas extras realizadas: ");
            int horas = teclado.nextInt();

            System.out.print("Ingrese la cantidad de ventas realizadas: ");
            int ventas = teclado.nextInt();

            double pagoHorasExtras = horas * 100;

            double plusVentas = 0;
            if (ventas >= 10 && ventas <= 20) {
                plusVentas = 500;
            } else if (ventas >= 21 && ventas <= 30) {
                plusVentas = 1000;
            } else if (ventas > 30) {
                plusVentas = 1300;
            }
            double sueldoFinal = sueldo + pagoHorasExtras + plusVentas;

            System.out.println("El sueldo final de " + nombre + " es: " + sueldoFinal + " Euros");

            totalVentas += ventas;

            if (ventas > maxVentas) {
                maxVentas = ventas;
                mayorSalario = sueldoFinal;
                nombreMayorVentas = nombre;
            }
            System.out.print("Hay mas vendedores? (si/no): ");
            teclado.nextLine();
            String respuesta = teclado.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }
        System.out.println("El total de ventas realizadas por todos los vendedores es: " + totalVentas);
        System.out.println("El vendedor con mas ventas es " + nombreMayorVentas + " con un salario final de " + mayorSalario + " Euros.");

    }
}
