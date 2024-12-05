/*
 * 6.8. Implementar una clase llamada EjemplarLibro que se va a usar en una biblioteca y que tiene 
los siguientes atributos: 
- Título de libro (se le pone en el momento del alta)
- Fecha de adquisición (es la fecha del sistema en el momento del alta)
- Número de ejemplar: 1, 2, 3, etc. (de un mismo libro, la biblioteca tiene varios ejemplares)
- Prestado (sí /no). Inicialmente no está prestado.
Además, tiene los siguientes métodos: 
- Constructor 1: cuando es el primer ejemplar de un determinado título, se le pasa como parámetro solo 
el título del libro. El resto de datos los puede calcular él. 
- Constructor 2: se le pasa como parámetro un libro y copia todos sus atributos salvo el número de 
ejemplar que será 1 más el del libro pasado. 
- prestar (): si no está prestado lo marca como prestado y devuelve true¸ si está prestado no hace nada 
y devuelve false. 
- devolver (): si está prestado lo marca como no prestado y devuelve true¸ si no está prestado no hace 
nada y devuelve false. 
- toString (): Genera un String con el nombre, la fecha entre paréntesis y el número de ejemplar entre 
corchetes. Este método se usará para sacar por pantalla de forma cómoda los datos de un libro. 
Haz un main() que cree 4 libros (probando ambos constructores), que realice algún préstamo y 
devolución, y finalmente muestre los libros -con toString()-
 */
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
import java.util.Scanner;

public class JgpT6e08Libros {

    static Scanner teclado = new Scanner(System.in, "ISO-8859-1"); 

 
    public static void main(String[] args) {
        
        
        String tituloLibro;
        System.out.println("Escribe el título de un libro:");
        tituloLibro= teclado.nextLine();
        EjemplarLibro libro1= new EjemplarLibro(tituloLibro);
        EjemplarLibro libro2= new EjemplarLibro(libro1);
        EjemplarLibro libro3 = new EjemplarLibro(libro2);
        EjemplarLibro libro4= new EjemplarLibro(libro3);
        libro1.prestar();
        libro2.prestar();
        libro1.devolver();
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        
    }
    
}