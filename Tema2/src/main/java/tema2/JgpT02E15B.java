/*
 * Programa que pida 2 numeros INT sobre sendas variables llamadas A y B
 * //if (a/b==0 && b !=0) {r = a/b; System.out.println(r);}
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E15B {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

int a,b,r;

System.out.println("Introduce valor A: ");
a = teclado.nextInt();
System.out.println("Introduce valor B: ");
b = teclado.nextInt();

if (a/b==0 && b !=0) {r = a/b; System.out.println(r);}


/*Esta segunda versión, al estar invertida la condicional, primero hace la división sin comprobar el valor de B, y si esta vuelve a ser
 0, esta vez si dará error*/

    }
}