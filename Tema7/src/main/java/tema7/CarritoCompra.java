

package tema7;

import java.util.ArrayList;


/**
 *
 * @author Javier González Prados
 */

public class CarritoCompra {
    
private ArrayList<ProductoCompra> productos;
    private double totalCompra;

    public CarritoCompra() {
        productos = new ArrayList<>();
        totalCompra = 0.0;
    }

    // Método para mostrar el estado del carrito
    public void mostrarEstado() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (ProductoCompra p : productos) {
                System.out.println(p);
            }
            System.out.println("Total de la compra: " + totalCompra);
        }
    }

    // Método para vaciar el carrito
    public void vaciarCarrito() {
        productos.clear();
        totalCompra = 0.0;
        System.out.println("Carrito vaciado correctamente.");
    }

    // Método para añadir un producto
    public void añadirProducto(ProductoCompra producto) {
        productos.add(producto);
        totalCompra += producto.getPrecioTotal();  // Actualizar el total
    }

    // Método para eliminar un producto por código
    public void eliminarProducto(String codigo) {
        ProductoCompra productoAEliminar = null;
        for (ProductoCompra p : productos) {
            if (p.getCodigo().equals(codigo)) {
                productoAEliminar = p;
                break;
            }
        }
        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            totalCompra -= productoAEliminar.getPrecioTotal();  // Actualizar el total
            System.out.println("Producto con código " + codigo + " eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para obtener el total de la compra
    public double getTotalCompra() {
        return totalCompra;
    }
}