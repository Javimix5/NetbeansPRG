package tema8ampliado;

/**
 *
 * @author Javier González Prados
 */
public class Vehiculo {

    private String marca;
    private double precio;
    private String matricula;
    private int velocidadMaxima;

    public Vehiculo(String marca, double precio, String matricula, int velocidadMaxima) {
        this.marca = marca;
        this.precio = precio;
        this.matricula = matricula;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
