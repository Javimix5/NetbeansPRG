package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class Array2D_B {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] dimension ={
            
        {15,20,30,40,9},
        {56,8,10,55,44},
        {20,21,22,25,32},
        {40,41,12,15,18}      
        
    };   

        for (int i = 0; i < 4; i++) { //en este caso recorre la primera dimension, en este caso la que va de 0 a 3

        //otra opcion sería for(int[]fila:dimension);
            
            System.out.println();   //para representar en forma de tabla

            for (int j = 0; j < 5; j++) {   //en este caso recorre la segunda dimension, en este caso la que va de 0 a 4

            //otra opcion sería for(int[]columna:fila);
            //sout (sin ln) (columna + " ");
                
                System.out.print(dimension[i][j] + " ");

/* entrara en el bucle i para i=0, sigue con bucle j para j=0 (resultado la posición 0,0); 
   en este caso no sale del bucle y volverá a imprimir i=0,j=1 (resultado la posición 0,1). 
   Una vez llegue a 0,4 volverá al bucle i para i=1 y así continuamente hasta recorrer todas las posiciones*/

}

        }

    }// Fin main

}// Fin clase
