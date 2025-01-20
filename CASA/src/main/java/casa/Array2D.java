package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class Array2D {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] dimension = new int[4][5];   //cada [] indica cuantas dimensiones, en este caso 2

        dimension[0][0] = 15;    //dimension (nombre array); [0] primer campo, en este caso la filaa; [] segundo campo, en este caso la columna
        dimension[0][1] = 20;
        dimension[0][2] = 30;
        dimension[0][3] = 40;
        dimension[0][4] = 9;

        dimension[1][0] = 56;
        dimension[1][1] = 8;
        dimension[1][2] = 10;
        dimension[1][3] = 55;
        dimension[1][4] = 44;

        dimension[2][0] = 20;
        dimension[2][1] = 21;
        dimension[2][2] = 22;
        dimension[2][3] = 25;
        dimension[2][4] = 32;

        dimension[3][0] = 40;
        dimension[3][1] = 41;
        dimension[3][2] = 12;
        dimension[3][3] = 15;
        dimension[3][4] = 18;

        for (int i = 0; i < 4; i++) { //en este caso recorre la primera dimension, en este caso la que va de 0 a 3

            System.out.println();   //para representar en forma de tabla

            for (int j = 0; j < 5; j++) {   //en este caso recorre la segunda dimension, en este caso la que va de 0 a 4

                System.out.print(dimension[i][j] + " ");

/* entrara en el bucle i para i=0, sigue con bucle j para j=0 (resultado la posición 0,0); 
   en este caso no sale del bucle y volverá a imprimir i=0,j=1 (resultado la posición 0,1). 
   Una vez llegue a 0,4 volverá al bucle i para i=1 y así continuamente hasta recorrer todas las posiciones*/

}

        }

    }// Fin main

}// Fin clase
