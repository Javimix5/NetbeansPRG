package examen2025;

import java.util.ArrayList;

/**
 * Forma parte del Exmanan2025_1_Ejercicio 2
 *
 * @author Javier González Prados
 */
public class Fabrica {

     ArrayList<Sucursal> sucursales = new ArrayList<>();
 public Fabrica() {
     this.sucursales = new ArrayList<>();
 }
 
 //funcion añadir Sucursal
 public void anhadirSucursal(Sucursal sucursal) {
     sucursales.add(sucursal);
 }
 
 //funcion borrar Sucursal
 public void borrarSucursal(String nombre) {
     sucursales.removeIf(sucursal -> sucursal.nombre.equals(nombre));
 }
 
 //funcion listar Sucursal
 public void listarSucursales() {
     for (Sucursal sucursal : sucursales) {
         sucursal.listarInstrumentos();
     }
 }
        
        
}//Fin clase
