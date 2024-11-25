/*
 * Comprueba el funcionamiento del siguiente programa que simula el comportamiento de un
ordenador. Intenta entender el código. Responde a las preguntas del final.
 */
package tema6amplia;

/**
 *
 * @author javier.gonzalezprado
 */
public class Ordenador {

    private String marca; //marca del ordenador
    private String procesador; //marca del procesador
    private float peso; //peso del ordenador
    private boolean encendido; //si vale true => está encendido. si vale false => está apagado
    private boolean pantalla; //si vale true => está activada. si vale false => está desactivada

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String ma) {
        marca = ma;
    }

    public void encenderOrdenador() {
        if (encendido == true) {
            System.out.println("El ordenador ya esta encendido");
        } else {
            encendido = true;
            pantalla = true;
            System.out.println("El ordenador ha sido encendido");
        }
    }

    public void comprobarEstado() {
        System.out.print("\nEl estado del ordenador es el siguiente:");
        System.out.print("\nMarca: " + marca);
        System.out.print("\nProcesador: " + procesador);
        System.out.print("\nPeso: " + peso + " kg.");
        if (encendido == true) {
            System.out.print("\nEl ordenador esta encendido");
        } else {
            System.out.print("\nEl ordenador esta apagado");
        }
        if (pantalla == true) {
            System.out.print("\nLa pantalla esta activada");
        } else {
            System.out.print("\nLa pantalla esta desactivada");
        }
        System.out.println("\n");
    }

    public Ordenador() {
    }

    public Ordenador(String marca, String procesador, float peso, boolean encendido, boolean pantalla) {
        this.marca = marca;
        this.procesador = procesador;
        this.peso = peso;
        this.encendido = encendido;
        this.pantalla = pantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isPantalla() {
        return pantalla;
    }

    public void setPantalla(boolean pantalla) {
        this.pantalla = pantalla;
    }

    /*Estos son los métodos solicitados en el ejercicio 2*/
    
    public void apagarOrdenador() {
        if (!encendido) {
            System.out.println("El ordenador ya está apagado");
        } else {
            encendido = false;
            pantalla = false;
            System.out.println("El ordenador ha sido apagado");
        }
    }

    public void desactivarPantalla() {
        if (!pantalla) {
            System.out.println("La pantalla ya está desactivada");
        } else {
            pantalla = false;
            System.out.println("La pantalla ha sido desactivada");
        }
    }

    public void activarPantalla() {
        if (pantalla) {
            System.out.println("La pantalla ya está activada");
        } else {
            pantalla = true;
            System.out.println("La pantalla ha sido activada");
        }
    }

    @Override
    public String toString() {
        return "Ordenador{" + "marca=" + marca + ", procesador=" + procesador + ", peso=" + peso + ", encendido=" + encendido + ", pantalla=" + pantalla + '}';
    }

}
