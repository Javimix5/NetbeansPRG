/*
 * Haz una segunda versión de la clase CuentaCorriente (puedes llamarle CuentaCorriente2) , en la que 
la comisión de retirada sea común para todas las cuentas. Haz una versión del programa (puedes 
llamarle 6.4b) que use esta nueva clase. El constructor ya no tendrá como parámetro el porcentaje 
de comisión ya que es común para todas las cuentas. 
Se puede fijar al comienzo del programa el porcentaje de comisión y luego el programa es 
similar al anterior, salvo que el método de setComision y getComision serán estáticos: 
 CuentaCorriente2.setComision(0.1f); 
 cuenta1 = new CuentaCorriente2 ("ES010001"); 
 cuenta2 = new CuentaCorriente2 ("ES020002"); 
 cuentaActiva = cuenta1;
*/
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
import java.util.Scanner;

public class JgpT6e04Cuenta2 {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        //solo hace falta pasarles el iban
        CuentaCorriente2 cuenta1 = new CuentaCorriente2("ESO10001");
        CuentaCorriente2 cuenta2 = new CuentaCorriente2("ES020002");
        //le paso a cuentaActiva el valor de cuenta1
        CuentaCorriente2 cuentaActiva = cuenta1;

        //le asigno una comisión común para todos los objetos de la clase.
        CuentaCorriente2.setComision(0.1f);
        while (opcion != 5) {

            System.out.println("\nLa cuenta activa actualmente es: " + cuentaActiva.iban);
            System.out.println("\nMenu:");
            System.out.println("1. Ingresar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Cambiar cuenta activa");
            System.out.println("5. Salir");
            System.out.println("Escoge una opcion.");
            opcion = sc.nextInt();

            //Cambio en el switch a cuentaActiva para que se guarden
            //los datos en la que cuenta que esté activa en ese momento
            switch (opcion) {
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
