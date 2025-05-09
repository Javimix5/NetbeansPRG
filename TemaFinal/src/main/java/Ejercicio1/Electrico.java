package Ejercicio1;

/**
 * Clase interface Electrico
 * 
 * @author Javier González Prados
 */
public interface Electrico {

    /**
     * Método por defecto que imprime el estado de la batería
     */
    default void estadoCarga() {
        System.out.println("Bateria al 100%");
    }

    /**
     * Método abstracto que impementará las clases concretas
     */
    void cargar();
}
