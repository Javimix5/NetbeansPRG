package tema7;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Javier González Prados
 */
public class Parking {

    private String[] plazas;
    private int capacidad;
    private int top;
    String matricula;

    public Parking(int capacidad) {
        this.capacidad = capacidad;
        this.plazas = new String[capacidad];
        this.top = -1;

    } // Método para mostrar el estado del parking 

    public void mostrarEstado(String matricula) {
        if (top == -1) {
            System.out.println("El parking esta vacio.");
        } else {
            System.out.println("Estado del parking:");
            for (int i = top; i >= 0; i--) {
                System.out.println("Plaza " + (i + 1) + ": " + matricula);
            }
        }
    }
// Método para aparcar un coche

    public int aparcar(String matricula) {
        if (top < capacidad - 1) {
            plazas[++top] = matricula;
            return top + 1;
        } else {
            return 0;
// Parking lleno 
        }
    }

    // Método para desaparcar un coche 
    public String desaparcar(String matricula) {
        if (top == -1) {
            return "";
            // Parking vacío 
        } else {
            return plazas[top--];
        }

    }
// Método para mostrar la cantidad de plazas libres

    public int plazasLibres() {
        return capacidad - (top + 1);
    }
}
