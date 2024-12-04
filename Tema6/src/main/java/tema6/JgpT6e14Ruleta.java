/*
 * 6.14. Diseña una clase llamada Ruleta y un programa que la use, con la siguiente funcionalidad. 
- El jugador puede apostar lo que quiera a par o a impar . 
- En cada juego obtiene un número al azar entre 0 y 36 
- Si sale 0 pierde tanto par como impar, y en caso contrario si el jugador acierta (par o impar) gana tanto 
como lo apostado. 
Define los métodos necesarios para que los usuarios puedan apostar a par o impar. Hacer un 
programa en el que un jugador lleve 10.000 euros y juegue 10.000 veces 1 euro cada vez siempre 
apostando a par ¿Con cuánto dinero acaba? El resultado final puede ir entre 0 y 20.000 euros. 
Ejecútalo varias veces. ¿Conclusiones sobre jugar a la ruleta? ;)

 */
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
import java.util.Scanner;

public class JgpT6e14Ruleta {

    static Scanner teclado = new Scanner(System.in, "ISO-8859-1");

    public static void main(String[] args) {
        Ruleta ludopata = new Ruleta(10000);
        for (int i = 1; i <= 10000; i++) {
            ludopata.ronda(1, "par");
            if (ludopata.getSaldo() == 0) {
                System.out.printf("O xogador ludopata esgotou o seu saldo na ronda %d", i);
                break;
            }
        }
        if (ludopata.getSaldo() > 0) {
            System.out.printf("Saldo final do ludopata tras 10000 apostas: %d", ludopata.getSaldo());
        }
    }
}
