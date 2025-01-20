/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casa;

/**
 *
 * @author CASA
 */
import java.util.Scanner;


public class TestFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la frase al usuario
        System.out.print("Introduce una frase: ");
        String entrada = scanner.nextLine();

        // Crear el objeto Frase
        Frase frase = new Frase(entrada);

        // Mostrar el menú
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Mostrar frase original");
            System.out.println("2. Eliminar espacios al principio y al final");
            System.out.println("3. Contar letras");
            System.out.println("4. Invertir frase");
            System.out.println("5. Separar palabras");
            System.out.println("6. Contar palabras");
            System.out.println("7. Encontrar posición de la primera vocal");
            System.out.println("8. Encontrar posición de la última vocal");
            System.out.println("9. Comprobar si la primera letra es mayúscula");
            System.out.println("10. Convertir frase a mayúsculas");
            System.out.println("11. Convertir frase a minúsculas");
            System.out.println("12. Vectorizar la frase");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Frase original: " + frase.obtenerFrase());
                    break;
                case 2:
                    frase.eliminarBlancos();
                    System.out.println("Frase sin espacios: " + frase.obtenerFrase());
                    break;
                case 3:
                    System.out.println("Número de letras: " + frase.contarLetras());
                    break;
                case 4:
                    System.out.println("Frase invertida: " + frase.invertirFrase());
                    break;
                case 5:
                    System.out.println("Palabras separadas:\n" + frase.separarPalabras());
                    break;
                case 6:
                    System.out.println("Número de palabras: " + frase.contarPalabras());
                    break;
                case 7:
                    int primeraVocal = frase.primeraVocal();
                    System.out.println(primeraVocal == -1 ? "No se encontró ninguna vocal." : "Primera vocal en la posición: " + primeraVocal);
                    break;
                case 8:
                    int ultimaVocal = frase.ultimaVocal();
                    System.out.println(ultimaVocal == -1 ? "No se encontró ninguna vocal." : "Última vocal en la posición: " + ultimaVocal);
                    break;
                case 9:
                    System.out.println(frase.comprobarMayuscula() ? "La primera letra es mayúscula." : "La primera letra es minúscula.");
                    break;
                case 10:
                    System.out.println("Frase en mayúsculas: " + frase.convertirMayuscula());
                    break;
                case 11:
                    System.out.println("Frase en minúsculas: " + frase.convertirMinuscula());
                    break;
                case 12:
                    System.out.println("Vector de letras: " + frase.vectorizar());
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
