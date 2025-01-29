

package tema8;

import java.util.Date;


/**
 *
 * @author Javier González Prados
 */

public final class CuentaPlazo extends CuentaCorriente {
    private Date fechaCreacion;

    /**
     * Constructor que inicializa la fecha de creación al día en curso.
     */
    public CuentaPlazo() {
        super();
        this.fechaCreacion = new Date();
    }

    /**
     * Sobrescribe el método retirar para que no calcule comisiones.
     * 
     * @param cantidad cantidad a retirar
     */
    
    public void retirar(double cantidad) {
        if (this.getSaldo() >= cantidad) {
            this.setSaldo((float) (this.getSaldo() - cantidad));
        } else {
            System.out.println("No hay suficiente saldo para retirar esa cantidad.");
        }
    }

    // Getters y setters
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    // ...
}