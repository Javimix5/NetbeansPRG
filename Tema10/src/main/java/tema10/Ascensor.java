package tema10;

import java.time.LocalDate;

/**
 *
 * @author Javier González Prados
 */
public class Ascensor implements Domotica {

    private static final int Planta_Min = 0;
    private static final int Planta_Max = 8;
    private static final int Planta_Ini = 0;
    private int planta;

    @Override
    public boolean subir() {
        if (planta < Planta_Max) {
            planta++;
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if (planta > Planta_Min) {
            planta--;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        this.planta = Planta_Ini;
    }

    @Override
    public String verEstado() {
        return "Ascensor: " + "planta: " + planta;
    }

}//Fin clase
