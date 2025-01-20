package tema7;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Javier González Prados
 */
public class Parking2 {

    private Coche[] plazas;
    private int capacidad;
    private int top;
    private double recaudado;
    public String matricula;    

    public Parking2(int capacidad) {
        this.capacidad = capacidad;
        this.plazas = new Coche[capacidad];
        this.top = -1;
        this.recaudado = 0.0;
    }

    // Método para mostrar el estado del parking 
    public void mostrarEstado(String matricula) {
        if (top == -1) {
            System.out.println("El parking esta vacio.");
        } else {
            System.out.println("Estado del parking:");
            for (int i = top; i >= 0; i--) {
                System.out.println("Plaza " + (i + 1) + ": " + plazas[i]);
            }
        }
    }

    // Método para aparcar un coche
    public int aparcar(String matricula) {
        if (top < capacidad - 1) {
            plazas[++top] = new Coche(matricula, LocalDateTime.now());
            return top + 1;
        } else {
            return 0; // Parking lleno 
        }
    }

    // Método para desaparcar un coche 
    public String desaparcar(String matricula) {
        if (top == -1) {
            return ""; // Parking vacío 
        } else {
            Coche coche = plazas[top--];
            LocalDateTime horaSalida = LocalDateTime.now();
            Duration duracion = Duration.between(coche.horaEntrada, horaSalida);
            long minutos = duracion.toMinutes();
            double importe = Math.min(minutos * 0.02, 10.0);
            recaudado += importe;
            return "Matricula: " + coche.matricula + ", Importe a pagar: " + String.format("%.2f", importe) + " euros";
        }
    }

    // Método para mostrar lo recaudado hasta el momento 
    public double mostrarRecaudado() {
        return recaudado;
    }

}//Fin clase

class Coche {

    String matricula;
    LocalDateTime horaEntrada;

    public Coche(String matricula, LocalDateTime horaEntrada) {
        this.matricula = matricula;
        this.horaEntrada = horaEntrada;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Hora de entrada: " + horaEntrada;
    }
}//Fin clase
