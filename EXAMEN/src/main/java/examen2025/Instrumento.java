package examen2025;

import java.util.ArrayList;

/**
 * Forma parte del Exmanan2025_1_Ejercicio 2
 *
 * @author Javier González Prados
 */
public class Instrumento {

    String ID;
    String descripcion;
    String tipo;
    double precio;

    public Instrumento(String ID, String descripcion, String tipo, double precio) {
        this.ID = ID;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "ID=" + ID + ", descripcion=" + descripcion + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
    
    

}//Fin clase
