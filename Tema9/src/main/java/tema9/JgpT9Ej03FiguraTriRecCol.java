package tema9;

/**
 *
 * @author Javier González Prados
 *
 */
import java.awt.Color;
import java.util.Scanner;

public class JgpT9Ej03FiguraTriRecCol {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;
        int opcion;
        int base, altura;
        String color;
        Figura figura = null;

        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Crear un triangulo");
                    System.out.println("Introduce la altura");
                    altura = teclado.nextInt();
                    System.out.println("Introduce la base");
                    base = teclado.nextInt();
                    figura = new Triangulo(altura, base);
                    break;
                    
                case 2:
                    System.out.println("Crear un rectangulo");
                    System.out.println("Introduce la altura");
                    altura = teclado.nextInt();
                    System.out.println("Introduce la base");
                    base = teclado.nextInt();
                    figura = new Rectangulo(altura, base);
                    break;
                    
                case 3:
                    System.out.println("Crear un triancolor");
                    System.out.println("Introduce la altura");
                    altura = teclado.nextInt();
                    System.out.println("Introduce la base");
                    base = teclado.nextInt();
                    System.out.println("Elije el color");
                    color = teclado.next();
                    
                    figura = new TrianColor(color, altura, base);
                    break;
                    
                case 0:
                    salir = true;
                    
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion !=1 && opcion !=2 && opcion !=3);
        
        figura.verDimension();

        
        if (figura instanceof Triangulo) {
            System.out.println("El area es: " + ((Triangulo)figura).dameArea());
            
        }
        if (figura instanceof Rectangulo) {
            System.out.println("Es cuadrado: " + ((Rectangulo)figura).esCuadrada());
        }
        if (figura instanceof TrianColor) {
            System.out.println(((TrianColor)figura).mostrarColor());
            
        }
        
    }//fin main

    //FUNCION de pintar el menu
    static int pintarMenu() {
        System.out.println("\n");
        System.out.println("Seleciona la figura a crear:");
        System.out.println("1 Crear un triangulo");
        System.out.println("2 Crear un rectangulo");
        System.out.println("3 Crear TrianColor");
        System.out.println("0 Salir 0");
        return Integer.parseInt(teclado.nextLine());
    }    

}// Fin clase
