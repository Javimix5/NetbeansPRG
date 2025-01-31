package Examen2_2025;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier González Prados
 */
public class Alarma extends Sensor {

    private Sensor sensor;
    private Timbre timbre;

    private List<LocalDateTime> activaciones;

    public double umbral;

    public Alarma(double umbral) {
        this.sensor = new Sensor();
        this.timbre = new Timbre();
        this.activaciones = new ArrayList<>();
        this.umbral = umbral;
    }

    public void comprobarEstado() {
        sensor.medirValor();
       
        System.out.println("Valor medido: " + sensor.getValorActual());
        if (sensor.getValorActual() > umbral) {
            timbre.encender();
            activaciones.add(LocalDateTime.now());
        } else {
            timbre.apagar();
        }
    }

    public LocalDateTime obtenerUltimaActivacion() {
        if (activaciones.isEmpty()) {
            return null;
        } else {
            return activaciones.get(activaciones.size() - 1);
        }

    }

    public void resetearAlarma() {
        timbre.apagar();
        activaciones.clear();
        System.out.println("La alarma se ha reseteado");
    }

    public void medicionesConsecutivas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            comprobarEstado();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }

    }

    public List<LocalDateTime> getActivaciones() {
        return activaciones;
    }

}
