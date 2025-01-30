package tema8ampliado;

/**
 *
 * @author Javier González Prados
 */
public class Telefono {

    private String numero;
    private int tiempoConversacion;

    public Telefono(String numero) {
        this.numero = numero;
        this.tiempoConversacion = 0;
    }

    public void llama(Telefono otroTelefono, int segundos) {
        this.tiempoConversacion += segundos;
        otroTelefono.tiempoConversacion += segundos;
    }

    @Override
    public String toString() {
        return "Nº " + numero + " - " + tiempoConversacion + "s de conversación";
    }
}
