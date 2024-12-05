/*
 * 6.7. Implementar una clase llamada Circulo, que tiene solo la propiedad radio y los métodos 
setRadio, getRadio, calcularCircunferencia, calcularSuperficie, calcularDiametro además de un 
constructor. Crea un programa que use esta clase creando un par de círculos y usando los métodos 
creados. ¿El atributo radio puede ser privado? 
Debe de ser privado
 */
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
import java.util.Scanner;

public class JgpT6e07Circulo {

    static Scanner teclado = new Scanner(System.in, "ISO-8859-1"); 

    public static void main(String[] args) {
        Circulo circle1 = new Circulo(2.4);
        Circulo circle2 = new Circulo(3.6);
        Circulo circle3 = new Circulo(4.1);
        
        System.out.printf("Radio\t|\tDiametro\t|\tCircunferencia\t\t|\tSuperficie%n");
        System.out.printf(circle1.getRadio() + "\t|\t" + circle1.calcularDiametro() + "\t\t|\t" + circle1.calcularCircunferencia() + "\t|\t" + circle1.calcularSuperficie() + "%n");
        System.out.printf(circle2.getRadio() + "\t|\t" + circle2.calcularDiametro() + "\t\t|\t" + circle2.calcularCircunferencia() + "\t|\t" + circle2.calcularSuperficie() + "%n");
        System.out.printf(circle3.getRadio() + "\t|\t" + circle3.calcularDiametro() + "\t\t|\t" + circle3.calcularCircunferencia() + "\t|\t" + circle3.calcularSuperficie() + "%n");
    }
}
