/*
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el 
mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se 
ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Javier.gonzalezprado
 */
public class Bucles07 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        

        final int aleatorio;
        int contador = 4;
        int intento;

        aleatorio = (int) (Math.random() * 9999 + 0);
        System.out.println(aleatorio);

        while (contador > 0) {
            System.out.print("Introduce la combinacion de 4 cifras: ");
            intento = teclado.nextInt();
            if (intento < 0 || intento > 9999) {
                System.out.println("Numero erroneo. Debes introducir un numero entre 0000 y 9999.");
                continue;
            }
            if (intento == aleatorio) {
                System.out.println("¡La caja fuerte se ha abierto satisfactoriamente!");
                break;
            } else {
                contador--;
                if (contador > 0) {
                    System.out.println("Lo siento, esa no es la combinacion. Te quedan " + contador + " intentos.");
                } else {
                    System.out.println("Lo siento, has agotado todos tus intentos. La caja fuerte sigue cerrada.");
                }
            }
        }
    }
}

/*do{
num = teclado.nextInt();
if (num == combinacion){
sout    (Caja abierta);
fallo=false;
}else{ sout (no es la combinación);
intento++;
sout (intentos restantes (4-contador);}
while ((contador 1=4)&&(fallo=true);
}
 */
