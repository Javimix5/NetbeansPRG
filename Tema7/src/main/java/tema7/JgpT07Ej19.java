/*
Ejercicio 19 - Realizar una clase carritoCompra2 que mantenga las compras realizadas por un cliente en un 
ArrayList. Cada posición del ArrayList contendrá el código del producto, la descripción, el precio 
unitario y la cantidad de unidades compradas y el precio total de ese producto (cantidad x precio 
unitario). Se permite comprar un número indeterminado de artículos. Además de la lista de 
productos, la clase tiene el importe total de la compra, que debe estar siempre actualizado. 
Necesitamos los métodos: 
a) Mostrar por consola el estado actual del carrito. 
b) Vaciar carrito. 
c) Añadir producto. 
d) Eliminar producto (se le pasa el código de producto) y lo elimina físicamente del ArrayList.
Hacer un programa con un menú que permita al usuario operar con el carrito de la compra. 
 Pensar en crear un método .toString() para facilitar el mostrar por pantalla cada producto comprado.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class JgpT07Ej19 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
                System.out.println("Bienvenido a la tienda");      
    }

    static void menu() {
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Mostrar el estado del carrito");
                    
                    break;

                case 2:
                    System.out.println("Vaciar carrito");
                    
                    break;

                case 3:
                    System.out.println("Añadir producto");
                    System.out.println("Introduzca el producto que desea añadir");
                    
                    int cod =teclado.nextInt();
                    if (cod==1) {
                        ;
                    }
                    if (cod==2) {
                        ;
                    }
                    if (cod==3) {
                        ;
                    }
                    else{
                        System.out.println("Producto no valido");
                    }
                    break;
                    
                case 4:
                    System.out.println("Eliminar Producto");
                    System.out.println("Introduzca el producto que desea eliminar");
                    cod =teclado.nextInt();
                    if (cod==1) {
                        ;
                    }
                    if (cod==2) {
                        ;
                    }
                    if (cod==3) {
                        ;
                    }
                    break;    

                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (!salir);
    }//Fin main

    private static int pintarMenu() {

        System.out.println("\n");
        System.out.println("Elija una opcion");
        System.out.println("1. Mostrar el estado del carrito");
        System.out.println("2. Vaciar carrito");
        System.out.println("3. Añadir producto");
        System.out.println("4. Eliminar producto");
        System.out.println("0 Salir");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }
    
    
}//Fin