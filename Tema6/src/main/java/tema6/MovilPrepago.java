/*
 * 6.1- A partir de la clase MovilPrepago que te proporcionará el profesor, haz un programa en el que 
se cree un teléfono con unas características determinadas y luego ejecute una serie de actividades 
como recargar 10 euros, llamar 30 segundos, navegar 10MB, etc. Viendo cómo se va modificando el 
saldo. 
Las propiedades de un móvil prepago son: 
- int numeroMovil (9 dígitos) 
- float costeMinutoLlamada (euros, con dos decimales)
- float costeConsumoMB (euros, con dos decimales) 
- float saldo (euros, con dos decimales) 
Tiene un único constructor con la siguiente firma: 
MovilPrepago(long nM, float cML, float cMB, float s) 
Los métodos son: 
- void efectuarLlamada (int segundos): reduce el saldo. Si el saldo no es suficiente, se corta la llamada 
- void navegar(int MB) análogo a efectuar una llamada 
- boolean recargar (int importe): aumenta el saldo, debe ser múltiplo de 5 euros, sino devuelve false
- float consultarSaldo () 
*/
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
import java.util.Scanner;

public class MovilPrepago {

    public long numeroMovil;
    final private float costeMinutoLlamada;
    final private float costeConsumoMB;
    private float saldo;

    MovilPrepago(long nM, float cML, float cMB, float s) {
        numeroMovil = nM;
        costeMinutoLlamada = cML;
        costeConsumoMB = cMB;
        saldo = s;
    }

    public void efectuarLlamada(int segundos) {
        saldo -= Math.round((costeMinutoLlamada / 60f * segundos) * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public void navegar(int mb) {
        saldo -= Math.round(costeConsumoMB * mb * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public boolean recargar(int importe) {
        if (importe % 5 == 0) {
            saldo += importe;
            return true;
        } else {
            return false;
        }
    }

    public float consultarSaldo() {
        return saldo;
    }

    public long getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(long numeroMovil) {
        this.numeroMovil = numeroMovil;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "MovilPrepago{" + "numeroMovil= " + numeroMovil + ", costeMinutoLlamada= " + costeMinutoLlamada + ", costeConsumoMB= " + costeConsumoMB + ", saldo= " + saldo + '}';
    }

    
}
