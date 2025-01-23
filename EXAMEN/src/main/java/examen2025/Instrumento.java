package examen2025;

import java.util.ArrayList;

/**
 * Forma parte del Exmanan2025_1_Ejercicio 2
 *
 * @author Javier González Prados
 */
public class Instrumento {

    String id;
String descripcion;
double precio;
String tipo;
public Instrumento(String id, String descripcion, double precio, String tipo) {
    this.id = id;
    this.descripcion = descripcion;
    this.precio = precio;
    this.tipo = tipo;
}
@Override
public String toString() {
    return "Instrumento{" + "id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", tipo=" + tipo + '}';
}
    
    
    
    

}//Fin clase
