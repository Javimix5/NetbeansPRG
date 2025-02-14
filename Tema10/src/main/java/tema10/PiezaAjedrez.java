package tema10;

/**
 *
 * @author Javier González Prados
 */
public abstract class PiezaAjedrez {

    protected int fila;
    protected int columna;

    public PiezaAjedrez(int fila, int columna) {
        if (fila < 0 || fila > 7 || columna < 0 || columna > 7) {
            throw new IllegalArgumentException("Las coordenadas deben de estar entre 0 y 7");
        }

        this.fila = fila;
        this.columna = columna;
    }

    public abstract boolean mover(int nuevaFila, int nuevaColumn);
    
    public void setPosicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

}//Fin clase

//CLASE AlfilAjedrez
class AlfilAjedrez extends PiezaAjedrez {

    public AlfilAjedrez(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public boolean mover(int nuevaFila, int nuevaColumna) {
        if (Math.abs(nuevaFila - fila) == Math.abs(nuevaColumna - columna)) {
            fila = nuevaFila;
            columna = nuevaColumna;
            return true;
        }
        return false;
    }

}

//CLASE TorreAjedrez
class TorreAjedrez extends PiezaAjedrez {

    public TorreAjedrez(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public boolean mover(int nuevaFila, int nuevaColumna) {
        if (fila == nuevaFila || columna == nuevaColumna) {
            fila = nuevaFila;
            columna = nuevaColumna;
            return true;
        }
        return false;
    }

}
