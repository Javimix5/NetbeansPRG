package tema10;

import java.time.LocalDate;

/**
 *
 * @author Javier González Prados
 */
public class Calefaccion implements Domotica {

    private int temperatura;
    private LocalDate fechaUltRevision;
    private static final int Temp_Max = 80;
    private static final int Temp_Min = 15;
    private static final int Temp_Ini = 20;

    public Calefaccion() {
        this.temperatura = temperatura;
        this.fechaUltRevision = fechaUltRevision;
    }

    @Override
    public boolean subir() {
        if (temperatura < Temp_Max) {
            temperatura++;
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if (temperatura > Temp_Min) {
            temperatura--;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        this.temperatura = Temp_Ini;
    }

    public void revisar() {
        this.fechaUltRevision = LocalDate.now();
    }

    @Override
    public String verEstado() {
        return "Calefaccion: " + "temperatura: " + temperatura + ", fechaUltRevision: " + fechaUltRevision;
    }

}//Fin clase
