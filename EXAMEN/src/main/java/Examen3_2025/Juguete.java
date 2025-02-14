

package Examen3_2025;


/**
 *
 * @author Javier González Prados
 */

public class Juguete {

    public String nombre;
    public double precio;    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Juguete(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Método Mostrar
    public void mostrar(){
        System.out.println("Nombre: " + nombre + ", Precio: " + precio + " euros");
    }
    
    //Método Aplicar Descuento
    public void aplicarDescuento(double descuento) {
        precio -= precio * (descuento/100);                
    }
    
}//Fin clase
