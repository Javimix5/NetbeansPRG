package Ejercicio1;

/**
 * Clase CamionAMotor
 *
 * @author Javier González Prados
 */
public class CamionAMotor extends Vehiculo implements AMotor {

    /**
     * Variables de la clase
     */
    private int capacidadCarga;
    private static int contadorVehiculos = 0;

    // Bloque de inicialización de clase que imprima "Clase CamionAMotor"
    static {
        System.out.println("Clase CamionAMotor cargada");
    }

    /**
     * Constructor de la clase CamionAMotor
     *
     * @param marca
     * @param capacidadCarga
     */
    public CamionAMotor(String marca, int capacidadCarga) {
        super(marca);
        this.capacidadCarga = capacidadCarga;
        contadorVehiculos++;
        System.out.println("Camion a motor creado");
    }

    /**
     * Método getter
     *
     * @return devuelve el número de Vehiculos
     */
    public static int getContadorVehiculos() {
        System.out.println("Camiones a motor registrados: " + contadorVehiculos);
        return Vehiculo.getContadorVehiculos();
    }

    /**
     * Método Override para mostrarInfo que mostrará un mensaje por pantalla
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Capacidad de carga: " + capacidadCarga + " Kg");
    }

    /**
     * Método descargar que mostrará un mensaje por pantalla
     */
    public void descargar() {
        System.out.println("Descargando el camion");
    }

    /**
     * Método override repostar que mostrará un mensaje por pantalla
     */
    @Override
    public void repostar() {
        System.out.println("Dando de beber al camion....");
    }

}//Fin clase
