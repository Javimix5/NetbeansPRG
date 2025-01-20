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

public class JgpT07Ej19Compra2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda");
        CarritoCompra carrito = new CarritoCompra();

        int opcion;
        
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("1. Mostrar el estado del carrito");
                    carrito.mostrarEstado();
                    break;

                case 2:
                    System.out.println("2. Vaciar carrito");
                    carrito.vaciarCarrito();
                    break;

                case 3:
                    System.out.println("3. Anadir producto");
                    System.out.print("Introduce el codigo del producto: ");
                    String codigo = teclado.nextLine();
                    teclado.nextLine();
                    System.out.print("Introduce la descripcion del producto: ");
                    String descripcion = teclado.nextLine();
                    System.out.print("Introduce el precio unitario del producto: ");
                    double precioUnitario = teclado.nextDouble();
                    System.out.print("Introduce la cantidad de unidades: ");
                    int cantidad = teclado.nextInt();
                    teclado.nextLine();
                    carrito.anadirProducto(codigo, descripcion, precioUnitario, cantidad);

                    break;

                case 4:
                    System.out.println("4. Eliminar Producto");
                    System.out.println("Introduzca el producto que desea eliminar");
                    String codigoEliminar = teclado.nextLine();
                    teclado.nextLine();
                    carrito.eliminarProducto(codigoEliminar);
                    break;

                case 0:                    
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion !=0);
    }//Fin main

    private static int pintarMenu() {

        System.out.println("\n");
        System.out.println("Elija una opcion");
        System.out.println("1. Mostrar el estado del carrito");
        System.out.println("2. Vaciar carrito");
        System.out.println("3. Anadir producto");
        System.out.println("4. Eliminar producto");
        System.out.println("0 Salir");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }

}//Fin
