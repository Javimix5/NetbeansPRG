package tema10;

/**
 *
 * @author Javier González Prados
 */
public class Radio implements Domotica {

    private static final double Dial_Min = 88.0;
    private static final double Dial_Max = 104.0;
    private static final double Dial_Ini = 88.0;
    private static final double incremento = 0.1;
    private double dial;

    @Override
    public boolean subir() {
        if (dial < Dial_Max) {
            dial++;
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if (dial > Dial_Min) {
            dial--;
            return true;
        }
        return false;
    }

    @Override
    public void reset() {
        this.dial = Dial_Ini;
    }

    @Override
    public String verEstado() {
        return "Radio: " + "dial: " + dial;
    }

}//Fin clase
