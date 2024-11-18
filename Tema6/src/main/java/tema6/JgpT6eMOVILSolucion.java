
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
public class JgpT6eMOVILSolucion {

    public class MovilPrepago {

        
        public long numeroMovil;
        final private float costeEstablecLlamada;
        final private float costeMinutoLlamada;
        final private float costeConsumoMB;
        private float saldo;
        private float autonomia = 50;

        MovilPrepago(long nM, float cEL, float cML, float cMB, float s) {
            numeroMovil = nM;
            costeEstablecLlamada = cEL;
            costeMinutoLlamada = cML;
            costeConsumoMB = cMB;
            saldo = s;
        }

        /* Nuevo constructor con todos los parámetros */
        public MovilPrepago(long numeroMovil, float costeEstablecLlamada, float costeMinutoLlamada, float costeConsumoMB, float saldo, float autonomia) {
            this.numeroMovil = numeroMovil;
            this.costeEstablecLlamada = costeEstablecLlamada;
            this.costeMinutoLlamada = costeMinutoLlamada;
            this.costeConsumoMB = costeConsumoMB;
            this.saldo = saldo;
            this.autonomia = autonomia;
        }

        public float getAutonomia() { // Método get
            return autonomia;
        }

        public void setAutonomia(float autonomia) { // Método set
            if ((autonomia >= 0) && (autonomia <= 100)) {
                this.autonomia = autonomia;
            }
        }

        /* Si la autonomía es mayor que 5, se le descuenta saldo y batería */
        public void efectuarLlamada(int segundos) {
            if (autonomia > 5) {  // comprobación de la autonomia
                saldo -= Math.round(costeEstablecLlamada
                        + costeMinutoLlamada / 60f * segundos * 100f) / 100f;
                autonomia -= (segundos / 60f);
            } else {
                System.out.println("Batería insuficiente para llamar");
            }
            if (saldo < 0) {
                saldo = 0;
            }
        }

        public void navegar(int mb) { // comprobación de la autonomia
            if (autonomia > 5) { // comprobación de la autonomia
                saldo -= Math.round(costeConsumoMB * mb * 100f) / 100f;
                autonomia -= 0.01 * (mb);
            } else {
                System.out.println("Batería insuficiente para navegar");
            }
            if (saldo < 0) {
                saldo = 0;
            }
        }

        /* La recarga de la batería se hace siempre, independientemente de la parte económica */
        public boolean recargar(int importe) {
            autonomia = 100;
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
    } //fin clase
}
