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
 public void anhadirSucursal(Sucursal sucursal) {
     sucursales.add(sucursal);
 }
 public void borrarSucursal(String nombre) {
     sucursales.removeIf(sucursal -> sucursal.nombre.equals(nombre));
 }
 public void listarSucursales() {
     for (Sucursal sucursal : sucursales) {
         sucursal.listarInstrumentos();
     }
 }
        
        
}//Fin clase
