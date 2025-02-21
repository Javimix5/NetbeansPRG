package Main;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;
import pClasesApoyo.Dado;
import pClasesApoyo.DadoFalso;
import static java.lang.Math.*;

public class Ejercicio04 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Juguemos a los dados");
        System.out.println("Lanzamiento");
        int resultado = Dado.lanzar();

        System.out.println("Resultado lanzamiento " + resultado);

        double area = 2 * PI * resultado;

        System.out.printf("El area del circuolo cuyo radio es: " + resultado + " es:  %.2f", area);
        System.out.println("");

        System.out.println("Juguemos de nuevo");
        System.out.println("Elige un numero");
        int n = teclado.nextInt();
        System.out.println("Lanzamiento");
        resultado = DadoFalso.lanzar(n);
        System.out.println("Resultado del lanzamiento: " + resultado);

        area = 2 * PI * resultado;

        System.out.printf("El area del circuolo cuyo radio es: " + resultado + " es:  %.2f", area);

    }// Fin main

}// Fin clase
