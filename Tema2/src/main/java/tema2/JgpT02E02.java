/*
 * Programa que Lea tres números enteros y haga diferentes operaciones 
 * según criterios
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;
        int multi, suma, sumaMulti;

        System.out.println("Introduce el primer numero entero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero entero: ");
        num2 = teclado.nextInt();
        System.out.println("Introduce el tercer numero entero: ");
        num3 = teclado.nextInt();

        if ((num1 < 0) && (num2 < 0) && (num3 < 0))
        {   multi = num1 * num2 * num3;
            System.out.println("Todos son negativos, por lo tanto se multiplican. El resultado es: " + multi);

        }else if ((num1 < 0 && num2 < 0 && num3 > 0) || (num1 < 0 && num2 > 0 && num3 < 0) || (num1 > 0 && num2 < 0 && num3 < 0)){
            suma = num1 + num2 + num3;
            System.out.println("Al menos uno es negativo, pero no todos, se suman. El resultado es: " + suma);

        } else {sumaMulti = (num1 + num2) * num3;
            System.out.println("Todos son positivos, por lo tanto se multiplican dos y se multiplica por el tercero. El resultado es: " + sumaMulti);}
    }
}
