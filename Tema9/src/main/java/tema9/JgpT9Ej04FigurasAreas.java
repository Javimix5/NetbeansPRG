package tema9;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class JgpT9Ej04FigurasAreas {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;
        int opcion;

        int base, altura;
        String color;
        int sumaTriangulo;

        double sumaArea;

        ArrayList<Figura> figuras = new ArrayList<>();

        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Crear un triangulo");
                    System.out.println("Introduce la altura");
                    altura = teclado.nextInt();
                    System.out.println("Introduce la base");
                    base = teclado.nextInt();
                    figuras.add(new Triangulo(altura, base));
                    break;

                case 2:
                    System.out.println("Crear un rectangulo");
                    System.out.println("Introduce la altura");
                    altura = teclado.nextInt();
                    System.out.println("Introduce la base");
                    base = teclado.nextInt();
                    figuras.add(new Rectangulo(altura, base));
                    break;

                case 3:
                    System.out.println("Crear un triancolor");
                    System.out.println("Introduce la altura");
                    altura = teclado.nextInt();
                    System.out.println("Introduce la base");
                    base = teclado.nextInt();
                    System.out.println("Elije el color");
                    color = teclado.next();

                    figuras.add(new TrianColor(color, altura, base));
                    break;

                case 0:
                    salir = true;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 1 && opcion != 2 && opcion != 3);

        System.out.println("La suma de todas las areas es: " + sumaAreas(figuras));
        System.out.println("Hay " + contarTriangulos(figuras) + " triangulos");

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

    public static int contarTriangulos(ArrayList<Figura> figuras) {
        int contar = 0;
        for (Figura i : figuras) {
            if (i instanceof TrianColor) {
                contar++;
            }
        }
        return contar;

    }

    public static double sumaAreas(ArrayList<Figura> figuras) {
        double sumaAreas = 0;

        for (Figura i : figuras) {

            sumaAreas += i.dameArea();
        }
        return sumaAreas;
    }

}// Fin clase
