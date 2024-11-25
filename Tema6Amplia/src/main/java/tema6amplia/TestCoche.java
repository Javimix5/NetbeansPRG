/*
 * Crea una clase Coche que represente coches. Ha de tener los siguientes atributos y
métodos:
● Atributos: marca, modelo, color, número de puertas, potencia, tipo combustible. Serán
todos private.
● Métodos:
○ 2 constructores: uno sin argumentos y otro con argumentos que inicialice todos los
atributos.
○ Métodos para asignar valores a los atributos (uno por cada atributo).
○ Métodos para devolver el contenido de los atributos (uno por cada atributo).
○ Un método que muestre en pantalla las características de un coche.
Para probar el funcionamiento de la clase Coche, crea una clase llamada TestCoche que 
contenga un método main donde se creen 2 objetos a partir de la clase Coche. Ha de pedir
por teclado los datos necesarios para cada uno de ellos. Uno de los objetos se creará 
usando el constructor que recibe los valores de todos los atributos; el otro objeto se creará 
usando el constructor sin argumentos (los valores para sus atributos se asignarán con los 
métodos específicos).
Finalmente, se han de mostrar en pantalla las características de los 2 coches.
 */
package tema6amplia;

import java.util.Scanner;

/**
 *
 * @author javier.gonzalezprado
 */
public class TestCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        
        
        System.out.println("Indique los siguientes datos del Coche");
        System.out.println("Indique la marca: ");
        coche1.setMarca(teclado.nextLine());
        System.out.println("Indique el model: ");
        coche1.setModelo(teclado.nextLine());
        System.out.println("Indique el color: ");
        coche1.setColor(teclado.nextLine());
        System.out.println("Indique el numero de puertas: ");
        coche1.setNumPuertas(teclado.nextInt());
        System.out.println("Indique la potencia: ");
        coche1.setPotencia(teclado.nextInt());
        System.out.println("Indique el combustible: ");
        coche1.setCombustible(teclado.next());
        
        
        System.out.println(coche1.toString());
        System.out.println("");
        System.out.println(coche2.toString());
    }
    
}
