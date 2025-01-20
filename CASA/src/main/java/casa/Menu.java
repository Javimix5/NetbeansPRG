
package casa;

import java.util.Scanner;

/**
 * FUNCION Pintar un MENU
 * Se debe incluir el boolean salir y el int de opcion para que no de errores
 */
public class Menu {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
       
   }//fin main
    
    static void menu() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("-- Opcion 1 --");
                    break;

                case 2:
                    System.out.println("-- Opcion 2 --");
                    break;

                case 3:
                    System.out.println("-- Opcion 3 --");
                    break;

                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Elija una opción:");
        System.out.println("1 opcion:");
        System.out.println("2 opcion:");
        System.out.println("3 opcion:");
        System.out.println("0 opcion:");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }


}//fin clase