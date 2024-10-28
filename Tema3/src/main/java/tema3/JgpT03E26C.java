/*
 * Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos: 
 a.)        b.)     c.)         d.) 
0000000000  1       1111111111  9 
1111111111  22      222222222   98 
2222222222  333     33333333    987 
3333333333  4444    4444444     9876
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E26C {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int n=1;
        System.out.println("Parte C\n");
        for (int i= n; i <=9; i++){
            for (int j= 9; j >=i; j--){
                System.out.print(n);
            }
                System.out.print("\n");
                n += 1;
        } 

    }
}