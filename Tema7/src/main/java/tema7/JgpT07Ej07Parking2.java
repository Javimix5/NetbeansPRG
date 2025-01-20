/*
Ejercicio 7 - Realizar una clase llamada Parking2 que gestione los coches aparcados en un parking
mediante un Array, que almacene las matrículas y la hora de entrada en el parking. El parking es un
poco raro, mide solo 3 metros de ancho y caben 20 coches, pero uno detrás de otro por lo que el
último en entrar debe ser el primero en salir (esta estructura se llama pila LIFO – Last Input, First
Output). Cada minuto en el parking cuesta 2 céntimos (máx 10 euros). La clase debe tener métodos
siguientes:
• Mostrar el estado del parking, esto es las matrículas/hora de entrada de las plazas ocupadas.
• Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno. La plaza
del fondo es la número 1 y la que está más cerca de la entrada es la 20.
• Desaparcar: (¿hace falta pasarle algún parámetro?). Al desaparcar se calcula el importe a pagar
según los segundos de estancia. Devuelve la matrícula del coche y el importe a pagar. Si es parking
está vacío devuelve cadena vacía y cero euros.
• Mostrar lo recaudado hasta ese momento.
Hacer un programa con un menú que permita al usuario usar los métodos creados. No hay que
introducir a mano los valores de hora de entrada y salida en el parking, se harán por el reloj del
sistema.
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT07Ej07Parking2 {

    static Scanner teclado = new Scanner(System.in);
    static String matricula;

    public static void main(String[] args) {
        Parking2 parking2 = new Parking2(20);
        
        menu(parking2);

    }// Fin main

    static void menu(Parking2 parking2) {
        boolean salir = false;
        int opcion;        
        
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("1. Mostrar plazas ocupadas");
                    parking2.mostrarEstado(matricula);
                    break;

                case 2:
                    System.out.println("2. Aparcar");
                    System.out.println("Introduce la matricula del coche que va a aparcar");
                    matricula = teclado.nextLine();
                    teclado.nextLine();
                    int plaza = parking2.aparcar(matricula);
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
                    matriculaQuitar = parking2.desaparcar(matricula);
                    if (!matriculaQuitar.isEmpty()) {
                        System.out.println("El parking esta vacio");
                    } else {
                        System.out.println("El coche con matricula " + matriculaQuitar + " ha salido");
                    }
                    break;

                case 4:
                    System.out.println("4. Mostrar lo recaudado");
                    System.out.printf("Recaudado hasta el momento: %.2f euros\n", parking2.mostrarRecaudado());
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
        System.out.println("4. Mostrar lo recaudado");
        System.out.println("0 Salir");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }

}// Fin clase
