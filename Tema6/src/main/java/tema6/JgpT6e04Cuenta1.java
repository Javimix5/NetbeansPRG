/*
 * 6.4. Haz un programa como el anterior, pero creando dos cuentas en vez de una. Habrá una 
opción de menú nueva que será “Cambiar cuenta activa” para pasar de una cuenta a otra. 
Tendremos una variable de tipo CuentaCorriente que le puedes llamar cuentaActiva que unas veces 
apuntará a una cuenta y otras veces a la otra 
Recuerda que las variables de tipo Objeto, a diferencia de los tipos primitivos, son apuntadores a los
objetos, si tenemos los objetos ‘cuenta1’ y ‘cuenta2’ creados con su constructor, podemos hacer 
luego una tercera variable ‘cuentaActiva’ sin constructor y hacer ‘cuentaActiva=cuenta1’ o bien 
‘cuentaActiva=cuenta2’ cuando nos interese. 
El programa al principio hará algo así: 
CuentaCorriente cuenta1 = new CuentaCorriente ("ES010001",1.5f); 
CuentaCorriente cuenta2 = new CuentaCorriente ("ES020002",0.5f); 
CuentaCorriente cuentaActiva = cuenta1; //sin constructor. 
En alguna opción de menú permitirá cambiar cuentaActiva de cuenta1 a cuenta2 y 
viceversa. 
*/
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */

import java.util.Scanner;

public class JgpT6e04Cuenta1 {

    public static void main(String[] args) {

        int num = 0;

        Scanner sc = new Scanner(System.in);

        CuentaCorriente cuenta1 = new CuentaCorriente("ES010001", 1.5f);
        CuentaCorriente cuenta2 = new CuentaCorriente("ES020002", 0.5f);

        CuentaCorriente cuentaActiva = cuenta1;

        while (num != 5) {
            System.out.println("Menu:");
            System.out.println("1. Ingresar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Cambiar cuenta activa");
            System.out.println("5. Salir");
            System.out.println("Escoge una opcion.");
            num = sc.nextInt();

            //Cambio en el switch a cuentaActiva para que se guarden
            //los datos en la que cuenta que esté activa en ese momento
            
            switch (num) {

                case 1 -> {
                    System.out.println("Introduce el importe a ingresar: ");
                    float ingreso = sc.nextFloat();
                    cuentaActiva.ingresar(ingreso);
                    System.out.println("Ingreso realizado");

                }
                case 2 -> {
                    System.out.println("Introduce el importe a retirar: ");
                    float retiro = sc.nextFloat();
                    boolean exitoRetiro = cuentaActiva.retirar(retiro);
                    if (exitoRetiro) {
                        System.out.println("Retiro realizado con exito.");
                    } else {
                        System.out.println("No tienes suficiente dinero para retirar.");
                    }
                }
                case 3 -> {
                    System.out.println("El saldo actual es: " + cuentaActiva.getSaldo() + " euros.");

                }
                case 4 -> {
                    if (cuentaActiva == cuenta1) {
                        cuentaActiva = cuenta2;
                    } else if (cuentaActiva == cuenta2) {
                        cuentaActiva = cuenta1;
                    }
                    System.out.println("La cuenta activa ha sido cambiada.");

                }
                case 5 -> {
                    System.out.println("Gracias por usar el programa.");
                }

            }
        }
    }

}
