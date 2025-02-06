package tema9;

/**
 *
 * @author Javier González Prados
 *
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class JgpT9Ej09Clinica {

    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Pacientes> listaEspera;
    static double facturado;

    public static void main(String[] args) {

        boolean salir = false;
        int opcion;
        listaEspera = new ArrayList<>();
        facturado = 0;

        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    entrada();
                    break;

                case 2:
                    llamada();
                    break;

                case 3:
                    consultaFacturacion();
                    break;

                case 0:
                    salir = true;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);

    }//fin main

    //FUNCION de pintar el menu
    static int pintarMenu() {
        System.out.println("\n");
        System.out.println("Elija una opcion:");
        System.out.println("1 Registro paciente");
        System.out.println("2 Atender paciente");
        System.out.println("3 Consultar facturacin");
        System.out.println("0 Salir");
        return Integer.parseInt(teclado.nextLine());
    }

    static void entrada() {
        System.out.println("1 Consulta");
        System.out.println("Nombre del paciente");
        String nombre = teclado.nextLine();
        System.out.println("Fecha nacimiento (en formato AAAA-MM-DD)");
        LocalDate fechaNacimiento = java.time.LocalDate.parse(teclado.nextLine());

        System.out.println("Motivo de la consulta");
        System.out.println("1. Consulta");
        System.out.println("2. Recetas");
        System.out.println("3. Revision");

        int option = java.lang.Integer.parseInt(teclado.nextLine());

        switch (option) {
            case 1 -> {
                System.out.println("Motivo de la consulta");
                String motivo = teclado.nextLine();
                listaEspera.add(new Consulta(motivo, nombre, fechaNacimiento));
            }

            case 2 -> {
                List<String> medicamentos = new LinkedList<>();
                boolean agregarMas;
                do {
                    System.out.println("Ingresa el medicacmento");
                    medicamentos.add(teclado.nextLine());

                    System.out.println("Ingrese mas medicamentos (1 = si, 2= no)");
                    agregarMas = teclado.nextLine().equals("1");
                } while (agregarMas);

                listaEspera.add(new Receta(medicamentos, nombre, fechaNacimiento));

            }

            case 3 -> {
                System.out.println(
                        "Fecha de la ultima revision (formato AAAA-MM-DD)");
                LocalDate ultimaVisita = LocalDate.parse(teclado.nextLine());

                listaEspera.add(new Revision(ultimaVisita, nombre, fechaNacimiento));
            }

        }
    }

    static void llamada() {
        double factura = 0;

        if (listaEspera.isEmpty()) {
            System.out.println("No hay pacientes en espera");
            
        } else {
            System.out.println("Paciente atendido" + listaEspera.get(0).nombre);

            if (listaEspera.get(0) instanceof Receta) {
                System.out.println("Lista de medicamentos" + (((Receta) listaEspera.get(0)).medicamentos));
                factura = (((Receta) listaEspera.get(0)).facturar());
            }

            if (listaEspera.get(0) instanceof Consulta) {
                System.out.println("Motivo consulta" + (((Consulta) listaEspera.get(0)).motivo));
                factura = (((Consulta) listaEspera.get(0)).facturar());
            }

            if (listaEspera.get(0) instanceof Revision) {
                System.out.println("Ultima visita" + (((Revision) listaEspera.get(0)).ultimaVisita));
                factura = (((Revision) listaEspera.get(0)).facturar());
            }
        }
        listaEspera.remove(0);        
        facturado += factura;

    }

    static void consultaFacturacion() {
        System.out.println("Total facturado es: " + facturado + "eur");

    }

}
