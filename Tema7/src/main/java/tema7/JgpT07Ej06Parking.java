/*
Ejercicio 6 - Realizar una clase llamada Parking que gestione los coches aparcados en un parking mediante 
un Array que almacene las matrículas. El parking es un poco raro, mide solo 3 metros de ancho y 
caben 20 coches, pero uno detrás de otro por lo que el último en entrar debe ser el primero en salir
(esta estructura se llama pila LIFO – Last Input, First Output ).

La clase debe tener métodos siguientes: 
a. Mostrar el estado del parking, esto es las matrículas de las plazas ocupadas. 
b. Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno. 
La plaza del fondo es la número 1 y la que está más cerca de la entrada es la 20. 
c. Desaparcar: (¿hace falta pasarle algún parámetro?). Devuelve la matrícula del coche a 
desaparcar o bien una cadena vacía si el parking está vacío. 
d. Mostrar la cantidad de plazas libres en ese momento. 

Hacer un programa con un menú que permita al usuario usar los métodos creados mostrando la 
información del parking correspondiente a los métodos creados (los métodos no deben escribir nada 
por consola, eso lo hace el programa que usa la clase) 

Además del array, la clase Parking necesita una variable adicional, que le indique la posición en la que 
aparcará el siguiente coche. Inicialmente vale cero, al aparcar un coche se incrementa y al desaparcar
se decrementa. Si vale 20 no cabrán más coches. 

Para implementar este tipo de estructuras LIFO existe una Colecciones que resuelven esto de forma 
más sencilla, se verá en el tercer trimestre
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT07Ej06Parking {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Parking parking = new Parking(20);
        menu(parking);

    }// Fin main

    static void menu(Parking parking) {
        boolean salir = false;
        int opcion;
        String matricula = parking.matricula;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("1. Mostrar plazas ocupadas");
                    parking.mostrarEstado(matricula);
                    break;

                case 2:
                    System.out.println("2. Aparcar");
                    System.out.println("Introduce la matricula del coche que va a aparcar");
                    matricula = teclado.nextLine();
                    teclado.nextLine();
                    int plaza = parking.aparcar(matricula);
                    if (plaza == 0) {
                        System.out.println("El parking esta lleno.");
                    } else {
                        System.out.println("Coche aparcado en la plaza " + plaza);
                    }
                    break;

                case 3:
                    System.out.println("3. Desaparcar");
                    System.out.println("Introduce la matricula del coche que quieres desaparcar");
                    String matriculaQuitar = teclado.nextLine();
                    teclado.nextLine();
                    matriculaQuitar = parking.desaparcar(matricula);
                    if (!matriculaQuitar.isEmpty()) {
                        System.out.println("El parking esta vacio");
                    } else {
                        System.out.println("El coche con matricula " + matricula + " ha salido");
                    }
                    break;

                case 4:
                    System.out.println("4. Mostrar plazas libres");
                    System.out.println("Hay " + parking.plazasLibres());
                    break;

                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu() {

        System.out.println("\n");
        System.out.println("Elija una opcion");
        System.out.println("1. Mostrar plazas ocupadas");
        System.out.println("2. Aparcar");
        System.out.println("3. Desaparcar");
        System.out.println("4. Mostrar plazas libres");
        System.out.println("0 Salir");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }

}// Fin clase
