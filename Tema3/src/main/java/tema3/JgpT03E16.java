/*
 * Programar el siguiente juego. El ordenador genera un número al azar 
 * entre 0 y 99 que habrá que adivinar. El jugador intentará adivinar el 
 * número y el programa le responderá si es mayor, menor o si ha acertado. 
 * Se dispone de un máximo de 5 intentos.
 * 
 * Autor: Javier González Prados
 */
package tema3;

import java.util.Scanner;

public class JgpT03E16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int aleatorio;
        int contador = 1;
        int intento;
        
        aleatorio = (int)(Math.random()*99+0);
        System.out.println("Intenta adivinar un numero entre 0 y 99. Dispones de 5 intentos.");
        
        do { System.out.println("Introduce un numero que crees:");           
            intento = teclado.nextInt();
            
            if (intento < aleatorio){
            System.out.println("El numero es mayor, te quedan " + (6- contador) + " intentos");
        }else if (intento > aleatorio){
                System.out.println("El numero es menor, te quedan " + (6- contador) + " intentos");
                } else if (intento == aleatorio) { System.out.println("Eureka, has acertado");
                }
        contador += 1;
        }while (contador <= 5);
        System.out.print("Caspitas, mi numero era: " + aleatorio);
        }
        }    
         
        