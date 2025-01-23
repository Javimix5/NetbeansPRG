package tema8;

/**
 *
 * @author Javier González Prados
 */
public class Bicho {

    public int hambre;
    private int peso;

    Bicho() {
        hambre = 50;
        peso = 50;
    }

    Bicho(int h, int p) {
        hambre = h;
        peso = p;
    }

    public void come() {
        hambre -= 5;
        peso++;
    }
}//Fin clase

//Clase BichoDormilon
class BichoDormilon extends Bicho {

    public int sueño;

    BichoDormilon() {
        sueño = hambre * 2;
    }

    BichoDormilon(int i) {
        super(i, 0);
        sueño = i + 20;
    }

    @Override
    public void come() {
        hambre -= 10;
        sueño += 5;
    }

    public void aDormir() {
        super.come();
        sueño = 0;
    }
}
