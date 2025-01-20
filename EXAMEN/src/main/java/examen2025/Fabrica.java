package examen2025;

import java.util.ArrayList;

/**
 * Forma parte del Exmanan2025_1_Ejercicio 2
 *
 * @author Javier González Prados
 */
public class Fabrica {

    ArrayList<Sucursal> sucursales;

    public Fabrica() {

        this.sucursales = new ArrayList<>();
    }

    public void listarInstrumento(Instrumento instrumento) {
        for (Sucursal sucursal : sucursales){
        System.out.println("Imprimiendo listado instrumentos sucursal " + sucursal.nombre);
        
        for (Instrumento instrumento : sucursal.instrumentos){
            System.out.println(instrumento);
        }
    }
    }
    
    public ArrayList<Instrumento> instrumentoPorTipo(String tipo, String Sucursal){
        
    }
            
            
            
    public void borrarSucursal(Sucursal sucursal) {

        sucursales.remove(sucursal);
    }

    public void anhadirSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

}//Fin clase
