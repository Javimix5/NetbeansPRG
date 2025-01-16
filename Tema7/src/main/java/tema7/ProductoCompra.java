

package tema7;


/**
 *
 * @author Javier González Prados
 */

import java.util.ArrayList;

public class ProductoCompra {
    private String codigo;
    private String descripcion;
    private double precioUnitario;
    private int cantidad;
    private double precioTotal;

    // Constructor
    public ProductoCompra(String codigo, String descripcion, double precioUnitario, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.precioTotal = precioUnitario * cantidad;
    }

    // Métodos getters y setters
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.precioTotal = this.precioUnitario * cantidad;  // Recalcular el precio total
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion + ", Precio Unitario: " + precioUnitario
                + ", Cantidad: " + cantidad + ", Precio Total: " + precioTotal;
    }
}