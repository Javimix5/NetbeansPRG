/*
 * Clase Ejemplar Libros
 */
package tema6;

import java.time.LocalDate;

/**
 *
 * @author javier.gonzalezprado
 */
public class EjemplarLibro {

    //atributos
    private String tituloLibro;
    private LocalDate fechaAdquisicion;
    private int numeroEjemplar;
    private String prestado="no";
    //constructor para el primer ejemplar
    public EjemplarLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
        this.fechaAdquisicion= LocalDate.now();
        this.numeroEjemplar=1;
    }
    //constructor para los siguientes ejemplares
    public EjemplarLibro(EjemplarLibro libro) {
        this.tituloLibro= libro.tituloLibro;
        this.fechaAdquisicion= libro.fechaAdquisicion;
        this.numeroEjemplar= libro.numeroEjemplar+1;
    }
    //método prestar
     public boolean prestar(){
        if(this.prestado.equals("no")){
            this.prestado="si";
            return true;
        }else{
            return false;
        }
    }
     //metodo devolver
     public boolean devolver(){
         if(this.prestado.equals("si")){
             this.prestado="no";
             return true;
         }else{
             return false;
         }
     }
    //toString
     
    @Override
    public String toString() {
        return tituloLibro + "(=" + fechaAdquisicion + ") {" + numeroEjemplar + "}";
    }
     
    
}