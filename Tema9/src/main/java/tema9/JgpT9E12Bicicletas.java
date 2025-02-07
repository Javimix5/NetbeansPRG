package tema9;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT9E12Bicicletas {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Bicicleta bici1 = new Bicicleta("BH", "Allroad", 1500);
        Bicicleta bici2 = new Bicicleta("Trek", "Quad", 2000);
        Bicicleta bici3 = new Bicicleta("Pirate", "Bay", 2500);
        
        
        System.out.println("Datos de las bicicletas:");
        System.out.println(bici1);
        System.out.println(bici2);
        System.out.println(bici3);
        
        
        //Descuento y meses fijados por defecto
        bici1.fijarDescuento();
        System.out.println("Precio final con el descuento: " + bici1.getPrecioFinal() + " euros");
        
        
        //Descuento fijado por parametro interno y meses por defecto
        bici2.fijarDescuento(15);
        System.out.println("Precio final con el descuento del 15 es : " + bici2.getPrecioFinal() + " euros");
        
        
        //Descuento y meses fijados por parametro interno
        bici3.fijarDescuento(20, 3);
        System.out.println("Precio final con el descuento del 20 es : " + bici3.getPrecioFinal() + " euros");
        
        
        //COmparacion Bicicleta 1 y bicicleta 3
        System.out.println("Bicicleta1 y bicicleta 2 son iguales: " + bici1.equals(bici3));
       
        
        
        System.out.println("Estado final de las bicicletas");
        System.out.println(bici1);
        System.out.println(bici2);
        System.out.println(bici3);
        
    }// Fin main

}// Fin clase
