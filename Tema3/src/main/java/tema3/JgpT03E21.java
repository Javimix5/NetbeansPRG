/*
 * La serie de Fibonacci se compone a partir de números naturales, empezando por 0 y 1, y 
construyendo cada nuevo número de la serie como la suma de los dos anteriores elementos de la 
serie, así pues, el tercero sería 1 (es 0 +1), el siguiente 2 (1+1), luego 3 (2+1), luego 5 (3+2), 8 (5+3) y 
así sucesivamente. El siguiente programa pretende mostrar 12 primeros números de esta serie 
¿Funciona correctamente? Es decir, muestra: 0,1,1,2,3,5,8,13,21,34,55,89. Si no es así, corrígelo. 
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E21 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int ant = 0, ant2 = 1, num;
        
        for (int i = 1; i <= 12; i++) {
            System.out.println(ant);
            
            num = ant + ant2;
            
            ant = ant2;  ant2 = num;
        }
    }
}
/*El error estaba en varios puntos:

int ant=1, ant2=0, num; 
 for (int i=1; i<=12; i++){ 
 num = ant + ant2; 
 System.out.println(num); 
 ant = num; ant2 = ant; 


-las variables estaban intercambiadas ant =1 y ant2 = 0
-la linea de system.out.println(num) no era la correcta y deberia de estar 
antes de la suma
- la lines ant = num y ant2 = ant eran erroneas
*/
