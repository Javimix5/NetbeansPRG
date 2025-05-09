package Ejercicio1;

/**
 * Clase CocheElectrico
 *
 * @author Javier González Prados
 */
public class CocheElectrico extends Vehiculo implements Electrico {

    /**
     * Variables de la clase
     */
    private int autonomia;
    private static int contadorVehiculos = 0;
    private static String tipoBateria = "Pilas";

    // Bloque de inicialización de clase que imprima "Clase CocheElectrico"
    static {
        System.out.println("Clase CocheElectrico cargada");
    }

    /**
     * COnstructor de la Clase CocheElectrico
     *
     * @param marca
     * @param autonomia
     */
    public CocheElectrico(String marca, int autonomia) {
        super(marca);
        this.autonomia = autonomia;
        contadorVehiculos++;

        System.out.println("CocheElectrico creado por los chinos");
    }

    /**
     * Método getter
     *
     * @return devuelve el número de Vehiculos
     */
    public static int getContadorVehiculos() {
        System.out.println("Coches electricos: " + contadorVehiculos);
        return contadorVehiculos;
    }

    /**
     * Método Override para mostrarInfo que mostrará un mensaje por pantalla
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Autonomia: " + autonomia + " Km");
    }

    /**
     * Método conducir que mostrará un mensaje por pantalla
     */
    public void conducir() {
        System.out.println("Conduciendo coche a pilas");
    }

    /**
     * Método Override cargar que mostrará un mensaje por pantalla
     */
    @Override
    public void cargar() {
        System.out.println("Cargando las pilas del coche.....");
    }

}//Fin clase
