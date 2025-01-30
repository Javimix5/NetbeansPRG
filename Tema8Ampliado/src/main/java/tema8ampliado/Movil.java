package tema8ampliado;

/**
 *
 * @author Javier González Prados
 */
public class Movil extends Telefono {

    private String tarifa;
    private double costeTotal;

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.costeTotal = 0.0;
    }

    @Override
    public void llama(Telefono otroTelefono, int segundos) {
        super.llama(otroTelefono, segundos);
        double costePorSegundo = getCostePorSegundo();
        costeTotal += segundos * costePorSegundo;
    }

    private double getCostePorSegundo() {
        switch (tarifa) {
            case "alfa":
                return 0.06 / 60.0;
            case "beta":
                return 0.12 / 60.0;
            case "gamma":
                return 0.30 / 60.0;
            default:
                return 0.0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - tarificados " + String.format("%.2f", costeTotal) + " euros";
    }
}
