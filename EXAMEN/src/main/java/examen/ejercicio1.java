/*
 * Ejercicio 1: Simulador de Cuenta hacia atras
 */
package examen;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("-----Simulador de Cuenta hacia atras----");
        System.out.println("introduce un numero positivo para empezar la cuenta regresiva (0 para salir): ");
        
            num = teclado.nextInt();

            if (num < 0) {
                System.out.println("Numero no valido");

            } else {
                System.out.println("Iniciando la cuenta atras");
                for (int i = num; i >= 0; i--) {

                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   

                }
            }System.out.println("Se acabo");
        }
    }
