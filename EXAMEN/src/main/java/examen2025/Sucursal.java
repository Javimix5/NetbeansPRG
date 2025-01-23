package examen2025;

import java.util.ArrayList;

/**
 * Forma parte del Exmanan2025_1_Ejercicio 2
 *
 * @author Javier González Prados
 */
public class Sucursal {

    String nombre;
ArrayList<Instrumento> instrumentos;
    
public Sucursal(String nombre) {
    this.nombre = nombre;
    this.instrumentos = new ArrayList<>();
}
    
//funcion añadir Instrumento
public void añadirInstrumento(Instrumento instrumento) {
    instrumentos.add(instrumento);
}
    
//funcion listar Instrumento
public void listarInstrumentos() {
    System.out.println("Listado de instrumentos " + nombre);
    for (Instrumento instrumento : instrumentos) {
        System.out.println(instrumento);
    }
}

//funcion ordenar por tipo
public ArrayList<Instrumento> instrumentosPorTipo(String tipo) {
    ArrayList<Instrumento> resultado = new ArrayList<>();
    
    for (Instrumento instrumento : instrumentos) {
        if (instrumento.tipo.equalsIgnoreCase(tipo)) {
            resultado.add(instrumento);
        }
    }
    return resultado;
}
    
//funcion borrar Instrumento
public void borrarInstrumento(String id) {
    instrumentos.removeIf(instrumento -> instrumento.id.equals(id));
}



}//Fin clase
