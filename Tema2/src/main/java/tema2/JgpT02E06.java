/*
 * Realizar un programa que lea por teclado los dos conjuntos de coeficientes (a, b y c, y d, e y f) 
 * y calcule los valores para ‘x’ e ‘y’ según la fórmula descrita ¿Existen algunos casos para los 
 * cuales este algoritmo no funcione? Nota: cuando en matemáticas se escriben dos variables 
 * juntas, por ejemplo ‘ce’ quiere decir ‘c por e’. 
 * Solo hay que verificar que el denominador es distinto de cero
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a,b,c,d,e,f,x,y;
        double den;
        
        System.out.println("Vamos a resolver la siguiente operacion:\n ax+by=c\n dx+ey=f\n ");
        System.out.println("Introduce el valor de A: ");
        a = teclado.nextDouble();
        System.out.println("Introduce el valor de B: ");
        b = teclado.nextDouble();
        System.out.println("Introduce el valor de C: ");
        c = teclado.nextDouble();
        System.out.println("Introduce el valor de D: ");
        d = teclado.nextDouble();
        System.out.println("Introduce el valor de E: ");
        e = teclado.nextDouble();
        System.out.println("Introduce el valor de F: ");
        f = teclado.nextDouble();
             
        x = ((c * e) - (b * f)) / ((a * e) - (b * d));

        y = ((a * f) - (c * d)) / ((a * e) - (b * d));
        
        den = ((a * e) - (b * d));
        
        if (den != 0) {
            System.out.println("El denominador es distinto de 0");
            System.out.printf("El valor de X sera: %.2f \n", x);
            System.out.printf("El valor de Y sera: %.2f \n", y);
        } else System.out.println("El denominador es igual a 0");{
        
        /*Esta fórmula no sería validad para hacer el cálculo entre 0*/
        }
        }
}