package tema10;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class JgpT10Ej13Domotica {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Domotica> dispositivos = new ArrayList<>();

        dispositivos.add(new Calefaccion());
        dispositivos.add(new Ascensor());
        dispositivos.add(new Radio());

        int opcion;
        do {
            // Mostrar estado de los dispositivos
            System.out.println("---------------------------------------");
            System.out.println("\n ***Estado actual de los dispositivos***");
            for (int i = 0; i < dispositivos.size(); i++) {
                System.out.println(i + ": " + dispositivos.get(i).verEstado());
                System.out.println("------------------------------------");
            }

            // Mostrar menú de opciones
            System.out.println("\n       Menu de Control:");
            System.out.println("----------------------------------");
            System.out.println("|0: Salir                         |");
            System.out.println("|1: Subir un dispositivo          |");
            System.out.println("|2: Bajar un dispositivo          |");
            System.out.println("|3: Resetear un dispositivo       |");
            System.out.println("|4: Revisar termostato            |");
            System.out.println("|5: Mostrar estado de dispositivos|");
            System.out.println("----------------------------------");

            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();

            if (opcion > 0 && opcion < 4) {         //Opcion para seleccionar dispositivo a utilizar
                System.out.println("\n");
                System.out.println("-------------------------------------");
                System.out.println("| Seleccione el dispositivo (0-" + (dispositivos.size() - 1) + ")  |");
                System.out.println("-------------------------------------");
                System.out.println("0 - Calefaccion");
                System.out.println("1 - Ascensor");
                System.out.println("2 - Radio");
                int dispositivoIndex = teclado.nextInt();

                if (dispositivoIndex >= 0 && dispositivoIndex < dispositivos.size()) {
                    Domotica dispositivo = dispositivos.get(dispositivoIndex);

                    switch (opcion) {
                        case 1:
                            if (dispositivo.subir()) {
                                System.out.println("Dispositivo aumentado correctamente.");
                            } else {
                                System.out.println("No se puede subir mas.");
                            }
                            System.out.println("------------------------------------");
                            break;
                        case 2:
                            if (dispositivo.bajar()) {
                                System.out.println("Dispositivo bajado correctamente.");
                            } else {
                                System.out.println("No se puede bajar mas.");
                            }
                            System.out.println("------------------------------------");
                            break;
                        case 3:
                            dispositivo.reset();
                            System.out.println("Dispositivo reseteado.");
                            System.out.println("------------------------------------");
                            break;
                    }
                } else {
                    System.out.println("Numero de dispositivo no valido.");
                }
            } else if (opcion == 4) {
                if (dispositivos.get(0) instanceof Calefaccion) {
                    ((Calefaccion) dispositivos.get(0)).revisar();
                    System.out.println("Termostato revisado.");
                    System.out.println("------------------------------------");
                }
            } else if (opcion == 5) {
                System.out.println("-------------------------------------------");
                System.out.println("\n ***Estado actual de los dispositivos***");
                for (int i = 0; i < dispositivos.size(); i++) {
                    System.out.println(i + ": " + dispositivos.get(i).verEstado());
                    System.out.println("-----------------------------------------");
                }
            }

        } while (opcion != 0);

        System.out.println("\n");
        System.out.println("Saliendo del sistema domotico...");

    }//Fin Main

}//Fin Clase
