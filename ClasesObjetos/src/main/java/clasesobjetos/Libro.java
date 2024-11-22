/*
 * Clase Libro
 */
package clasesobjetos;

/**
 *
 * @author Javier.gonzalezprado
 */

public class Libro {
    
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    public static int contadorLibros =0;

    public Libro() {
        contadorLibros++;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        contadorLibros++;
    }

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        contadorLibros++;
    }

    /* Get coge valor por defecto no devuleve nada
    Set se le da el valor a mano no devuelve nada
    */

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "El libro con ISBN " + ISBN + " creador por " + autor + " y de nombre " +titulo + " tiene "+ numPaginas + " paginas";
    }
    
    


    
}

