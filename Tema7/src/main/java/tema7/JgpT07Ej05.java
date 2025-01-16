/*
Ejercicio 5- Juego Primitiva
 */
package tema7;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.Scanner;

public class JgpT07Ej05 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
                System.out.println("Bienvenido al juego de la Primitiva");
        Primitiva primitiva = new Primitiva();
        menu(primitiva);

        System.out.println("Gracias por jugar a la Primitiva. Adios");
    }

    static void menu(Primitiva primitiva) {
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("-- Introducir su boleto --");
                    insertarBoleto(primitiva);
                    break;

                case 2:
                    System.out.println("-- Generar 1000 boletos aleatorios --");
                    generar1000Boletos(primitiva);
                    break;

                case 3:
                    System.out.println("-- Generar boletos hasta acertar los 6 numeros --");
                    generarHasta6Aciertos(primitiva);
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
        System.out.println("1. Introducir su boleto");
        System.out.println("2. Generar 1000 boletos aleatorios");
        System.out.println("3. Generar boletos hasta acertar los 6 numeros");
        System.out.println("0 Salir");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }


// Metodo para insertar boleto manualmente y comprobarlo
    static void insertarBoleto(Primitiva primitiva) {
        primitiva.mostrarResultado();

        int[] boletoUsuario = new int[6];
        System.out.println("Introduce tus 6 numeros (entre 1 y 49):");
        for (int i = 0; i < 6; i++) {
            boletoUsuario[i] = teclado.nextInt();
        }
        int aciertos = primitiva.comprobarAciertos(boletoUsuario);
        System.out.println("Has acertado: " + aciertos + " numeros.");
        // primitiva.mostrarResultado();
    }


// Metodo para generar 1000 boletos aleatorios
    static void generar1000Boletos(Primitiva primitiva) {
        int[] aciertosTotales = new int[7]; // Índice 3 = aciertos con 3 números, etc.

                    for (int i = 0; i < 1000; i++) {
                        int[] boletoAleatorio = Primitiva.generarBoletoAleatorio();
                        int aciertosBoleto = primitiva.comprobarAciertos(boletoAleatorio);
                        if (aciertosBoleto >= 3) {
                            aciertosTotales[aciertosBoleto]++;
                        }
                    }

                    for (int i = 3; i <= 6; i++) {
                        System.out.println("Boletos con " + i + " aciertos: " + aciertosTotales[i]);
                    }
    }


// Metodo para generar boletos hasta acertar los 6
    static void generarHasta6Aciertos(Primitiva primitiva) {
        int intentos = 0;
        while (true) {
            int[] boletoAleatorio = primitiva.generarBoletoAleatorio();
            intentos++;
            if (primitiva.comprobarAciertos(boletoAleatorio) == 6) {
                System.out.println("¡Acierto total despues de generar " + intentos + " boletos!");
                break;
            }
        }

    }
}