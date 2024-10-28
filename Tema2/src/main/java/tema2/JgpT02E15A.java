/*
 * Programa que pida 2 numeros INT sobre sendas variables llamadas A y B
 * if (b !=0 && a/b==0) {r = a/b, System.out.println(r);}
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E15A {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

int a,b,r;

System.out.println("Introduce valor A: ");
a = teclado.nextInt();
System.out.println("Introduce valor B: ");
b = teclado.nextInt();

if (b !=0 && a/b==0) {r = a/b; System.out.println(r);}

/*Lo que pasa es que se lee primero lo que está a la izquierda del &&, por tanto en la primera versión
comprueba si B no es igual a 0, si lo es, detiene el código*/

    }
}