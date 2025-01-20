/*
 * Condicional Cuadrado y cubo
 *Autor: Javier González Prados
 */

package casa;
import java.util.Scanner;

public class CasaE01 {

    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int res=0, res2=0;
        
        System.out.println("Introduce un número");
        int n = teclado.nextInt();
        
        if (n <= 100 &&  n > 0) {
            res = n * n;            
            System.out.println("Resultado (cuadrado): " + res);
            if (n <20 || n % 2 == 0) {
                res2 = n * n * n;
                System.out.println("Resultado (cubo): " + res2);                         
            }
        } else {
            System.out.println("Número muy grande");
            System.out.println("Introduzca un número más pequeño");
        }
                
    }
}
