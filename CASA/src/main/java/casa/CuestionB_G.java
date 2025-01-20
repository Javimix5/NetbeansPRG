package casa;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CuestionB_G {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {                   //Este bucle llena el ArrayList con 10,000 números aleatorios entre 1 y 1000.
            a.add((int) (Math.random() * 1000) + 1);
        }
        /*for (int i = 0; i < a.size(); i++) {                //Este bucle recorre el ArrayList y elimina los elementos que están en el rango de 250 a 750 (inclusive).
            if (a.get(i) >= 250 & a.get(i) <= 750) {
                a.remove(i);
            }*/
        for (int i = a.size() - 1; i >= 0; i--) {               //Debido a un error en la parte de eliminar ente 25 y 750 (seguían mostrando valores entre ambos)
            if (a.get(i) >= 250 && a.get(i) <= 750) {           //Se debe de recorrer el ArrayList de forma inversa para que no afecte a los indices restantes
                a.remove(i); 
            } 
        }

        System.out.println(a);
        
//Análisis Estadístico
/*Dado que los números se generan aleatoriamente entre 1 y 1000, podemos calcular la probabilidad de que un 
número esté en el rango de 250 a 750. Este rango incluye 501 números (750 - 250 + 1).
La probabilidad de que un número esté en este rango es:

501/1000 = 0.501

Por lo tanto, aproximadamente el 50.1% de los números estarán en el rango de 250 a 750 y serán eliminados.

Inicialmente, el ArrayList tiene 10,000 elementos. Si eliminamos aproximadamente el 50.1% de ellos, el 
número de elementos restantes será:

10000×(1−0.501)=10000×0.499=4990

Estadísticamente hablando, el ArrayList tendrá aproximadamente 4990 elementos después de ejecutar el código.*/

    }// Fin main

}// Fin clase
