package tema7;

import java.util.ArrayList;

/**
 *
 * @author Javier González Prados
 */
public class CarritoCompra {

    ArrayList<ProductoCompra> productos;
    double totalCompra;

    public CarritoCompra {
        productos = new ArrayList<>();
        totalCompra = 0.0;
    }

    // Método para mostrar el estado del carrito
    public void mostrarEstado() {
        if (productos.isEmpty()) {
            System.out.println("El carrito esta vacio.");
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
    public void anadirProducto(String codigo, String descripcion, double precioUnitario, int cantidad) {
        ProductoCompra producto = new ProductoCompra(codigo, descripcion, precioUnitario, cantidad);
        productos.add(producto);
        totalCompra += producto.precioTotal;
        System.out.println("Producto anadido: " + producto);
    }

    // Método para eliminar un producto por código
    public void eliminarProducto(String codigo) {
        ProductoCompra productoAEliminar = null;
        for (ProductoCompra producto : productos) {
            if (producto.codigo.equals(codigo)) {
                productoAEliminar = producto;
                break;
            }
        }
        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            totalCompra -= productoAEliminar.precioTotal;
            System.out.println("Producto eliminado: " + productoAEliminar);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para obtener el total de la compra
    public double getTotalCompra() {
        return totalCompra;
    }
    
}
