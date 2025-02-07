package tema9;

import java.util.Objects;

/**
 *
 * @author Javier González Prados
 */
public class Bicicleta {

    public String marca;
    public String modelo;
    public double precio;
    public double descuento;
    public int duracionDescuento;

    public Bicicleta(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.descuento = 0;
        this.duracionDescuento = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getDuracionDescuento() {
        return duracionDescuento;
    }

    public void setDuracionDescuento(int duracionDescuento) {
        this.duracionDescuento = duracionDescuento;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + 
                "marca= " + marca + 
                ", modelo= " + modelo + 
                ", precio= " + precio + 
                ", descuento= " + descuento + 
                ", duracionDescuento= " + duracionDescuento + 
                " meses, precio final= " + getPrecioFinal()
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bicicleta other = (Bicicleta) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (Double.doubleToLongBits(this.descuento) != Double.doubleToLongBits(other.descuento)) {
            return false;
        }
        if (this.duracionDescuento != other.duracionDescuento) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }

    //Metodo fijar descuento 10% 1 mes
    public void fijarDescuento() {
        this.descuento = 10;
        this.duracionDescuento = 1;
        System.out.printf("El descuento aplicado es de: 10 durante 1 mes");
    }

    
    //Metodo fijar X descuento 1 mes
    public void fijarDescuento(double d) {
        this.descuento = d;
        this.duracionDescuento = 1;
        System.out.printf("El descuento aplicado es de: " + d + " durante 1 mes");
    }

    
    //Metodo fijar X descuento X mes 
    public void fijarDescuento(double d, int n) {
        this.descuento = d;
        this.duracionDescuento = n;
        System.out.printf("El descuento aplicado es de: " + d + " durante " + n + (" meses"));
    }
    

    //Metodo para obtener el precio con el descuento aplicado
    public double getPrecioFinal() { 
        if (duracionDescuento > 0) {
            return precio * (1 - descuento / 100);
        }
        return precio;
    }

}
