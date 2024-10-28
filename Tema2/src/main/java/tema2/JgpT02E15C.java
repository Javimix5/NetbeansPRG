/*
 * Programa que pida 2 numeros INT sobre sendas variables llamadas A y B
 * if (b !=0 & a/b==0) {r = a/b; System.out.println(r);}
 * Autor: Javier González Prados
 */
package tema2;

import java.util.Scanner;

public class JgpT02E15C {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

int a,b,r;

System.out.println("Introduce valor A: ");
a = teclado.nextInt();
System.out.println("Introduce valor B: ");
b = teclado.nextInt();

if (b !=0 & a/b==0) {r = a/b; System.out.println(r);}


/*Esta tercera versión, que usa & en lugar de &&, lee ambos lados del & y detecta la división igual que la versión 2, por
tanto si el B es igual a 0, también saltará error fatal*/

    }
}