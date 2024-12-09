
package pruebas;

import java.util.Scanner;

/**
 * FUNCION Pintar un MENU
 * Se debe incluir el boolean salir y el int de opcion para que no de errores
 */
public class Menu {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
       boolean salir = false;
       int opcion;
        
        do {            
            opcion=pintarMenu();
            switch (opcion){
                case 1 -> tarea1();
                case 2 -> tarea2();
                case 3 -> tarea3();
                case 4 -> tarea4();
                case 0 -> salir=true;
                default -> System.out.println("Opción incorrecta");
            }
        } while (!salir);
   }//fin main
    
    
    //FUNCION de pintar el menu
    static int pintarMenu(){
        System.out.println("\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Opción 1");
        System.out.println("1 Opción 1");
        System.out.println("1 Opción 1");
        System.out.println("1 Opción 1");
        System.out.println("1 Opción 1");
        return Integer.parseInt (teclado.nextLine());
    }
    
    static void tarea1 () {
        System.out.println("Elegiste tarea 1");
    }
    static void tarea2 () {
        System.out.println("Elegiste tarea 2");
    }
static void tarea3 () {
        System.out.println("Elegiste tarea 3");
    }
static void tarea4 () {
        System.out.println("Elegiste tarea 4");
    }
static void tarea0 () {
        System.out.println("Elegiste tarea 0");
    }

}//fin clase