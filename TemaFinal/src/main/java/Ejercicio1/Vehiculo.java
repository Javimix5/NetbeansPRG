package Ejercicio1;

/**
 * Clase abstracta Vehiculo
 * 
 * @author Javier González Prados
 */
public abstract class Vehiculo {
    
/**
 * Variables de la clase
 */    
private static int contadorVehiculos = 0;
protected String marca;

// Bloque de inicialización de clase que imprima "Clase Vehiculo cargada"
static {
    System.out.println("Clase Vehiculo cargada");
}

/**
 * Constructor Vehiculo
 * @param marca 
 */
    public Vehiculo(String marca) {
        this.marca = marca;
        contadorVehiculos++;
    }

/**
 * Método getter que cuenta los vehiculos
 * @param contadorVehiculos 
 */
    public static int getContadorVehiculos() {
        return contadorVehiculos;
    }

    /**
     * Método abstracto mostrarInfo
     */
public abstract void mostrarInfo();
  
    
    
}//Fin clase
