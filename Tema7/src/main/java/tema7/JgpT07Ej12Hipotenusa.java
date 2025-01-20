package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JgpT07Ej12Hipotenusa {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Por favor, introduce dos valores enteros.");            

        }
        try {
            String args1 = JOptionPane.showInputDialog("Introduce el primer valor para la hipotenusa");
            String args2 = JOptionPane.showInputDialog("Introduce el segundo valor para la hipotenusa");

            int cateto1 = Integer.parseInt(args1);
            int cateto2 = Integer.parseInt(args2);

            if (cateto1 <= 0 || cateto2 <= 0) {
                System.out.println("Los valores deben ser enteros positivos.");
                return;
            }
            double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
            JOptionPane.showMessageDialog(null, String.format("La hipotenusa es: %.2f", hipotenusa));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, introduce valores enteros.");
        }

    }// Fin main

}// Fin clase
