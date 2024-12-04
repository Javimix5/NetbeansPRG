/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;

public class JgpT6e03Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
        CuentaCorriente cuenta1 = new CuentaCorriente();

        System.out.println("Bienvenido a la aplicacion del banco. ");
        System.out.println("Como nuevo cliente se le abrira una nueva cuenta.");
        menuCrear(cuenta1);
        System.out.println("Establezca el porcentaje de comision a realizar con las retiradas: ");
        cuenta1.setPorcentajeComision(teclado.nextFloat());
        System.out.println("Su cuenta se ha creado correctamente.");
        System.out.println("Su saldo ahora mismo es de: " + cuenta1.getSaldo() + " euros.");
        System.out.println("Si realiza tres ingresos seguidos (sin ninguna retirada) se le dara como regalo 0.7euros");
        
        menu(cuenta1);
    }

    static void menu(CuentaCorriente cuenta) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Elegiste opción 1 (Consultar el saldo)");
                    System.out.println("Su saldo es: " + cuenta.getSaldo());
                    break;
                case 2:
                    System.out.println("Elegiste opción 2 (Ingresar)");
                    System.out.println("Introduce cantidad a recargar: ");
                    cuenta.ingresar(teclado.nextFloat());
                    System.out.println("Nuevo saldo: " + cuenta.getSaldo());
                    break;
                case 3:
                    System.out.println("Elegiste opción 3 (Retirada)");
                     System.out.println("Introduce cantidad a retirar: ");
                     float importe = teclado.nextFloat();
                    cuenta.retirar(importe);
                    if (cuenta.retirar(importe) == true) {
                        System.out.println("Retirada realizada corretamente");
                    } else {
                        System.out.println("No se pudo realizar la retirada, ya que el importe era menor al saldo.");
                    }
                    System.out.println("Nuevo saldo: " + cuenta.getSaldo());
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
        System.out.println("1 Consultar Saldo");
        System.out.println("2 Realizar un ingreso");
        System.out.println("3 Realizar una retirada");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }
    
    static void menuCrear(CuentaCorriente cuenta){
        Scanner teclado = new Scanner(System.in);
        
        int respuesta =1;
        do {
            System.out.println("Si desea generar manualmente el iban pulse 1");
            System.out.println("Si desea generar automaticamente el iban pulse 2");
            respuesta = teclado.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("Escriba su iban deseado: ");
                    cuenta.setIban(teclado.next());
                    break;
                case 2:
                    System.out.println("Su iban se generara de forma automatica.");
                    System.out.println("Un segundo...");
                    System.out.println("Generando...");
                    String nuevoIban = generarIban();
                    cuenta.setIban(nuevoIban);
                    System.out.println("Su iban es: " + cuenta.getIban());
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (respuesta !=1 && respuesta !=2);
    }
    
    public static  String generarIban() {

        StringBuilder numeros = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int numero = random.nextInt(10); // Genera un número entre 0 y 9
            numeros.append(numero);
        }

        return "Es" + numeros.toString();
    }
}

