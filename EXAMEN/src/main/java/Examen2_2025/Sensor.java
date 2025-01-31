package Examen2_2025;

import java.util.Random;

/**
 *
 * @author Javier González Prados
 */
public class Sensor {

    private double valorActual;

    
    public Sensor() {
        this.valorActual = 0.0;
    }

    public void medirValor() {
        Random random = new Random();          
        this.valorActual = random.nextInt(101);
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }
    
    
}
