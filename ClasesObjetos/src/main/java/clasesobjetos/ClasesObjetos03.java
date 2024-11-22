/*
 * Ejercicio 3.- Haz una clase llamada Persona que siga las siguientes condiciones:
● Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
No queremos que se acceda directamente a ellos. Piensa que modificador de
acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes
hacerlo.
● Por defecto, todos los atributos menos el DNI serán valores por defecto según su
tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa
una constante para ello.
● Se implantaran varios constructores:
○ Un constructor por defecto.
○ Un constructor con el nombre, edad y sexo, el resto por defecto.
○ Un constructor con todos los atributos como parámetro.
Los métodos que se implementarán son:
● calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2
en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si
devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su
peso ideal la función devuelve un 0 y si devuelve un valor mayor que 25 significa
que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes
para devolver estos valores.
● esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
● comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no
es correcto, sera H. No sera visible al exterior.
● toString(): devuelve toda la información del objeto.
● generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su
número su letra correspondiente. Este método sera invocado cuando se construya el
objeto. No será visible al exterior.
● Métodos set de cada parámetro, excepto de DNI.
Ahora, crea una clase ejecutable que haga lo siguiente:
● Pide por teclado el nombre, la edad, sexo, peso y altura.
● Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables
pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso
y la altura y el último por defecto, para este último utiliza los métodos set para darle
a los atributos un valor.
● Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por
debajo de su peso ideal con un mensaje.
● Indicar para cada objeto si es mayor de edad.
● Por último, mostrar la información de cada objeto
 */
package clasesobjetos;

/**
 *
 * @author Javier.gonzalezprado
 */
import java.util.Scanner;

public class ClasesObjetos03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        
//Se introducen los datos por teclado
        System.out.println("Introduce el nombre de la primera persona: ");
        persona1.setNombre(teclado.next());
        System.out.println("Introduce la edad: ");
        persona1.setEdad(teclado.nextInt());
        System.out.println("Introduce el sexo (H o M): ");
        persona1.setSexo(teclado.next().toUpperCase().charAt(0));
        System.out.println("Introduce el peso: ");
        persona1.setPeso(teclado.nextDouble());
        System.out.println("Introduce la altura: ");
        persona1.setAltura(teclado.nextDouble());
        
//Hace el calculo de IMC
        String estadoPeso = pesoPersona(persona1.calculaIMC());
        
//Informa si es Mayor de edad
        System.out.println(persona1.toString());
        System.out.println(estadoPeso);
        System.out.println("Es mayor de edad = " + persona1.esMayorDeEdad());

        System.out.println("Introduce el nombre de la segunda persona: ");
        persona2.setNombre(teclado.next());
        System.out.println("Introduce la edad: ");
        persona2.setEdad(teclado.nextInt());
        System.out.println("Introduce el sexo (H o M): ");
        persona2.setSexo(teclado.next().toUpperCase().charAt(0));
        estadoPeso = pesoPersona(persona2.calculaIMC());

        System.out.println(persona2.toString());
        System.out.println(estadoPeso);
        System.out.println("Es mayor de edad = " + persona2.esMayorDeEdad());

//ESTOS DATOS SERAN TOMADOS DE LOS AÑADIDOS EN LA CLASE PERSONA
        System.out.println("La tercera persona, se genera por defecto");
        estadoPeso = pesoPersona(persona3.calculaIMC());
        
        System.out.println(persona3.toString());
        System.out.println(estadoPeso);
        System.out.println("Es mayor de edad = " + persona1.esMayorDeEdad());
    }
//Informa del estado de IMC
    public static String pesoPersona(double imc) {
        if (imc == 1) {
            return "Esta persona tiene sobrepeso";
        } else {
            if (imc == 0) {
                return "Esta persona tiene el peso ideal";

            } else {
                return "Esta persona esta por debajo de su peso";
            }
        }
    }
}
