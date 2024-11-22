/*
 * Ejercicio 1.- Crear una clase Libro que contenga los siguientes atributos privados:
● ISBN
● Titulo
● Autor
● Número de páginas
● Contador (de tipo public y static) -> atributo de clase
Se implantaran varios constructores:
○ Un constructor por defecto.
○ Un constructor con el Titulo, el autor y el resto por defecto.
○ Un constructor con todos los atributos como parámetro.
El atributo contador se incrementa cada vez que se crea un nuevo objeto de la clase Libro.
Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el
método toString() para mostrar la información relativa al libro con el siguiente formato:
«El libro con ISBN creado por el autor tiene páginas»
En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por
pantalla.
Imprimir por pantalla el valor del atributo contador sin necesidad de usar una instancia de la
clase Libro.
Por último, indicar cuál de los 2 tiene más páginas.
 */

package clasesobjetos;

/**
 *
 * @author Javier.gonzalezprado
 */

import java.util.Scanner;

public class ClasesObjetos01 {

    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        
        /*se puede dar los valores ya al inicio para probar, para que funcione se debe poner el mismo orden de creacion de clase
        new Libro("ISBN", "El lazarilllo de tormes", "Anonimo", "paginas")*/
        
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        
        /*Se dara la informacion a mano*/
        System.out.println("Introduce el titulo del libro1: ");
        libro1.setTitulo(teclado.nextLine());
        System.out.println("Introduce el ISBN: ");
        libro1.setISBN(teclado.nextLine());
        System.out.println("Introduce el autor: ");
        libro1.setAutor(teclado.nextLine());
        System.out.println("Introduce el numero de paginas: ");
        libro1.setNumPaginas(teclado.nextInt());
        
        teclado.nextLine(); /*Para solucionar el error de retorno de carro que hace saltar el titulo del segundo libro*/
        
        System.out.println("Introduce el titulo del libro2: ");
        libro2.setTitulo(teclado.nextLine());
        System.out.println("Introduce el ISBN: ");
        libro2.setISBN(teclado.nextLine());
        System.out.println("Introduce el autor: ");
        libro2.setAutor(teclado.nextLine());
        System.out.println("Introduce el numero de paginas: ");
        libro2.setNumPaginas(teclado.nextInt());
        
        System.out.println("Total libros guardados " + Libro.contadorLibros);
        
        System.out.println(libro1.toString());
        System.out.println("");
        System.out.println(libro2.toString());
        
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro con mas paginas es: " + libro1.getTitulo());
            
        } else {
            if (libro2.getNumPaginas() > libro1.getNumPaginas()) {
                System.out.println("El libro con mas paginas es: " + libro2.getTitulo());
            } else {
                System.out.println("Los dos libros tiene el mismo numero de paginas");
            }
        }
        
    }
}
