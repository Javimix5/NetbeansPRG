package casa;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class UsoCoche {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        Coche miCoche = new Coche(); //Instanciar una clase, Ejemplar de clase

        miCoche.setColor(JOptionPane.showInputDialog("Introduce el color")); //Se llama al setter de color que es de tipo String
                
        System.out.println(miCoche.getColor()); //Se llama al getter para que me diga el valor añadido en el Stter

        miCoche.setAsientos_cuero(JOptionPane.showInputDialog("Tiene asientos de cuero? si/no")); //Si ponemos "no", nos dirá que tiene asientos de serie
       
       System.out.println(miCoche.getAsientos_cuero());
        
        miCoche.set_climatizador(JOptionPane.showInputDialog("Tiene climatizador? si/no"));
        
        System.out.println(miCoche.dimeClimatizador());
        
        System.out.println(miCoche.dime_Peso());
        
        System.out.println("El precio final del coche es: " + miCoche.precio_coche());

    }// Fin main

}//Fin clase
