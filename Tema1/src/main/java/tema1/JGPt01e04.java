/*
* Calculos diversos
* Autor: Javier González Prados
* Fecha 13-SEP-2024
 */
package tema1;

import java.util.Scanner;

public class JGPt01e04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d, e;
        float aprobado, nota;

        System.out.println("Introduce el numero de alumnos: ");
        a = teclado.nextInt();
        System.out.println("Introduce el numero de suspensos: ");
        b = teclado.nextInt();
        System.out.println("Introduce el numero de suficientes: ");
        c = teclado.nextInt();
        System.out.println("Introduce el numero de notables: ");
        d = teclado.nextInt();
        System.out.println("Introduce el numero de sobresalientes: ");
        e = teclado.nextInt();

        aprobado = (float) ((c + d + e) * 100) / a;
        System.out.println("Porcentaje de aprobados: " + aprobado + "%");
                
        nota = (float) ((d + e) * 100) / a;
        System.out.println("Porcentajes de notables y sobresalientes: " + nota + "%");
        

    }
}
